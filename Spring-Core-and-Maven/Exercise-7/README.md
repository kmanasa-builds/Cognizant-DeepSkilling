# Spring Core and Maven - Exercise 7

## Implementing Constructor and Setter Injection

### Objective

To implement both constructor-based and setter-based dependency injection using the Spring IoC Container and verify bean initialization through an XML configuration file.

---

## Scenario

The library management application requires both constructor injection and setter injection for better control over bean initialization and dependency management.

---

## Requirements

1. Configure constructor injection for `BookService`.
2. Configure setter injection for `BookRepository`.
3. Update `applicationContext.xml` to perform both injections.
4. Run the application to verify constructor and setter injection.

---

## Project Structure

```text
Exercise-7
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
│   ├── 02_constructor_setter_configuration.png
│   └── 03_output.png
│
└── README.md
```

---

## Spring Bean Configuration

The `applicationContext.xml` file configures the following beans:

- `bookRepository`
- `bookService`

The `BookService` bean demonstrates both:

- Constructor Injection using `<constructor-arg>`
- Setter Injection using `<property>`

---

## Constructor Injection

The dependency is injected through the constructor.

```java
public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
    System.out.println("Constructor Injection Executed");
}
```

---

## Setter Injection

The dependency is also injected using a setter method.

```java
public void setBookRepository(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
    System.out.println("Setter Injection Executed");
}
```

---

## XML Configuration

The Spring configuration performs both injections.

```xml
<constructor-arg ref="bookRepository"/>
<property name="bookRepository" ref="bookRepository"/>
```

---

## Application Execution

The application loads the Spring IoC Container using:

```java
ApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
```

The `BookService` bean is retrieved from the container and executed.

---

## Expected Output

```text
Constructor Injection Executed
Setter Injection Executed
BookService Bean Created
BookRepository Bean Created
Constructor and Setter Injection Successful.
```

---

## Result

Successfully implemented Constructor Injection and Setter Injection using the Spring IoC Container.

Verified:

- Spring IoC Container
- XML Bean Configuration
- Constructor-Based Dependency Injection
- Setter-Based Dependency Injection
- Successful bean initialization and execution