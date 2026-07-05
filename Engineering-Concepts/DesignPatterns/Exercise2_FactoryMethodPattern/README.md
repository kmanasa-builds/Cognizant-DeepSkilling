# Exercise 2: Factory Method Pattern

## Objective
Implement the Factory Method Design Pattern to create different types of documents (Word, PDF, and Excel) using separate factory classes.

## Project Structure

```
Exercise2_FactoryMethodPattern
│
├── README.md
│
└── src
    ├── Document.java
    ├── WordDocument.java
    ├── PdfDocument.java
    ├── ExcelDocument.java
    ├── DocumentFactory.java
    ├── WordDocumentFactory.java
    ├── PdfDocumentFactory.java
    ├── ExcelDocumentFactory.java
    └── FactoryMethodTest.java
```

## Classes

- **Document** – Interface defining the `open()` method.
- **WordDocument** – Implements the `Document` interface.
- **PdfDocument** – Implements the `Document` interface.
- **ExcelDocument** – Implements the `Document` interface.
- **DocumentFactory** – Abstract factory class.
- **WordDocumentFactory** – Creates Word documents.
- **PdfDocumentFactory** – Creates PDF documents.
- **ExcelDocumentFactory** – Creates Excel documents.
- **FactoryMethodTest** – Tests the implementation.

## Expected Output

```
Opening Word Document...
Opening PDF Document...
Opening Excel Document...
```

## Design Pattern Used

**Factory Method Pattern**

This pattern provides an interface for creating objects while allowing subclasses to decide which object to instantiate.

---

**Author:** Kondapalli Manasa