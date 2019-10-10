## Build
```
#!bash
$ mvn package
```

## Run
```
#!bash
$ java -jar target/EventsEWSArango-0.0.1-SNAPSHOT.jar date N # date is in iso 8601 format and it's default is the current date. N is the information on the number of days (0 < N <= 99) making up the time interval within which the events to be obtained have begun. "date" is mandatory if there is "N"
``` 
