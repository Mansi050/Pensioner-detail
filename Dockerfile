FROM public.ecr.aws/amazoncorretto/amazoncorretto:17
EXPOSE 8089
ADD target/pensioner-service-0.0.1-SNAPSHOT.jar pensioner-service-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/pensioner-service-0.0.1-SNAPSHOT.jar"]
