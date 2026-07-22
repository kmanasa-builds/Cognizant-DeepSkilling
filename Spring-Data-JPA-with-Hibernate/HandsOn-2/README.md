# Spring Data JPA with Hibernate - HandsOn-2

## Objective

Implement basic CRUD operations using Spring Data JPA and Hibernate with MySQL.

## Features Implemented

### 1. Spring Data JPA - Quick Example
- Created a Spring Boot project using Spring Initializr.
- Configured MySQL database connectivity.
- Created Country entity using JPA annotations.
- Implemented CountryRepository using JpaRepository.
- Implemented CountryService.
- Retrieved all countries from the database.

### 2. Find Country by Code
- Implemented `findCountryByCode()` using `findById()`.
- Added custom exception `CountryNotFoundException`.
- Verified retrieval of country **IN (India)**.

### 3. Add New Country
- Implemented `addCountry()` using `save()`.
- Added a new country:
  - Code: **JP**
  - Name: **Japan**
- Verified insertion through both:
  - Application Console
  - MySQL Database

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL 8
- Maven
- IntelliJ IDEA
- VS Code
- Git & GitHub

---

## Project Structure

```
HandsOn-2
│
├── orm-learn
│   ├── src
│   ├── pom.xml
│   └── README.md
│
└── Screenshots
    ├── 01_project_structure.png
    ├── 02_country_service_methods.png
    ├── 03_repository_interface.png
    ├── 04_application_output.png
    └── 05_mysql_country_table.png
```

---

## Database

**Schema Name**

```
ormlearn
```

**Table**

```
country
```

| Column | Type |
|---------|------|
| code | VARCHAR(2) |
| name | VARCHAR(50) |

---

## Output Verification

Successfully verified the following:

- Retrieved all countries from the database.
- Retrieved a country using country code (**IN**).
- Added a new country (**JP - Japan**).
- Verified the inserted record in MySQL.

---

## Screenshots Included

- Project Structure
- CountryService Implementation
- CountryRepository Interface
- Application Execution Output
- MySQL Database Verification

---

## Author

**Manasa**