# Contacts API
API for studying and applying the concepts of Gradle and K8S
## Stack
 - Java 11
 - Gradle 5.2
 - Docker
 - Kubernetes

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
-  [Update dependency manager for gradle success and fix environment local](https://github.com/felipeconceicaolopes/contacts-api/commit/9fae3df431050e63c9c40ff655090828b6bdb35a)
- [Removing maven from project](https://github.com/felipeconceicaolopes/contacts-api/commit/42a4b40703370977afccc7aca7eb361dd2e88051)

