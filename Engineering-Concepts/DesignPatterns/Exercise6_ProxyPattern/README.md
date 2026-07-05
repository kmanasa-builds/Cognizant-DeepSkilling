# Exercise 6 - Proxy Pattern

## Objective

Implement the Proxy Design Pattern to demonstrate lazy initialization and caching while loading images from a remote server.

## Scenario

Develop an image viewer application where images are stored on a remote server. Instead of loading the image immediately, a proxy object controls access to the real image and loads it only when required.

## Project Structure

```
Exercise6_ProxyPattern/
│
├── src/
│   ├── Image.java
│   ├── RealImage.java
│   ├── ProxyImage.java
│   └── Main.java
│
└── README.md
```

## Classes

### Image
- Subject interface
- Declares the `display()` method.

### RealImage
- Implements the `Image` interface.
- Simulates loading an image from a remote server.
- Displays the image.

### ProxyImage
- Implements the `Image` interface.
- Maintains a reference to `RealImage`.
- Performs lazy initialization by creating the `RealImage` object only when `display()` is called for the first time.
- Reuses the same object for subsequent requests (caching).

### Main
- Demonstrates the working of the Proxy Pattern.

## Expected Output

```
Image object created.

Loading image from remote server: Nature.jpg
Displaying image: Nature.jpg

Displaying image: Nature.jpg
```

## Concepts Used

- Proxy Design Pattern
- Lazy Initialization
- Caching
- Interfaces
- Object-Oriented Programming (OOP)

## Author

**Kondapalli Manasa**