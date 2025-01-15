FROM maven:3.9.6-amazoncorretto-21 as build
LABEL authors="theolebiez"
RUN mkdir -p ./
WORKDIR ./
COPY pom.xml .
COPY src ./src
RUN mvn -f pom.xml clean package

FROM amazoncorretto:21.0.2-alpine3.19
COPY --from=build /target/*.jar app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/app.jar"]
