# Exercise 5 - Decorator Pattern

## Aim
Implement the Decorator Design Pattern to dynamically add new notification features without modifying existing classes.

## Problem Statement
A notification system initially sends notifications through Email. The system should be extended to support SMS and Slack notifications without changing the existing EmailNotifier class.

## Design Pattern Used
Decorator Pattern

## Project Structure

```
Exercise5_DecoratorPattern
│
├── README.md
└── src
    ├── Main.java
    ├── Notifier.java
    ├── EmailNotifier.java
    ├── NotifierDecorator.java
    ├── SMSNotifierDecorator.java
    └── SlackNotifierDecorator.java
```

## Output

```
=== Email Notification ===
Sending Email: Your order has been placed.

=== Email + SMS Notification ===
Sending Email: Your order has been shipped.
Sending SMS: Your order has been shipped.

=== Email + SMS + Slack Notification ===
Sending Email: Your order has been delivered.
Sending SMS: Your order has been delivered.
Sending Slack Notification: Your order has been delivered.
```

## Learning Outcome
- Understood the Decorator Design Pattern.
- Learned how to add responsibilities to objects dynamically.
- Followed the Open/Closed Principle by extending functionality without modifying existing classes.

## Author
**Kondapalli Manasa**