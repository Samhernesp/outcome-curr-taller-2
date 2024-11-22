FROM openjdk:17-jdk-slim
WORKDIR /app
COPY outcome-curr-mgmt/target/outcome-curr-mgmt-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9992
ENTRYPOINT ["java", "-jar", "app.jar"]
