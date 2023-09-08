FROM openjdk:8-jdk-alpine
VOLUME /temp
ADD target/createDockerImage-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar","/app.jar" ]