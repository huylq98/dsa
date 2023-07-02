# Array

## 1. What is Array?

An array is a collection of items of same data type stored at contiguous memory locations

* Fixed Memory Size.
* All elements are in the same data type.

## 2. Complexity

| Operation               | Time Complexity | Space Complexity |
|-------------------------|:---------------:|:----------------:|
| Creation                |      O(1)       |       O(n)       |
| Insertion               |      O(1)       |       O(1)       |
| Deletion                |      O(1)       |       O(1)       |
| Accessing a given index |      O(1)       |       O(1)       |
| Searching               |      O(n)       |       O(1)       |
| Traversal               |      O(n)       |       O(1)       |

## 3. Advantages/Disadvantages

Advantages:

* Random access: Accessing an element is O(1) operation.
* Memory efficiency: Better Cache Locality.

Disadvantages:

* Fixed size: New array must be created if the size needs to be increased.
* Memory allocation issues: System may run out of memory if the array's size is too large.
* Wasted space: Space's still occupied even if array is not fully populated.
* Insertion and Deletion issue: These operations may be inefficient if elements need to be shifted after the change.

## 4. Applications
* Array stores data elements of the same data type.
* Arrays are used when the size of the data set is known.
* Used in solving matrix problems.
* Applied as a lookup table in computer.
* Databases records are also implemented by the array.
* Helps in implementing sorting algorithm.
* The different variables of the same type can be saved under one name.
* Arrays can be used for CPU scheduling.
* Used to Implement other data structures like Stacks, Queues, Heaps, Hash tables, etc.