# Exercise 3 - Sorting Customer Orders

## Objective
Sort customer orders based on their total price using different sorting algorithms.

## Scenario
You are tasked with sorting customer orders by their total price on an e-commerce platform. This helps in prioritizing high-value orders.

## Algorithms Implemented

### 1. Bubble Sort
- Compares adjacent elements and swaps them if they are in the wrong order.
- Simple to understand and implement.

### 2. Quick Sort
- Uses a pivot element to partition the array.
- Recursively sorts the sub-arrays.
- Much faster for large datasets.

## Time Complexity Comparison

| Algorithm | Best Case | Average Case | Worst Case |
|------------|------------|------------|------------|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) |

## Output
The program sorts customer orders by total price using:
1. Bubble Sort
2. Quick Sort

## Conclusion
Quick Sort is generally preferred over Bubble Sort because it provides much better performance for larger datasets and is more efficient in real-world applications.