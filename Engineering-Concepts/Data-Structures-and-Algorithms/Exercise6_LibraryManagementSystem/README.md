# Exercise 6: Library Management System

## Scenario

You are developing a Library Management System where users can search for books efficiently by title. This exercise demonstrates the implementation of Linear Search and Binary Search algorithms.

---

## Why Search Algorithms are Important

Search algorithms help locate data quickly and efficiently.

- Linear Search checks each element one by one.
- Binary Search repeatedly divides the search space in half, making it much faster for sorted data.

---

## Algorithms Used

### Linear Search

- Searches each book sequentially.
- Works on both sorted and unsorted arrays.
- Easy to implement.

### Binary Search

- Searches only in sorted arrays.
- Divides the search range into halves.
- Much faster for large datasets.

---

## Classes

### Book

Stores:

- Book ID
- Title
- Author

### LibrarySearch

Implements:

- Linear Search
- Binary Search

### Main

- Creates sample books
- Demonstrates both search algorithms
- Displays the search results

---

## Sample Output

```
===== Linear Search =====
Book Found!
Book ID: 103
Title: Algorithms
Author: Thomas Cormen

===== Binary Search =====
Book Found!
Book ID: 103
Title: Algorithms
Author: Thomas Cormen
```

---

## Time Complexity

| Algorithm | Best | Average | Worst |
|-----------|------|---------|-------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## Comparison

| Linear Search | Binary Search |
|---------------|---------------|
| Works on unsorted data | Requires sorted data |
| Simple to implement | More efficient for large datasets |
| Slower for large arrays | Faster due to divide-and-conquer approach |

---

## Conclusion

Linear Search is suitable for small or unsorted datasets, while Binary Search provides significantly better performance for large, sorted datasets. This exercise demonstrates the importance of selecting the appropriate search algorithm based on the characteristics of the data.

---

**Author:** Kondapalli Manasa