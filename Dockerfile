FROM openjdk:17
EXPOSE 8089
ADD target/detail-service.jar detail-service.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar detail-service.jar"]
