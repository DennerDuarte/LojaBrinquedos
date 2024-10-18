FROM maven:3.9.0-openjdk-17 AS build

# Defina o diretório de trabalho
WORKDIR /loja-brinquedo

COPY pom.xml .

# Copie o código-fonte
COPY src ./src

RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /loja-brinquedo/target/lojaBrinquedos-0.0.1-SNAPSHOT.war /app.war

ENTRYPOINT ["java", "-jar", "/app.war"]
