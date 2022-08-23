FROM openjdk:17
EXPOSE 8089
ADD target/pensioner-detail-0.0.1-SNAPSHOT.jar pensioner-detail-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar pensioner-detail-0.0.1-SNAPSHOT.jar"]
