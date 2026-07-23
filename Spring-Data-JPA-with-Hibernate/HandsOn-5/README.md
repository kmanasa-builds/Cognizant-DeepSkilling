# HandsOn-5: Spring Data JPA with Hibernate

## Objective
This hands-on demonstrates the use of Spring Data JPA with Hibernate to perform different types of database queries using HQL and Native SQL.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- VS Code

## Database
Database Name: `ormlearn`

Tables Used:
- employee
- department
- skill
- employee_skill

## Features Implemented

### Exercise 1: HQL Query
- Retrieve all permanent employees.
- Fetch associated department and skills using HQL JOIN FETCH.

### Exercise 2: Aggregate Function
- Calculate the average salary of employees belonging to a department.
- Used HQL AVG() function.

### Exercise 3: Native SQL Query
- Retrieve all employees using a Native SQL query.
- Display employee details.

## Project Structure

```
src
 ├── model
 ├── repository
 ├── service
 ├── OrmLearnApplication.java
 └── resources
```

## Screenshots Included

1. Project Structure
2. EmployeeRepository HQL Query
3. HQL Average Salary Output
4. Native Query Output

## Output

The application executes successfully and displays:

- Permanent Employees
- Average Salary
- Employee List using Native SQL Query

## Result

Successfully implemented Spring Data JPA queries using:
- HQL
- Aggregate Functions
- Native SQL Queries

Application executed successfully without errors.