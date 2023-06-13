# Imagen base con Java instalado
FROM openjdk:8-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Archivo build.xml y el código fuente
COPY build.xml /app
COPY src /app/src

# Instala Ant en el contenedor
RUN apk add --no-cache ant

# Compila el proyecto con Ant
RUN ant

# Especifica el comando a ejecutar cuando se inicie el contenedor
CMD ["java", "-jar", "AbsoluteLayout.jar"]
