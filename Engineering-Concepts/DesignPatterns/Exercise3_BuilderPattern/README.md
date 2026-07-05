# Exercise 3: Builder Pattern

## Objective

Implement the Builder Design Pattern to create different configurations of a Computer object.

## Project Structure

```
Exercise3_BuilderPattern
│── README.md
└── src
    │── Computer.java
    └── BuilderPatternTest.java
```

## Features

- Uses Builder Design Pattern
- Supports method chaining
- Creates different computer configurations
- Demonstrates object construction with optional parameters

## How to Run

```bash
cd src
javac *.java
java BuilderPatternTest
```

## Expected Output

```
Computer 1 Configuration
CPU: Intel Core i7
RAM: 16 GB
Storage: 512 GB SSD
Graphics Card: Yes
WiFi: Yes

Computer 2 Configuration
CPU: AMD Ryzen 5
RAM: 8 GB
Storage: 256 GB SSD
Graphics Card: No
WiFi: Yes
```

## Design Pattern Used

The **Builder Pattern** separates the construction of a complex object from its representation. It allows step-by-step object creation using method chaining and improves code readability.

---

**Author:** Kondapalli Manasa