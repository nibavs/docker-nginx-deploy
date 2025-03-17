FROM gradle:8.13-jdk17-jammy AS build-backend
WORKDIR /simple-project/backend
COPY backend /simple-project/backend
RUN ./gradlew build

FROM eclipse-temurin:17-jre-jammy AS backend-dev
COPY --from=build-backend /simple-project/backend/build/libs/backend-1.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]