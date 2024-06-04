FROM openjdk:17-jdk-alpine
WORKDIR /hotel
ADD target/HotelWebsiteProject-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 80
ENTRYPOINT [ "java", "-jar", "/hotel/app.jar"]