FROM gradle:5.6.2-jdk11 as builder

USER root

RUN mkdir contact-app 
WORKDIR /contact-app
COPY . .

RUN gradle build -x test

#Base image
FROM openjdk:11-jdk

RUN useradd app && usermod -a -G app app

RUN mkdir contact-app
WORKDIR /contact-app

RUN chown -R app:app /contact-app/
USER app

#Copy from builder for base image
COPY --from=builder --chown=app:app /contact-app/build/libs/contacts-api-0.0.1-SNAPSHOT.jar /contact-app/build/libs/

EXPOSE 8080

CMD java -jar /contact-app/build/libs/contacts-api-0.0.1-SNAPSHOT.jar
