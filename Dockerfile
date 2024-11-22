FROM openjdk:17-jdk-slim

WORKDIR /app

COPY outcome-curr-mgmt/target/outcome-curr-mgmt-1.0-SNAPSHOT.jar app.jar

EXPOSE 9992

ENTRYPOINT ["java", "-jar", "app.jar"]
