FROM openjdk:8-jdk-alpine
MAINTAINER michaelggmanz@gmail.com
VOLUME /tmp
COPY target/*.jar app/
ENTRYPOINT ["java", "-jar", "/big_hao_ss.jar"]
EXPOSE 8090
