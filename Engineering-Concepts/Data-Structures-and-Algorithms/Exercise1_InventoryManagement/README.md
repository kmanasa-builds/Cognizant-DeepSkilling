# Exercise 1: Inventory Management System

## Scenario
You are developing an inventory management system for a warehouse. Efficient data storage and retrieval are crucial.

---

## Why Data Structures and Algorithms are Essential

Data structures and algorithms help in storing, retrieving, updating, and deleting products efficiently. They improve performance and make handling large inventories easier.

---

## Suitable Data Structures

Some suitable data structures are:

1. ArrayList
2. LinkedList
3. HashMap
4. TreeMap

In this exercise, HashMap is used because it provides fast access, insertion, updation, and deletion operations.

---

## Product Class

Attributes:

- productId
- productName
- quantity
- price

---

## Operations Implemented

### Add Product

Adds a product to the inventory.

### Update Product

Updates quantity and price of an existing product.

### Delete Product

Removes a product from inventory.

---

## Time Complexity Analysis

| Operation | Complexity |
|------------|------------|
| Add | O(1) |
| Update | O(1) |
| Delete | O(1) |
| Search | O(1) |

---

## Optimization

HashMap uses hashing, which allows constant-time operations. This makes it suitable for handling large inventories efficiently.

---

## Conclusion

HashMap is an efficient data structure for inventory management because it provides fast insertion, deletion, updation, and searching operations.