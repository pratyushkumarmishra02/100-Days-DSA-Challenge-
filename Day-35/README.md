\# 🚀 Day 35 – DSA Challenge



\# LeetCode 628 - Maximum Product of Three Numbers



\## Problem Statement

Given an integer array `nums`, find three numbers whose product is maximum and return the maximum product.



\### Example 1:

\*\*Input:\*\*

nums = \[1,2,3]

\*\*Output:\*\*

6





\### Example 2:

\*\*Input:\*\*

nums = \[1,2,3,4]

\*\*Output:\*\*

24





---



\## Constraints

\- `3 <= nums.length <= 10^4`

\- `-1000 <= nums\[i] <= 1000`



---



\## Approach

1\. The maximum product of three numbers can come from:

&nbsp;  - The \*\*largest three numbers\*\* (all positive or mixed).

&nbsp;  - The \*\*two smallest numbers\*\* (most negative) multiplied by the \*\*largest positive number\*\*.

&nbsp;  

2\. To solve:

&nbsp;  - Sort the array.

&nbsp;  - Compare:

&nbsp;    - Product of last three elements.

&nbsp;    - Product of first two elements and the last element.

&nbsp;  - Return the maximum of the two.



---



\## Solution (Java)

```java

class Solution {

&nbsp;   public int maximumProduct(int\[] nums) {

&nbsp;       Arrays.sort(nums);

&nbsp;       int n = nums.length;

&nbsp;       int product1 = nums\[n - 1] \* nums\[n - 2] \* nums\[n - 3];

&nbsp;       int product2 = nums\[0] \* nums\[1] \* nums\[n - 1];

&nbsp;       return Math.max(product1, product2);

&nbsp;   }

}





\### ✅ Next Goal:







I will continue the same new quest according to the array as well as the string and Linked list .





