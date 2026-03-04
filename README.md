# Lab-32-Theater-Lab

## Overview

In this lab, you will practice working with 2D arrays of objects in Java. Each seat in a theater is represented by a `Seat` object, which can be reserved or unreserved. You will implement methods to:

1. Count the number of reserved seats.
2. Toggle the reservation status of all seats in a row.
3. Check for blocks of empty seats.

This lab is designed to give you practice with nested loops, object access, and conditional logic, similar to AP Computer Science A Free Response Questions.

---

## Classes

### Seat Class (Provided for you)

The `Seat` class represents a single seat in the theater. Each seat has a boolean value indicating whether it is reserved. You do **not** need to modify this class, but you should use its methods:

- `isReserved()` → returns true if the seat is reserved
- `reserve()` → marks the seat as reserved
- `cancel()` → marks the seat as unreserved
- `toggle()` → changes the reservation status (reserved → unreserved, or unreserved → reserved)

### Theater Class

The `Theater` class contains a 2D array of `Seat` objects. You will implement the following methods:

#### Part (a) – Count Reserved Seats

```java
public int countReservedSeats()
```

- Returns the total number of reserved seats in the theater.
- Use nested loops to traverse all rows and columns.
- Use `Seat` object methods to check if a seat is reserved.

#### Part (b) – Toggle a Row

```java
public void toggleRow(int row)
```

- Toggles the reservation status of all seats in the given row.
- If a seat is reserved, it becomes unreserved; if it is unreserved, it becomes reserved.

#### Part (c) – Check for a Block of Empty Seats

```java
public boolean hasNBlankSeats(int row, int n)
```

- Returns true if there is a block of n consecutive unreserved seats in the specified row.
- Returns false otherwise.
- Hint: keep track of the number of consecutive unreserved seats as you loop through the row.

---

## Tester code provided

- A `Theater` object with a reasonable number of rows and columns has been provided.  Alter the test case to test edge cases to check your code.
- Test edge cases:
    - A row with all seats reserved.
    - A row with all seats unreserved.
    - Checking for a block of seats longer than the row.

---

## Notes

- Use object methods rather than manipulating boolean values directly.
- This lab is designed to mirror AP-style 2D array and object-oriented problems.
