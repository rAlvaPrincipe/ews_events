## Configure
On application.properties you can configure your DB and API endpoint.
For example:
```
# Webapp port
server.port = 8080

# Arango DB
arango.host=localhost
arango.port=8529
arango.user=root
arango.password=root
arango.database=_system

#API events 
API = https://virtserver.swaggerhub.com/EW-Shopp/EW-Shopp_Event_API/2.2.0/event/
```

## Build
```
$ mvn package
```

## Run
```
$ java -jar target/EventsEWSArango-0.0.1-SNAPSHOT.jar date N 
``` 
"date" is in iso 8601 format and it's default is the current date. "N" is the information on the number of days (0 < N <= 99) making up the time interval within which the events to be obtained have begun.
 "date" is mandatory if there is "N". 
 "N" is optional.




