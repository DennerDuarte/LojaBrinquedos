# Use uma imagem oficial do Maven para a etapa de build
FROM maven:3.9.0-openjdk-17 AS build

# Defina o diretório de trabalho
WORKDIR /loja-brinquedo

# Copie o código-fonte
COPY . .

# Construa a aplicação
RUN mvn clean install

# Crie uma nova imagem para executar a aplicação
FROM openjdk:17-jdk-slim

# Exponha a porta em que a aplicação será executada
EXPOSE 8080

# Copie o arquivo WAR da etapa de build
COPY --from=build /loja-brinquedo/target/lojaBrinquedos-0.0.1-SNAPSHOT.war /app.war

# Defina o ponto de entrada para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app.war"]
