FROM gradle:8.13-jdk17 AS build-backend
WORKDIR /simple-project/backend
COPY . /simple-project/backend
RUN ./gradlew build

FROM openjdk:17
WORKDIR /app
COPY --from=build-backend /simple-project/backend/build/libs/backend-1.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]


