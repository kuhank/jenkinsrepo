FROM maven:3.8.3-openjdk-17-slim AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/target/MyClassJar-1.0.jar /app/MyClassJar.jar
ENTRYPOINT [ "java","-jar","MyClassJar.jar" ]