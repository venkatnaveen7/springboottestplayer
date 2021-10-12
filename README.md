# Player Services


The repostory contains minimal implementation for player service of a online betting application.

## API List

- GET /players -  Get all players 
- GET /players/country/{country_code}   - Get players by Country(country code)
- GET /players/continent/{continent} -  Get players in requested continent
- GET /players/rating/{rating} - Get Players having rating greater than provided


## Envornment Set Up

Service  requires Java 8 or greater to run.

Service uses H2 inmemory database to store data. 

Run application using with your favourite IDE(Eclipse or IntelliJ). You will be able 
to see data in H2 Console. H2 Console is enabled by default. 
To open H2 console, type below URL

```sh
http//localhost:8080/h2-console

JDBC_URL - jdbc:h2:mem:testdb
username- sa
password - nil (empty password)
```




For running tests

```sh
./mvnw clean test
```



## Task

-  Implement below APIs

   - GET /players/country/{country_code}  Get players by Country(country code)
   - GET /players/continent/{continent} -  Get players in requested continent
   - GET /players/rating/{rating} - Get Players having rating greater than provided
   
   At present, above APIs returns all player details

`Since we follow test driven development, test cases for above scenarios are already written and it is failing now. After the above implementation, it is expected that all test cases will be passed`

To Run test

```sh
./mvnw clean test
```
