package com.app;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.model.Event;
import com.model.EventsArray;
import com.repository.EventRepository;

@SpringBootApplication
@Configuration
public class EWSEventApp implements CommandLineRunner {
	
	@Autowired
	EventRepository eventRepo;
	@Value("${host}")
	private String APIHost;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EWSEventApp.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		String date = formatter.format(OffsetDateTime.now());
		int N = 0;

		if (args.length != 0) {
			date = args[0];
			if (args.length > 1)
				N = Integer.valueOf(args[1]);
		}

		RestTemplate restTemplate = new RestTemplate();
		String url = APIHost + "/EW-Shopp/EW-Shopp_Event_API/2.2.0/event/" + date + "P" + N;

		try {
			ResponseEntity<EventsArray> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<EventsArray>(){});
			EventsArray events = response.getBody();
			for(Event event : events.getEventArray()) 
				eventRepo.save(event);
	
			System.out.println(response.getStatusCode());
			System.out.println("added" + events.getEventArray().size() + " events");
		} 
		catch (final HttpClientErrorException e) {
			System.out.println(e.getStatusCode());
			System.out.println(e.getResponseBodyAsString());
		} 
		catch (HttpServerErrorException e) {
			System.out.println(e.getStatusCode());
			System.out.println(e.getResponseBodyAsString());
		}

	}

}
