package com.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.model.Event;
import com.model.EventsArray;

public interface EventRepository extends ArangoRepository<Event, String> {

}