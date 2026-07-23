# HandsOn-4: O/R Mapping using Spring Data JPA with Hibernate

## Overview
This project demonstrates Object-Relational (O/R) Mapping using Spring Data JPA and Hibernate with a MySQL database. It covers different types of entity relationships and CRUD operations.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven
- IntelliJ IDEA

## Database
Database Name:
```
ormlearn
```

## Entity Relationships

### 1. Many-to-One
- Employee → Department

Each Employee belongs to one Department.

### 2. One-to-Many
- Department → Employees

A Department can have multiple Employees.

### 3. Many-to-Many
- Employee ↔ Skill

An Employee can have multiple Skills, and a Skill can belong to multiple Employees.

## Project Structure

```
src
 ├── model
 │     ├── Country.java
 │     ├── Department.java
 │     ├── Employee.java
 │     └── Skill.java
 │
 ├── repository
 │     ├── CountryRepository.java
 │     ├── DepartmentRepository.java
 │     ├── EmployeeRepository.java
 │     └── SkillRepository.java
 │
 ├── service
 │     ├── CountryService.java
 │     ├── DepartmentService.java
 │     ├── EmployeeService.java
 │     └── SkillService.java
 │
 └── OrmLearnApplication.java
```

## Hands-On Tasks Completed

- Retrieve Employee with Department
- Add Employee
- Update Employee
- Retrieve Department with Employees
- Retrieve Employee with Skills
- Add Skill to Employee

## Database Tables

- country
- department
- employee
- skill
- employee_skill

## Features
- Entity Mapping using JPA Annotations
- CRUD Operations
- Transaction Management
- Repository Pattern
- Service Layer Implementation
- Hibernate ORM Integration
- MySQL Database Connectivity

## Output
The application successfully performs:
- Fetching Employee details
- Fetching Department along with Employees
- Fetching Employee along with Skills
- Adding a new Employee
- Updating Employee details
- Assigning Skills to Employees

## Author

**Kondapalli Manasa**