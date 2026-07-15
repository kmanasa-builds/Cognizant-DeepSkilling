# Spring Core and Maven - Exercise 1

## Exercise Title
Configuring a Basic Spring Application

## Objective
Develop a basic Spring Framework application for a Library Management System using XML-based configuration and the Spring IoC Container.

## Tasks Performed

- Created a Maven project named **LibraryManagement**.
- Added the Spring Core (`spring-context`) dependency in `pom.xml`.
- Created `applicationContext.xml` inside `src/main/resources`.
- Configured Spring beans for:
  - BookService
  - BookRepository
- Created the following packages:
  - `com.library.service`
  - `com.library.repository`
- Implemented:
  - `BookService`
  - `BookRepository`
- Created `LibraryManagementApplication` to load the Spring Application Context.
- Successfully executed the application and verified bean creation.

## Technologies Used

- Java 17
- Maven
- Spring Core
- IntelliJ IDEA

## Project Structure

```
LibraryManagement
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.library
│   │   │   │   └── LibraryManagementApplication.java
│   │   │   ├── com.library.service
│   │   │   │   └── BookService.java
│   │   │   └── com.library.repository
│   │   │       └── BookRepository.java
│   │   └── resources
│   │       └── applicationContext.xml
```

## Output

```
BookService Bean Created
BookRepository Bean Created
Spring IoC Container Loaded Successfully.
```

## Screenshots

- Project Structure
- applicationContext.xml
- Application Output

## Status

Exercise completed successfully.