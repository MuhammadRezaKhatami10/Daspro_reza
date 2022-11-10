FROM openjdk:8-jdk-alpine
MAINTAINER Muhammad Reza Khatami <2041720076@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Tugas2.java /app

#compile file java
RUN javac Tugas2.java

#running java
CMD ["java","Tugas2"]
