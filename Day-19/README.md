\# 🚀 Day 19 – DSA Challenge 



This day focuses on advanced array, string, and two-pointer problems, such as "Power of Two" and "Valid Triangle Number".



...



\## Problem 231: Power of Two



\### Problem Statement

Given an integer `n`, return `true` if it is a power of two. Otherwise, return `false`.



An integer `n` is a power of two if there exists an integer `x` such that:



n == 2^x



\### Example

\#### Example 1:

Input: n = 1

Output: true

Explanation: 2^0 = 1





\### Constraints

\- `-2^31 <= n <= 2^31 - 1`



\### Approach

1\. \*\*Bit Manipulation\*\*:  

&nbsp;  - A number that is a power of two has exactly \*\*one\*\* bit set in its binary representation.

&nbsp;  - `(n > 0) \&\& ((n \& (n - 1)) == 0)` checks this property.



2\. \*\*Loop Method\*\*:  

&nbsp;  - Keep dividing by 2 until `n` becomes 1.



\### Time Complexity

\- \*\*O(1)\*\* for bit manipulation.

\- \*\*O(log n)\*\* for the loop method.



---



\#### Code (Java)



```java



class Solution {

&nbsp;   public boolean isPowerOfTwo(int n) {

&nbsp;       // if (n < 1) return false;   

&nbsp;       // int power = 1;

&nbsp;       // while (power < n) {

&nbsp;       //     power \*= 2;

&nbsp;       // }

&nbsp;       // return power == n;

&nbsp;       return n > 0 \&\& (n \& (n - 1)) == 0;

&nbsp;   }

}



\## Problem 611: Valid Triangle Number



\### Problem Statement

Given an integer array `nums`, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.



A triplet `(a, b, c)` can form a triangle if:

a + b > c

for all combinations of sides.



\### Example

\#### Example 1:



Input: nums = \[2,2,3,4]

Output: 3

Explanation: Valid combinations are:

(2, 3, 4), (2, 3, 4), (2, 2, 3)





\#### Example 2:



\### Constraints

\- `1 <= nums.length <= 1000`

\- `0 <= nums\[i] <= 1000`



\### Approach

1\. \*\*Sort the array\*\*: This helps in applying the triangle property efficiently.

2\. \*\*Two-pointer approach\*\*:

&nbsp;  - Iterate from the largest element `c` downwards.

&nbsp;  - Use two pointers `i` and `j` to find valid pairs `(a, b)` where `a + b > c`.

&nbsp;  - If the condition is met, all elements between `i` and `j` form valid triangles with `c`.



\### Time Complexity

\- Sorting: \*\*O(n log n)\*\*

\- Two-pointer iteration: \*\*O(n^2)\*\*



---





\#### Code (Java)



```java
class Solution {

&nbsp;   public int triangleNumber(int\[] nums) {

&nbsp;       Arrays.sort(nums);

&nbsp;       int n = nums.length;

&nbsp;       int res = 0;

&nbsp;       for (int i = n - 1; i >= 2; i--){

&nbsp;           int left = 0;

&nbsp;           int right = i-1;

&nbsp;           int target = nums\[i];

&nbsp;           while(left<right){

&nbsp;               int sum = nums\[left] + nums\[right];

&nbsp;               if(sum>target){

&nbsp;                   res += (right-left);

&nbsp;                   right--;

&nbsp;               }else{

&nbsp;                   left++;

&nbsp;               }

&nbsp;           }

&nbsp;       }

&nbsp;       return res;

&nbsp;   }

}



\## References

\- \[LeetCode 231 - Power of Two](https://leetcode.com/problems/power-of-two/?envType=daily-question\&envId=2025-08-09)

\- \[LeetCode 611 - Valid Triangle Number](https://leetcode.com/problems/valid-triangle-number/description/)



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

