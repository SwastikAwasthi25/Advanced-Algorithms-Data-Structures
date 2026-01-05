# LeetCode 1390 – Sum of Four Divisors

## Problem Description
Given an integer array `nums`, return the sum of divisors of all elements that have **exactly four divisors**.  
If an element does not have exactly four divisors, it is ignored.

---

## Core Insight
Divisors of a number always appear in **pairs**.

If `d` is a divisor of `n`, then `n / d` is also a divisor.  
Because of this property, it is sufficient to check divisors only up to **√n**.

This reduces unnecessary computations and avoids brute-force checking.

---

## Approach Explanation

For each number in the array:

1. Iterate from `1` to `√n` to find divisors.
2. When a divisor `j` is found:
   - If `j * j == n`, it contributes **one divisor**.
   - Otherwise, it contributes **two divisors** (`j` and `n / j`).
3. Maintain:
   - A counter for the number of divisors.
   - A running sum of the divisors.
4. If the divisor count exceeds `4`, stop early and discard the number.
5. After the loop:
   - If the total divisor count is exactly `4`, add the divisor sum to the final answer.

---

## Example Walkthrough

### Input





### Analysis
- **21**
  - Divisors: `1, 3, 7, 21`
  - Exactly 4 divisors → sum = `32` ✔
- **4**
  - Divisors: `1, 2, 4`
  - Only 3 divisors → ignored ✘
- **7**
  - Divisors: `1, 7`
  - Only 2 divisors → ignored ✘

### Output




---

## Complexity Analysis
- **Time Complexity:** `O(n × √k)`
  - `n` = number of elements in the array  
  - `k` = value of the current number
- **Space Complexity:** `O(1)`
  - Only constant extra space is used

---

## Why This Solution Is Efficient
- Avoids brute-force divisor checking.
- Uses mathematical properties of divisor pairs.
- Handles perfect square edge cases correctly.
- Stops early when divisor count exceeds four.

---

## Problem Link
https://leetcode.com/problems/sum-of-four-divisors/

