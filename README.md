# Getting Started

## Course Instructions

To setup a Postgres database, follow the instructions defined in this website: <https://github.com/dlbunker/ps-first-spring-boot-app>

- Easiest method would be to download and run the Docker version of the database for the local machine.

### Docker Postgres Setup Steps

Create Docker container with Postgres database:

    docker create --name postgres-demo -e POSTGRES_PASSWORD=Welcome -p 5432:5432 postgres:13.0-alpine

Start container:

    docker start postgres-demo

Stop container:

    docker stop postgres-demo

Connection Info:

    JDBC URL: `jdbc:postgresql://localhost:5432/conference_app`

    Username: `postgres`

    Password: `Welcome`

Note: This stores the data inside the container - when you delete the container, the data is deleted as well.

#### Application Database Setup

Connect to PSQL prompt from docker:

    docker exec -it postgres-demo psql -U postgres

Create the Database:

    psql> create database conference_app;

Exit the PSQL database command line:

    psql> \q

Setup the Tables using Docker:

    docker cp db/create_tables.sql postgres-demo:/create_tables.sql

    docker exec -it postgres-demo psql -d conference_app -f create_tables.sql -U postgres

Install the Data using Docker:

    docker cp db/insert_data.sql postgres-demo:/insert_data.sql

    docker exec -it postgres-demo psql -d conference_app -f insert_data.sql -U postgres

## Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/#build-image)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#using-boot-devtools)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

## Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
