\# 🚀 Day 25 – DSA Challenge



On this day, I have solved an array-related problem that is "Missing value"



...



\# LeetCode 268 - Missing Number



\## Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `\[0, n]`,  

return the only number in the range that is missing from the array.



\### Example 1:

\*\*Input:\*\*  

nums = \[3, 0, 1]



\*\*Output:\*\*  

2





\### Example 2:

\*\*Input:\*\*  

nums = \[0, 1]



\*\*Output:\*\*  

2





---



\## Constraints:

\- `n == nums.length`

\- `1 <= n <= 10^4`

\- `0 <= nums\[i] <= n`

\- All the numbers of `nums` are unique.



---



\## Approach



\### \*\*1. Mathematical Formula Approach (Sum Method)\*\*

\- The sum of the first `n` natural numbers is:



sum\_n = n \* (n + 1) / 2



\- Subtract the sum of all elements in `nums` from `sum\_n`.

\- The result will be the missing number.



\*\*Time Complexity:\*\* `O(n)`  

\*\*Space Complexity:\*\* `O(1)`



---



\### \*\*2. XOR Approach\*\*

\- XOR all numbers from `0` to `n` with all numbers in `nums`.

\- Since `x ^ x = 0` and `x ^ 0 = x`, the remaining number will be the missing one.



\*\*Time Complexity:\*\* `O(n)`  

\*\*Space Complexity:\*\* `O(1)`



---



\## Java Solution (Sum Method)

```java

class Solution {

&nbsp;   public int missingNumber(int\[] nums) {

&nbsp;       int curSum = 0, actualSum = 0;

&nbsp;       for(int i : nums){

&nbsp;           curSum+=i;

&nbsp;       }

&nbsp;       for(int i=0;i<nums.length+1;i++){

&nbsp;           actualSum+=i;

&nbsp;       }

&nbsp;       return actualSum-curSum;



&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

