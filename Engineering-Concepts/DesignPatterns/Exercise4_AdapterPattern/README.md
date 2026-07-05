# Exercise 4 - Adapter Pattern

## Objective

Implement the Adapter Design Pattern to integrate different payment gateways through a common interface.

## Project Structure

```
Exercise4_AdapterPattern
│
├── README.md
│
└── src
    ├── PaymentProcessor.java
    ├── PayPalGateway.java
    ├── StripeGateway.java
    ├── PayPalAdapter.java
    ├── StripeAdapter.java
    └── Main.java
```

## Description

The Adapter Pattern allows classes with incompatible interfaces to work together by converting one interface into another that the client expects.

In this exercise:

- `PaymentProcessor` is the common interface.
- `PayPalGateway` provides the `sendPayment()` method.
- `StripeGateway` provides the `makePayment()` method.
- `PayPalAdapter` adapts `PayPalGateway` to the `PaymentProcessor` interface.
- `StripeAdapter` adapts `StripeGateway` to the `PaymentProcessor` interface.

## Sample Output

```
Processing payment of ₹1500.0 using PayPal.
Processing payment of ₹2500.0 using Stripe.
```

## Concepts Covered

- Adapter Design Pattern
- Interfaces
- Object Composition
- Polymorphism
- Method Delegation

## Author

**Kondapalli Manasa**