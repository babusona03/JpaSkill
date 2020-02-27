#!/bin/sh
mvn clean package && docker build -t com.learner/JpaSkill .
docker rm -f JpaSkill || true && docker run -d -p 8080:8080 -p 4848:4848 --name JpaSkill com.learner/JpaSkill 
