FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

ADD target/spring_boot_rest-0.0.1-SNAPSHOT.jar spring_boot.jar

ENTRYPOINT ["java", "-jar", "/myapp.jar"]
#docker build -t spring_boot:3 .