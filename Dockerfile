FROM openjdk:17
ARG JAR_FILE=target/*.jar
RUN mkdir /opt/spring-demo
COPY ${JAR_FILE} /opt/spring-demo/app.jar
ENTRYPOINT ["java","-jar","/opt/spring-demo/app.jar"]
