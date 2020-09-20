# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/#build-image)

# command to start server
# /mvnw spring-boot:run

# docker container run -p 8090:8090

# build this project
# mvn -f pom.xml clean package -DskipTests dockerfile:build

# docker tag big_hao_ss:0.0.1-SNAPSHOT michaelggmanz/big_hao_ss:latest
# docker image push michaelggmanz/big_hao_ss:latest

# kubectl create deployment kubernetes-bootcamp --image=gcr.io/google-samples/kubernetes-bootcamp:v1

# export POD_NAME=$(kubectl get pods -o go-template --template '{{range .items}}{{.metadata.name}}{{"\n"}}{{end}}')
# echo Name of the Pod: $POD_NAME

kubectl create deployment hello-node --image=michaelggmanz/big_hao_ss:latest