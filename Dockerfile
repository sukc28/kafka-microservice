FROM openjdk:17
COPY target/kafka-microservice-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
