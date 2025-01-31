# SimpleTimeService

## Overview
SimpleTimeService is a lightweight Spring Boot microservice that returns the current timestamp and the IP address of the requester in JSON format.

## Prerequisites
- Docker installed on your system
- Java 17+ (only if running locally without Docker)

## Building and Running the Application with Docker

### 1. Build the Docker Image
```sh
docker build -t simpletimeservice .
```

### 2. Run the Container
```sh
docker run -d -p 80:80 simpletimeservice
```

The service will now be accessible at:
```
http://localhost/
```

## Expected JSON Response
```json
{
  "timestamp": "2025-01-31T12:00:00.000Z",
  "ip": "192.168.1.1"
}
```

## Running Locally (Without Docker)
If you prefer to run the application directly:
```sh
mvn spring-boot:run
```
The service will be available at:
```
http://localhost/
```

## Notes
- The application runs as a non-root user inside the Docker container.
- Port 80 is exposed in the container for easy access.

## Troubleshooting
- Ensure port 80 is not already in use.
- If running on Linux, you may need `sudo` for Docker commands.
- Use `docker ps` to check if the container is running.

