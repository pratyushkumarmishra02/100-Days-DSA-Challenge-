\# 🚀 Day 17 – DSA Challenge



This day focuses on Two pointer and merge sort concepts like  "Move Zeroes" and "Merge Sorted Array"



...



\## 📌 Problem 283: Move Zeroes



\### Problem Statement

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.



\*\*Note:\*\* You must do this \*\*in-place\*\* without making a copy of the array.



---



\### Example

\#### Input:

nums = \[0,1,0,3,12]



\#### Output:

\[1,3,12,0,0]

---



\### Constraints:

\- `1 <= nums.length <= 10^4`

\- `-2^31 <= nums\[i] <= 2^31 - 1`



---



\### Approach

1\. Use two pointers:

&nbsp;  - One pointer `pos` to track the position of the next non-zero element.

&nbsp;  - Iterate through the array and move all non-zero values to the front.

2\. Fill the remaining elements with `0`.



---



\### Complexity:

\- \*\*Time:\*\* `O(n)` — Single pass through the array.

\- \*\*Space:\*\* `O(1)` — In-place modification.



---



\### Java Code:

```java



class Solution {

&nbsp;   public void moveZeroes(int\[] nums) {

&nbsp;       int n = nums.length;

&nbsp;       int non = 0;

&nbsp;       for(int num : nums){

&nbsp;           if(num!=0){

&nbsp;               nums\[non++] =  num;

&nbsp;           }

&nbsp;       }

&nbsp;       while(non<n){

&nbsp;           nums\[non++] = 0;

&nbsp;       }

&nbsp;       

&nbsp;   }

}



📌 Problem 88: Merge Sorted Array

Problem Statement

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.



Merge nums2 into nums1 so that the merged array is also sorted in non-decreasing order.



Note: nums1 has a length of m + n, with the first m elements initialized, and the last n elements set to 0 to accommodate nums2.



Example

Input:

nums1 = \[1,2,3,0,0,0], m = 3

nums2 = \[2,5,6], n = 3



Output:

\[1,2,2,3,5,6]



Constraints:

nums1.length == m + n



nums2.length == n



0 <= m, n <= 200



1 <= m + n <= 200



-10^9 <= nums1\[i], nums2\[i] <= 10^9



Approach

Use three pointers starting from the end:



p1 = m - 1 (end of initialized part in nums1)



p2 = n - 1 (end of nums2)



p = m + n - 1 (end of nums1 array)



Compare elements from the back and place the larger one at position p.



If any elements remain in nums2, copy them.



Complexity:

Time: O(m + n) — Single pass from the back.



Space: O(1) — In-place.



Java Code:



...java

class Solution {

&nbsp;   public void merge(int\[] nums1, int m, int\[] nums2, int n) {

&nbsp;       int x = m-1, y = n-1, z = m+n-1;

&nbsp;       while(y>=0){

&nbsp;           if(x>=0 \&\& nums1\[x]>nums2\[y]){

&nbsp;               nums1\[z--] = nums1\[x--];

&nbsp;           }else{

&nbsp;               nums1\[z--] = nums2\[y--];

&nbsp;           }

&nbsp;       }

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



