FROM tomcat:9.0
LABEL authors="lucasbdourado"

WORKDIR /usr/local/tomcat/webapps

EXPOSE 8080

RUN apt-get update && \
    apt-get install vim -y

COPY /target .

ENTRYPOINT []

CMD ["catalina.sh", "run"]