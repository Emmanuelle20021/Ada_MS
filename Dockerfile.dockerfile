# Imagen base con Java instalado
FROM openjdk:8-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

#Archivo Java y los recursos necesarios
COPY InterfazBot.java /app/
COPY mujer4.png /app/
COPY ventana-de-chat2.png /app/

# Compilar archivo Java
RUN javac Control.java
RUN javac Datos.java

# Comando a ejecutar cuando se inicie el contenedor
CMD ["java", "InterfazBot.java"]
