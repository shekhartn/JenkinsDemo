FROM openjdk:21
EXPOSE 8989
ADD target/JenkinsDemo.jar JenkinsDemo.jar
ENTRYPOINT ["java","-jar","JenkinsDemo.jar"]