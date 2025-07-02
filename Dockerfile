# === BUILD STAGE ===
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app

# Copy pom.xml and download dependencies (build cache optimization)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source files
COPY src ./src

# Run tests using the 'test' profile (uses H2 to avoid real DB)
RUN mvn clean verify -Dspring.profiles.active=test

# === RUNTIME STAGE ===
FROM openjdk:17-jdk-slim
WORKDIR /app

# Create log directory for Logback file output
RUN mkdir -p logs

# Copy built JAR from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
