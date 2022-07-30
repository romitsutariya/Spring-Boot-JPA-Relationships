# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Guides
Up and run docekr 
sudo apt update
sudo apt install docker.io
sudo docker install postgres
docker run --name pg \
             --env POSTGRES_PASSWORD=postgres \
             --env POSTGRES_DB=studnets \
             --publish 5432:5432 \
             --detach \
             --restart unless-stopped \
             postgres
sudo docker logs pg;
sudo  docker exec -it pg psql -U postgres
create database studnets;

