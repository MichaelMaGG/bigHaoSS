FROM openjdk:8-jdk-alpine
MAINTAINER michaelggmanz@gmail.com
VOLUME /tmp
COPY target/big_hao_ss-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8090
