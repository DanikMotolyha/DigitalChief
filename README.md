# digitalchief


### [Technical task](/Тестовое%20задание%20для%20JAVA%20Trainee.pdf)
### [Postman requests](/digitalChief.postman_collection.json)
### [Create sql](/create.sql)

# Description

Две сущности : Developer и Project. Для каждого Project один Developer.
## Entities properties
### Developer
1. id
1. fio
1. phone number
1. english level (enum)
1. city
1. ready to relocate (boolean)
1. skype login
### Project
2. id
2. name
2. version
2. domain
2. documentation link
2. released (boolean)

# Getting started & Windows

### Dependencies
+ spring-boot-starter-web
+ spring-boot-starter-data-jpa
+ lombok
+ mysql-connector-j

### Requirements
 + java 17
 + gradle with java 17

### Installation and start

1. Clone the repo
```sh
git clone https://github.com/DanikMotolyha/digitalchief.git
```
2. go to the project
```sh
cd digitalchief
```
3. use gradle to start Spring Boot Application
```sh
gradle bootRun
```
