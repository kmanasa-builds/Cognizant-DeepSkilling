# Exercise 5: Task Management System

## Scenario

You are developing a Task Management System that helps users organize and track their tasks efficiently. The system should support adding, searching, deleting, and displaying tasks.

---

## Objective

Implement a Task Management System using a Linked List data structure to manage tasks dynamically.

---

## Why Linked Lists are Suitable

Linked Lists are useful when the number of elements changes frequently. They provide efficient insertion and deletion operations without requiring memory reallocation.

### Advantages:
- Dynamic size
- Efficient insertion and deletion
- No need for contiguous memory allocation
- Suitable for task management applications

---

## Data Structure Used

### Singly Linked List

Each task is represented as a node containing:
- Task ID
- Task Name
- Status
- Reference to the next task

---

## Features Implemented

- Add a new task
- Search for a task by ID
- Delete a task by ID
- Display all tasks
- Manage tasks dynamically using a linked list

---

## Files

### Task.java
Represents a task node containing task details.

### TaskManagementSystem.java
Contains methods for task operations such as add, search, delete, and display.

### Main.java
Driver class used to test the Task Management System.

---

## Algorithms Used

### Add Task
- Create a new task node.
- Insert it at the end of the linked list.

### Search Task
- Traverse the linked list.
- Compare task IDs until a match is found.

### Delete Task
- Locate the task node.
- Update links to remove the node from the list.

### Display Tasks
- Traverse the linked list.
- Print details of each task.

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add Task | O(n) |
| Search Task | O(n) |
| Delete Task | O(n) |
| Display Tasks | O(n) |

---

## Sample Output

```
Task added successfully.

Task List:
101 - Design Database - Pending
102 - Develop API - In Progress
103 - Testing - Pending

Task found:
102 - Develop API - In Progress

Task deleted successfully.
```

---

## Learning Outcome

This exercise demonstrates:
- Linked List implementation
- Dynamic memory management
- Searching and deletion in linked lists
- Real-world application of data structures

---

## Author


Kondapalli Manasa


Completed as part of the Cognizant Deep Skilling - Algorithms and Data Structures Program.