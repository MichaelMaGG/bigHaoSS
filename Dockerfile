FROM openjdk:8-jdk-alpine
MAINTAINER michaelggmanz@gmail.com
VOLUME /tmp
COPY target/*.jar app/
ENTRYPOINT ["java", "-jar", "/app.jar"]
