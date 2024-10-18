# Use uma imagem do Ubuntu como base para a etapa de build
FROM ubuntu:latest AS build

# Atualize o repositório e instale Maven e OpenJDK 17
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    maven

# Defina o diretório de trabalho
WORKDIR /lojaBrinquedos

# Copie o pom.xml e o diretório src
COPY pom.xml .
COPY src ./src

# Construa a aplicação usando Maven
RUN mvn clean install

# Crie uma nova imagem baseada no OpenJDK slim para executar a aplicação
FROM openjdk:17-jdk-slim

# Exponha a porta em que a aplicação será executada
EXPOSE 8080

# Copie o arquivo WAR da etapa de build
COPY --from=build /lojaBrinquedos/target/lojaBrinquedos-0.0.1-SNAPSHOT.war /app.war

# Defina o ponto de entrada para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app.war"]
