# Exercise 7: Financial Forecasting

## Author
Kondapalli Manasa

---

## Objective

Develop a financial forecasting application using recursion to predict future values based on a fixed annual growth rate.

---

## Scenario

A financial forecasting tool predicts future values based on historical growth. This exercise demonstrates how recursion can be used to calculate the future value over a specified number of years.

---

## Algorithm Used

### Recursive Algorithm

The recursive function repeatedly applies the annual growth rate until the number of years reaches zero (base case).

---

## Formula

Future Value = Present Value × (1 + Growth Rate)^Years

---

## Files

- FinancialForecast.java
- ForecastCalculator.java

---

## Sample Output

```
Current Value : 10000.0
Growth Rate   : 10.0%
Years         : 5
Future Value  : 16105.10
```

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Recursive Forecast | O(n) |

---

## Space Complexity

O(n)

The recursive calls use one stack frame per year.

---

## Advantages

- Demonstrates recursion clearly.
- Easy to understand and implement.
- Suitable for learning recursive algorithms.

---

## Optimization

The recursive solution can be optimized using:
- Memoization
- Dynamic Programming
- Direct mathematical formula (compound growth)

---

## Author

Kondapalli Manasa