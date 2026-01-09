# Sliding Window Pattern

## When to Use
- Problems involving subarrays or substrings
- Contiguous elements
- Questions asking for:
  - Maximum / Minimum
  - Longest / Shortest
- Constraints like:
  - Sum >= K
  - At most K elements
  - Fixed window size

---

## Types of Sliding Window

### 1. Fixed Size Window
Window size remains constant.

**Examples:**
- LeetCode 643 – Maximum Average Subarray
- LeetCode 1343 – Number of Subarrays with Average >= Threshold

**Approach:**
- Compute sum of first `k` elements
- Slide the window:
  - Add next element
  - Remove previous element
- Check condition for every window

---

### 2. Variable Size Window
Window size changes dynamically.

**Examples:**
- LeetCode 209 – Minimum Size Subarray Sum
- LeetCode 1004 – Max Consecutive Ones III

**Approach:**
- Expand window using right pointer
- When constraint is satisfied:
  - Try to minimize window using left pointer
- Window is never reset, only shrunk

---

## Golden Rules
- Right pointer always moves forward
- Left pointer moves only when constraint is violated
- Never reset sum or counters
- Nested while loops still run in O(n) time (amortized)

---

## Common Mistakes
- Resetting the window ❌
- Modifying k directly ❌
- Using brute force ❌
- Incorrect shrink condition ❌

---

## Problems Covered

### Fixed Window
- LC 643 – Maximum Average Subarray
- LC 1343 – Subarrays with Avg >= Threshold

### Variable Window
- LC 209 – Minimum Size Subarray Sum
- LC 1004 – Max Consecutive Ones III
