FROM openjdk:11-jre-slim
MAINTAINER Daniele Valentini
COPY target/spring-app-security-0.0.1-SNAPSHOT.jar spring-app-security-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-app-security-0.0.1-SNAPSHOT.jar"]