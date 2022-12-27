FROM openjdk:8
EXPOSE 5000
ADD ./target/userService-0.0.1-SNAPSHOT.jar userService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","userService-0.0.1-SNAPSHOT.jar"]
