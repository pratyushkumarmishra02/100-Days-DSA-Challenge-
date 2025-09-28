\# 🚀 Day 48 – DSA Challenge





---



\## 📘 `README.md` for \*\*LeetCode 976. Largest Perimeter Triangle\*\*

```markdown

\# LeetCode 976. Largest Perimeter Triangle



\## Problem Statement

Given an integer array `nums`, return the \*\*largest perimeter of a triangle\*\* with a non-zero area, formed from three lengths in `nums`.  

If no such triangle can be formed, return `0`.



---



\### Example

\*\*Input:\*\*

nums = \[2,1,2]



\*\*Output:\*\*

5





---



\## Approach

\- Sort the array in ascending order.

\- Iterate from the largest element downward.

\- For every triplet `(a, b, c)`, check the triangle inequality:  

a < b + c



\- Return the first valid perimeter found.



\*\*Time Complexity:\*\* `O(n log n)`  

\*\*Space Complexity:\*\* `O(1)`



---



\## Java Solution

```java

import java.util.Arrays;



class Solution {

&nbsp; public int largestPerimeter(int\[] nums) {

&nbsp;     Arrays.sort(nums);

&nbsp;     for (int i = nums.length - 1; i >= 2; i--) {

&nbsp;         if (nums\[i] < nums\[i - 1] + nums\[i - 2]) {

&nbsp;             return nums\[i] + nums\[i - 1] + nums\[i - 2];

&nbsp;         }

&nbsp;     }

&nbsp;     return 0;

&nbsp; }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

