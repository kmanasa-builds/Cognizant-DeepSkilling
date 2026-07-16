# Spring Core and Maven - Exercise 2

## Exercise: Implementing Dependency Injection

### Objective

To implement dependency injection using Spring IoC and XML-based configuration.

### Scenario

The library management application needs to manage the dependency between `BookService` and `BookRepository` using Spring's IoC container and setter-based dependency injection.

## Implementation

### 1. XML Configuration

The `applicationContext.xml` file defines beans for:

- `BookRepository`
- `BookService`

The `BookRepository` bean is injected into the `BookService` bean using the `<property>` element.

```xml
<property name="bookRepository"
          ref="bookRepository"/>