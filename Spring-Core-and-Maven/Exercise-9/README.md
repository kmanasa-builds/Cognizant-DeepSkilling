# Spring Core and Maven - Exercise 9

# Creating a Spring Boot Application

## Objective

To create a Spring Boot application for a Library Management System using Spring Initializr and implement REST APIs with Spring Web, Spring Data JPA, and H2 Database.

---

## Scenario

The Library Management System is developed using Spring Boot to simplify project configuration, dependency management, and application deployment.

---

## Technologies Used

- Java 17
- Spring Boot 4.1.0
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- IntelliJ IDEA

---

## Dependencies

- Spring Web
- Spring Data JPA
- H2 Database

---

## Project Structure

```text
Exercise-9
├── LibraryManagement
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com.library.librarymanagement
│   │   │   │       ├── controller
│   │   │   │       │   └── BookController.java
│   │   │   │       ├── entity
│   │   │   │       │   └── Book.java
│   │   │   │       ├── repository
│   │   │   │       │   └── BookRepository.java
│   │   │   │       └── LibraryManagementApplication.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   └── target
│
├── Screenshots
│   ├── 01_project_structure.png
│   ├── 02_application_properties.png
│   ├── 03_book_controller.png
│   ├── 04_application_running.png
│   └── 05_rest_api_output.png
│
└── README.md
```

---

## Configuration

The application uses an H2 in-memory database configured in `application.properties`.

```properties
spring.datasource.url=jdbc:h2:mem:librarydb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## Entity

**Book.java**

Fields:

- id
- title
- author

The entity is mapped to the database using JPA annotations.

---

## Repository

**BookRepository**

The repository extends:

```java
JpaRepository<Book, Long>
```

This provides built-in CRUD operations without writing SQL queries.

---

## REST Controller

**BookController**

Implemented REST endpoints:

| HTTP Method | Endpoint | Description |
|-------------|----------|-------------|
| GET | /books | Retrieve all books |
| POST | /books | Add a new book |
| PUT | /books/{id} | Update an existing book |
| DELETE | /books/{id} | Delete a book |

---

## Application Execution

The application is started using:

```java
SpringApplication.run(LibraryManagementApplication.class, args);
```

After successful execution:

- Spring Boot application starts on Port **8080**
- H2 Database is initialized
- Book table is created automatically
- REST endpoints become available

---

## Testing

Verified using:

```
http://localhost:8080/books
```

The GET endpoint returned:

```json
[]
```

confirming that the REST API is functioning correctly.

---

## Result

Successfully created and executed a Spring Boot application using Spring Initializr.

Verified:

- Spring Boot Project Creation
- Spring Web Configuration
- Spring Data JPA Integration
- H2 Database Configuration
- Book Entity Creation
- BookRepository Implementation
- REST Controller with CRUD Operations
- Successful Application Execution
- REST Endpoint Testing