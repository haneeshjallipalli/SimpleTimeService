# Opne JDK base image
FROM openjdk:17-jdk-slim

# Creating a non-root user
RUN groupadd -r appgroup && useradd -r -g appgroup appuser

# Set the working directory
WORKDIR /app

# Copy the application JAR file from jars directory
COPY jars/simpletimeservice-0.0.1-SNAPSHOT.jar app.jar

# Change ownership and permissions
RUN chown -R appuser:appgroup /app && chmod +x /app/app.jar

# Switch to non-root user
USER appuser

# Expose the application port
EXPOSE 80

# Command to run the application
CMD ["java", "-jar", "/app/app.jar"]
