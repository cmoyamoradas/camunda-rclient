# REST Client Application

This REST client application has been created using [Spring WebFlux framework](https://docs.spring.io/spring-framework/reference/web-reactive.html)

## What it does

The application simply calls the REST endpoint https://reqres.in/api/users?page=1

## How to build it

This project uses Maven as package manager so just run the following command from the root folder:
```
$ mvn clean package
``` 

NOTE: Before running the command, be sure to retrieve the certificate/s from https://reqres.in and import it/them into the cacerts truststore of the JRE you are working with.

## How to run it

Run the following command from a terminal:
```
$ java -DbaseUrl="https://reqres.in" -jar target/rclient-1.0-SNAPSHOT.jar
``` 

You should have an output like this:
```
2023-05-26 08:52:29.211  INFO   --- [           main] acme.camunda.CamundaClientApplication    : [id: 1 || firstName: George || lastName: Bluth || email: george.bluth@reqres.in]
2023-05-26 08:52:29.213  INFO   --- [           main] acme.camunda.CamundaClientApplication    : [id: 2 || firstName: Janet || lastName: Weaver || email: janet.weaver@reqres.in]
2023-05-26 08:52:29.213  INFO   --- [           main] acme.camunda.CamundaClientApplication    : [id: 3 || firstName: Emma || lastName: Wong || email: emma.wong@reqres.in]
2023-05-26 08:52:29.213  INFO   --- [           main] acme.camunda.CamundaClientApplication    : [id: 4 || firstName: Eve || lastName: Holt || email: eve.holt@reqres.in]
2023-05-26 08:52:29.213  INFO   --- [           main] acme.camunda.CamundaClientApplication    : [id: 5 || firstName: Charles || lastName: Morris || email: charles.morris@reqres.in]
2023-05-26 08:52:29.213  INFO   --- [           main] acme.camunda.CamundaClientApplication    : [id: 6 || firstName: Tracey || lastName: Ramos || email: tracey.ramos@reqres.in]
``` 