FROM eclipse-temurin:21-jre-alpine

RUN apk add --no-cache curl

WORKDIR /app

COPY build/libs/*.jar tl04_service.jar

EXPOSE 4000

ENTRYPOINT ["java","-jar","/app/tl04_service.jar"]
