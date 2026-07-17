# Spring Core and Maven - Exercise 4

## Creating and Configuring a Maven Project

### Objective

To create a Maven project for the Library Management application, add the required Spring Framework dependencies, and configure the Maven Compiler Plugin for Java 1.8.

---

## Requirements

1. Create a new Maven project named `LibraryManagement`.
2. Add the following Spring dependencies:
   - Spring Context
   - Spring AOP
   - Spring WebMVC
3. Configure the Maven Compiler Plugin for Java 1.8.

---

## Implementation

### 1. Maven Project Creation

A new Maven project named `LibraryManagement` was created using IntelliJ IDEA.

Project details:

- **Group ID:** `com.library`
- **Artifact ID:** `LibraryManagement`
- **Version:** `1.0-SNAPSHOT`

---

### 2. Spring Dependencies

The following Spring dependencies were added to the `pom.xml` file:

#### Spring Context

Used for Spring IoC container and application context functionality.

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.1.10</version>
</dependency>