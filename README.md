
# Contacts API
API for studying and applying the concepts of Gradle and K8S
## Stack
 - Java 11
 - Gradle 5.2
 - Docker
 - Kubernetes

## Installation

How to build docker image and execute docker-compose

For building image
`sudo docker-compose -f devops/docker/docker-compose.yml build`

For execute
`sudo docker-compose -f devops/docker/docker-compose.yml up`

Example
`http://localhost:8080/swagger-ui.html`


# Documentation

## Overview Gradle
In our Java applications, we have several files and dependencies which make it difficult to build these applications. With Gradle we might easy building, deployment and manage our dependencies. Another advantage over your concurrent this the fact what Gradle is much less verbose, in this way the archive created by the Gradle is much minos what the created by the Maven, the famous "pom.xml", because the Gradle was created based in language Groovy.

### Gradle Features
- VM utilization;
- "Programming" as used language Groovy;
- Utilized with other languages that have VM as Kotlin;
- Building graph of tasks;
- Executing tasks neatly;
- Output for each task, if output has the same result, do not executed for improvements of performance;
- Manage dependencies;
- Use maven central repository;
- With Gradle we might get values of environments variables and system variables for used in our tasks and building validations;
- We can broken build in archives, with example can having one archive for our tasks gradle;

### Gradke Structure

In archive `build.gradle` we have:
- plugins: For put java versions and Spring version like this project, we can put others plugins;
- Group: Resembles artifact-id of Maven;
- version: Version of our project;
- sourceCompatibility: Version of our Java;
- repositories: Repository for download our's dependencies;
- dependencies: All our dependencies;

### Maven to gradle commits
- [Replace maven to gradle WIP](https://github.com/felipeconceicaolopes/contacts-api/commit/191277a191a2e6a2aa0cfdae6d21f49111d7eed2)
-  [Update dependency manager for gradle success and fix environment local](https://github.com/felipeconceicaolopes/contacts-api/commit/9fae3df431050e63c9c40ff655090828b6bdb35a)
- [Removing maven from project](https://github.com/felipeconceicaolopes/contacts-api/commit/42a4b40703370977afccc7aca7eb361dd2e88051)

## Overview Kubernetes
Kubernetes is effectively a containers manager, before with docker-compose i needed to define how many containers i will have for my application, but thinking about scalability a better solution is Kubernetes. 
In kubernetes we have a Master where will i have my settings of services, he will managed my Nodes, which are basically other services with my containers, in that case, if my node "die" my Master will have configurations needed to recreate my Node.

### Kubernetes Structure
- Pod - The smallest structure of Kubernetes, thats does not mean that we have just one container, but for good practices this recommended;
- Deployment - The structure that will abstract one Pod, this way allowing the Pod to be self-managed, this way if Pod "dies" it will be recreated automatically.
- Service - The Service object allowing access a my Pod by providing an IP, because the Pod is a very mutable object that is constantly "dying" and being recreated. This way Kubernetes abstracts it from the Service, which is a more stable object. He even works as a Load Balance redirecting our requests.
- StatefulSet - Object that abstracts a Pod and will map our volumes so we don't lose configuration files and data.
- Permissions - Allows only Pod of DB might read and write in our Volume;

### K8S commits
- [Add k8s configs](https://github.com/felipeconceicaolopes/contacts-api/commit/c24c5013db15e8e063bf2f86edbe0be248adcac6)