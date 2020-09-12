# spring-docker
spring docker


# version
docker --version

# stop
docker stop
docker stop <my_container_id>


# images
docker ps --all
docker images
docker images -a
docker images --format "{{.ID}}: {{.Repository}}"
docker images --format "{{.ID}}: {{.Repository}}"
docker images --format "table {{.ID}}\t{{.Repository}}\t{{.Tag}}"

# stats
docker stats 
docker stats --format "{{.Container}}: {{.CPUPerc}}"
docker stats --all --format "table {{.Container}}\t{{.CPUPerc}}\t{{.MemUsage}}"

# pull
docker pull 

# run
docker run

# rabbitmq
docker pull rabbitmq:3-management
docker run -d -p 15672:15672 -p 5672:5672 --name rabbit-test-for-medium rabbitmq:3-management
http://localhost:15672/#/

# postgres
docker pull postgres
docker run --name some-postgres -e POSTGRES_PASSWORD=danilo -d postgres

# remove
docker rmi -f <IMAGE_ID>

# calc-age
docker build -t spring/spring-boot-calc-age .
docker run -p 8080:8080 spring/spring-boot-calc-age

docker tag 91f9a54b66cb tidanilocarvalho/spring-boot-calc-age:calc-age

docker push tidanilocarvalho/spring-boot-calc-age
