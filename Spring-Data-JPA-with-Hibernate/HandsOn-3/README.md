# HandsOn-3: Spring Data JPA Query Methods

## Objective

Implement query methods using Spring Data JPA to retrieve data from the `country` table based on different search criteria.

---

## Prerequisites

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL 8.x
- Maven
- IntelliJ IDEA / VS Code

---

## Database

**Schema:** `ormlearn`

**Table:** `country`

### Sample Data

| Code | Name |
|------|--------------------------|
| IN | India |
| JP | Japan |
| US | United States of America |

---

## Features Implemented

### 1. Search Countries by Name

Implemented the query method:

```java
findByNameContaining(String text)
```

Searches all countries whose names contain the given text.

---

### 2. Search Countries by Name (Sorted)

Implemented the query method:

```java
findByNameContainingOrderByNameAsc(String text)
```

Searches countries containing the given text and returns the results in ascending order by country name.

---

### 3. Search Countries Starting With

Implemented the query method:

```java
findByNameStartingWith(String alphabet)
```

Retrieves countries whose names start with the specified alphabet.

---

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Java

---

## Output

Successfully executed all three Spring Data JPA query methods.

- Search Countries by Name
- Search Countries by Name (Sorted)
- Search Countries Starting With

Console output screenshots are available in the `Screenshots` folder.

---

## Project Structure

```
HandsOn-3
│
├── orm-learn
├── Screenshots
├── README.md
```

---

## Conclusion

Successfully implemented and tested Spring Data JPA derived query methods using Hibernate and MySQL.