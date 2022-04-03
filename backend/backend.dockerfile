## alpine linux with JRE
FROM openjdk:11

## copy the spring jar
COPY backend/target/*.jar /opt/myApp.jar

CMD ["java", "-jar", "/opt/myApp.jar"]