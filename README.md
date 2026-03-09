# Second Largest Element in Array (Java)

## Problem
Given an integer array `arr`, find and return the second largest element in the array.  
If the second largest element does not exist (for example, when all elements are the same), return `-1`.

## Example

Input:
arr = [12, 35, 1, 10, 34, 1]

Output:
34

Explanation:
35 is the largest number and 34 is the second largest.

## Approach
1. Initialize two variables `largest` and `secLargest`.
2. Traverse the array once.
3. If a number is greater than `largest`, update both `largest` and `secLargest`.
4. If a number is greater than `secLargest` but not equal to `largest`, update `secLargest`.
5. If no second largest element exists, return `-1`.

## Time Complexity
O(n) – The array is traversed once.

## Space Complexity
O(1) – No extra space is used.

## Language
Java
