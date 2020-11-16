FROM openjdk:11 as builder
WORKDIR application
COPY ./pom.xml ./pom.xml
COPY mvnw .
COPY .mvn .mvn
COPY ./src ./src
RUN ["chmod", "+x", "mvnw"]
RUN ./mvnw dependency:go-offline -B
RUN ./mvnw clean package && cp target/git-hub-buscador-SNAPSHOT.jar git-hub-buscador-SNAPSHOT.jar
RUN java -Djarmode=layertools -jar git-hub-buscador-1.0-SNAPSHOT.jar extract
#ENTRYPOINT ["java","-jar", "git-hub-buscador-SNAPSHOT.jar"]
