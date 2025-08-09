\# 🚀 Day 18 – DSA Challenge



This day focuses on bit manipulation like "Base7" and "Single Number"



...



\## 📌 Problem 1: LeetCode 136 — Single Number

\*\*Difficulty:\*\* Easy  

\*\*Link:\*\* \[136. Single Number](https://leetcode.com/problems/single-number/)



\### Problem Statement

Given a \*\*non-empty\*\* array of integers `nums`, every element appears \*\*twice\*\* except for one. Find that single one.



You must implement a solution with \*\*O(n)\*\* runtime complexity and use only \*\*O(1)\*\* extra space.



\#### Example 1



Input: nums = \[2,2,1]

Output: 1





\#### Example 2

Input: nums = \[4,1,2,1,2]

Output: 4





\### Constraints

\- `1 <= nums.length <= 3 \* 10^4`

\- `-3 \* 10^4 <= nums\[i] <= 3 \* 10^4`

\- Each element appears twice except for one.



\### Approach

We can use the \*\*XOR\*\* operation:

\- `a ^ a = 0`

\- `a ^ 0 = a`

\- XOR is commutative and associative, so order doesn’t matter.

&nbsp; 

By XORing all elements together, the duplicate pairs cancel out and we are left with the single number.



\#### Code (Java)

```java

class Solution {

&nbsp;   public int singleNumber(int\[] nums) {

&nbsp;       int result = 0;

&nbsp;       for (int num : nums) {

&nbsp;           result ^= num;

&nbsp;       }

&nbsp;       return result;

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

