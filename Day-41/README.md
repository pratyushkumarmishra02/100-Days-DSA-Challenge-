\# 🚀 Day 41 – DSA Challenge



\# LeetCode 1304 — Find N Unique Integers Sum up to Zero



\*\*Difficulty:\*\* Easy  

\*\*Topics:\*\* Array, Math



---



\## Problem Statement



Given an integer `n`, return \*\*any array\*\* containing `n` unique integers such that the sum of the integers is exactly `0`.



\### Example 1

Input: n = 5

Output: \[-7, -1, 1, 3, 4] // sum = 0





\### Example 2

Input: n = 3

Output: \[-1, 0, 1]





> Multiple valid outputs are allowed.



---



\## Key Insight



\- To make numbers sum to `0`, use \*\*pairs\*\* of positive and negative integers.  

&nbsp; Example: `1 + (-1) = 0`, `2 + (-2) = 0`, etc.

\- If `n` is \*\*even\*\*, you can just form `n/2` such pairs.  

\- If `n` is \*\*odd\*\*, you include `0` in addition to the pairs.



This guarantees:

\- All numbers are unique.

\- The sum is always `0`.



---



\## Algorithm



1\. Initialize an empty array `res`.

2\. If `n` is odd, add `0` to the array.

3\. Add pairs `(i, -i)` for `i` from `1` to `n//2`.

4\. Return the array.



\*\*Time Complexity:\*\* `O(n)`  

\*\*Space Complexity:\*\* `O(n)`



---



\## Code Implementations



\### Java Solution

```java

class SumZero {

&nbsp;   public int\[] sumZero(int n) {

&nbsp;       int ans\[] = new int\[n];

&nbsp;       int sum =0;

&nbsp;       for(int i=1;i<n;i++){

&nbsp;           ans\[i-1] = i;

&nbsp;           sum+=i;

&nbsp;       }

&nbsp;       ans\[n-1] = -1\*sum;

&nbsp;       return ans;

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

