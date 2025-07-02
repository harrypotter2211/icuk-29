# === BUILD STAGE ===
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app

# Copy pom.xml and download dependencies first (cache efficiency)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy full project
COPY src ./src

# Run tests with `test` profile using H2 and then package the app
RUN mvn clean verify -Dspring.profiles.active=test

# === RUNTIME STAGE ===
FROM openjdk:17-jdk-slim
WORKDIR /app

# Create logs directory for Logback file logging
RUN mkdir -p logs

# Copy JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose Spring Boot app port
EXPOSE 8080

# Launch the application
ENTRYPOINT ["java", "-jar", "app.jar"]
