# service-connector-app

## Name
Service Connector Example

## Description
This is an example of Service Connector Skeleton implementation based on Spring Boot and Apache Camel

## Installation for devs and starting the application
Build and run as Maven project

	mvn spring-boot:run

## building and starting the application on docker environment
	docker build . -t service-connector-app
 
	docker run -p 8080:8080 -d service-connector-app