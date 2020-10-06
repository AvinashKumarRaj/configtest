FROM openjdk:8

EXPOSE 8080

COPY ./target/*.jar app.jar

ADD server.crt /usr/local/share/ca-certificates/server.crt

RUN chmod 644 /usr/local/share/ca-certificates/server.crt && update-ca-certificates

CMD ["java","-jar","app.jar"]
