\# 🚀 Day 10 – DSA Challenge



This day focuses on practicing array-related problems, such as 🔁 Rotate Array \& 🔺 Pascal's Triangle – Java Solutions. 



This repository includes Java implementations for two classic array-related problems from Leetcode:



1\. \*\*\[Leetcode 189: Rotate Array](https://leetcode.com/problems/rotate-array/)\*\*

2\. \*\*\[Leetcode 118: Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/?envType=problem-list-v2\&envId=array)\*\*



---



\## 🚀 1. Rotate Array



\### 🧩 Problem Description



Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.



\### 💡 Example



Input: nums = \[1,2,3,4,5,6,7], k = 3

Output: \[5,6,7,1,2,3,4]





\### ✅ Constraints

\- `1 <= nums.length <= 10^5`

\- `-2^31 <= nums\[i] <= 2^31 - 1`

\- `0 <= k <= 10^5`



---



\### 🔍 Approach



We use the \*\*reverse technique\*\*:

1\. Reverse the entire array

2\. Reverse the first `k` elements

3\. Reverse the remaining `n - k` elements



\### 📄 Java Code



```java

public class RotateArray {

&nbsp;   public void rotate(int\[] nums, int k) {

&nbsp;       int n = nums.length;

&nbsp;       k = k % n;  // Handle k > n

&nbsp;       reverse(nums, 0, n - 1);

&nbsp;       reverse(nums, 0, k - 1);

&nbsp;       reverse(nums, k, n - 1);

&nbsp;   }



&nbsp;   private void reverse(int\[] nums, int start, int end) {

&nbsp;       while(start < end){

&nbsp;           int temp = nums\[start];

&nbsp;           nums\[start] = nums\[end];

&nbsp;           nums\[end] = temp;

&nbsp;           start++;

&nbsp;           end--;

&nbsp;       }

&nbsp;   }

}





| Type  | Complexity |

| ----- | ---------- |

| Time  | O(n)       |

| Space | O(1)       |





\###🔺 2. Pascal's Triangle

🧩 Problem Description

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.



Each row is constructed such that:



The first and last elements are 1.



Each element is the sum of the two elements above it.





Input: numRows = 5

Output:

\[

&nbsp;    \[1],

&nbsp;   \[1,1],

&nbsp;  \[1,2,1],

&nbsp; \[1,3,3,1],

&nbsp;\[1,4,6,4,1]

]



\### 📄 Java Code



```java


class Solution {

&nbsp;   public List<List<Integer>> generate(int numRows) {

&nbsp;       List<List<Integer>> res  = new ArrayList<>();

&nbsp;       for(int i=0;i<numRows;i++){

&nbsp;           ArrayList<Integer> row = new ArrayList<>();

&nbsp;           for(int j=0;j<=i;j++){

&nbsp;               if(j==0 || j==i){

&nbsp;                   row.add(1);

&nbsp;               }else{

&nbsp;                   int val = res.get(i-1).get(j-1) + res.get(i-1).get(j);

&nbsp;                   row.add(val);

&nbsp;               }

&nbsp;           }

&nbsp;           res.add(row);

&nbsp;       }

&nbsp;       return res;

&nbsp;   }

}





\### ✅ Next Goal:





I will continue the same new quest according to the array as well as the string or maybe related to sorting 

