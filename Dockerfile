FROM openjdk:17-oracle

EXPOSE 8081

ADD target/docker-example.jar docker-example.jar

ENTRYPOINT ["java", "-jar", "docker-example.jar"]