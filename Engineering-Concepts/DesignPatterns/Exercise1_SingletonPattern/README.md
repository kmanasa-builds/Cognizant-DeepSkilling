# Exercise 1: Singleton Pattern

## Author
Kondapalli Manasa

---

## Objective

Implement the Singleton Design Pattern to ensure that only one instance of the Logger class exists throughout the application lifecycle.

---

## Scenario

A logging utility should maintain a single instance so that all parts of the application use the same logger, ensuring consistent logging.

---

## Design Pattern

### Singleton Pattern

The Singleton Pattern restricts the instantiation of a class to a single object and provides a global access point to that instance.

---

## Project Structure

```
Exercise1_SingletonPattern
│
├── README.md
└── src
    ├── Logger.java
    └── SingletonTest.java
```

---

## Files

### Logger.java

- Implements the Singleton Pattern.
- Contains a private constructor.
- Provides a public static `getInstance()` method.
- Includes a `log()` method.

### SingletonTest.java

- Tests the Singleton implementation.
- Verifies that only one Logger object is created.

---

## Sample Output

```
Logger instance created.
LOG: Application started.
LOG: User logged in.

Both logger objects are the same instance.
```

---

## Advantages

- Ensures only one object exists.
- Saves memory.
- Provides global access to the instance.
- Useful for logging, configuration, and caching.

---

## Applications

- Logging Frameworks
- Configuration Managers
- Database Connections
- Cache Managers

---

## Author

Kondapalli Manasa