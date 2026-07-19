# Spring Core and Maven - Exercise 5

## Configuring the Spring IoC Container

### Objective

To configure the Spring IoC (Inversion of Control) Container using an XML configuration file, define beans for the service and repository classes, perform setter-based dependency injection, and verify the configuration by running the application.

---

## Scenario

The library management application requires a central configuration for managing beans and dependencies using the Spring IoC Container.

---

## Requirements

1. Create an XML configuration file named `applicationContext.xml` in the `src/main/resources` directory.
2. Define beans for:
   - `BookService`
   - `BookRepository`
3. Configure setter-based dependency injection.
4. Create a main class to load the Spring context and test the configuration.

---

## Project Structure

```text
Exercise-5
├── LibraryManagement
│   ├── .gitignore
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com.library
│       │   │       ├── LibraryManagementApplication.java
│       │   │       ├── repository
│       │   │       │   └── BookRepository.java
│       │   │       └── service
│       │   │           └── BookService.java
│       │   └── resources
│       │       └── applicationContext.xml
│       └── test
│           └── java
│
├── Screenshots
│   ├── 01_project_structure.png
│   ├── 02_application_context.png
│   └── 03_output.png
│
└── README.md
```

---

## Spring Configuration

The `applicationContext.xml` file defines the Spring beans and configures dependency injection.

### Configured Beans

- `bookRepository`
- `bookService`

The `bookRepository` bean is injected into `bookService` using setter injection.

---

## Dependency Injection

The `BookService` class contains a setter method for dependency injection.

```java
public void setBookRepository(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
}
```

Spring injects the `BookRepository` bean through this setter using the XML configuration.

---

## Application Execution

The `LibraryManagementApplication` class loads the Spring IoC Container using:

```java
ApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
```

The `BookService` bean is retrieved from the container and executed.

---

## Expected Output

```text
BookService Bean Created
BookRepository Bean Created
Spring IoC Container Loaded Successfully.
```

---

## Result

Successfully configured the Spring IoC Container using XML configuration.

Successfully implemented:

- Spring IoC Container
- XML Bean Configuration
- Setter-Based Dependency Injection
- Bean Management using Spring Framework

The application executed successfully, confirming that the Spring container correctly managed and injected the required beans.