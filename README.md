# airavata
Mirror of Apache Airavata

##Prerequisites:
Docker Installed System.  
Follow https://docs.docker.com/engine/installation/linux/ubuntulinux/ to install docker.  
Clone this branch.

##Images
* avtbase    
Airavta base image which bundles Oracle Java 8 (Version 8u31), maven (3.3.9) and git on latest centos image.  
* airavataservices  
Image that builds airavata. It can be used to run invidual component or all the comonents at once.
* maridb  
Creates airavata specific mariadb images. Basically creates all the required databases. 
* rabbitmq  
rabbitmq images with airavata specific configuration.  

##Build Instructions:

Use below commands to build docker images. 
Execute these commands under appropriate directories.  
For example, to build airavata base docker image goto avtbase/ and execute docker build command, the same follows for all.

* Create base image for airavata.  
docker build -t avtbase .

* Create MariaDB image with airavata specific database script.   
docker build -t mariadb .

* Create RabbitMQ image with airavata specific configuration.    
docker build -t rabbitmq .

Before creating airavata component images download and place mysql-connector-java-5.1.39-bin.jar at the same level of the dockerfile.  
Also, update airavata-server.properties file as required.  
* Create apiserver image.  
docker build --build-arg COMPONENT=apiserver -t apiserver

* Create gfac image.  
docker build --build-arg COMPONENT=gfac -t gfac

* Create orchestrator image.  
docker build --build-arg COMPONENT=orchestrator -t orchestrator

* Create credentialstore image.  
docker build --build-arg COMPONENT=credentialstore -t credentialstore

OR

* Create image which comtains all the components.  
docker build --build-arg COMPONENT=all -t avtall


##Running Docker Containers:

* Run MariaDB with default user as 'airavata' on 3306.  
docker run --name mariadb -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -e MYSQL_USER=airavata -e MYSQL_PASSWORD=airavata -p 3306:3306 -d mariadb

* Run RabbitMQ with default user as 'airavata'.  
docker run -d --hostname my-rabbit -p 15672:15672 -p 5672:5672 --name some-rabbit -e RABBITMQ_DEFAULT_USER=airavata -e RABBITMQ_DEFAULT_PASS=airavata rabbitmq

* Run zookeeper. This image can be use as is without any configuration changes.  
docker run -d --name=exhibitor -p 2181:2181 -p 2888:2888 -p 3888:3888 -p 8080:8080 netflixoss/exhibitor:1.5.2

* update airavata-server.properties as required.  

* Run airavata components as they are built. Make sure a tag name is same as that of built image. One can use below commands to reun individual components.   
docker run -t apiserver  
docker run -t gfac  
docker run -t orchestrator  
docker run -t credentialstore  

OR  
* Use below command to run all the components at once.   
docker run -t avtall  

###Usefull docker commands:
* List all existing images.  
docker images
* List all containers.  
docker ps -a
* Remove container.  
docker rm 'container-id'  
* Remove image.    
docker rmi 'image-id'

