\# 🚀 Day 15 – DSA Challenge



This day focuses on 🧺 Leetcode 3477: Fruits Into Baskets II \& 🔷 Leetcode 977: Squares of a Sorted Array.

...



\## 🧩 Problem 1: Leetcode 3477 - Fruits Into Baskets II



> Note: This problem appears to be an advanced or custom variant of \[Leetcode 904: Fruits Into Baskets](https://leetcode.com/problems/fruit-into-baskets/).



\### ✅ Problem Statement:

You are given an array of integers `fruits` representing types of fruits. You are allowed to take fruits from a subarray with at most \*\*two distinct fruit types\*\*.  

In this advanced version, additional constraints or rules may be applied such as:

\- Skipping rotten fruits (`-1`)

\- Starting from a given index

\- Penalty if fruit types are not consecutive in position



(If you have specific rules for "Fruits Into Baskets II", update this section accordingly.)



\### 🧠 Approach:

\- Use a sliding window to maintain the window with at most 2 distinct fruits.

\- Track counts using a HashMap.

\- Shrink the window from the left when more than 2 types are present.



\### 📌 Time Complexity:

\- O(n), where n is the number of fruits.



\### 📎 Java Code:



```java

public int totalFruit(int\[] fruits) {

&nbsp;   Map<Integer, Integer> map = new HashMap<>();

&nbsp;   int left = 0, max = 0;

&nbsp;   

&nbsp;   for (int right = 0; right < fruits.length; right++) {

&nbsp;       map.put(fruits\[right], map.getOrDefault(fruits\[right], 0) + 1);

&nbsp;       

&nbsp;       while (map.size() > 2) {

&nbsp;           map.put(fruits\[left], map.get(fruits\[left]) - 1);

&nbsp;           if (map.get(fruits\[left]) == 0) {

&nbsp;               map.remove(fruits\[left]);

&nbsp;           }

&nbsp;           left++;

&nbsp;       }

&nbsp;       

&nbsp;       max = Math.max(max, right - left + 1);

&nbsp;   }

&nbsp;   return max;

}



\#🔍 Example:

Input: \[1,2,1,2,3]

Output: 4

Explanation: Longest subarray with 2 fruit types is \[1,2,1,2]





🧩 Problem 2: Leetcode 977 - Squares of a Sorted Array

Link: Leetcode 977 - Squares of a Sorted Array



✅ Problem Statement:

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



🧠 Approach:

Use two pointers, one at the beginning and one at the end.



Square the values and insert the larger one at the end of the result array.



Move the pointers accordingly.



📌 Time Complexity:

O(n)



📎 Java Code:

...java



class Solution {

&nbsp;   public int\[] sortedSquares(int\[] nums) {

&nbsp;       int n = nums.length;

&nbsp;       int arr\[] = new int\[n];

&nbsp;       int l=0,r=n-1;

&nbsp;       int pos = n-1;

&nbsp;       while(l<=r){

&nbsp;           if(Math.abs(nums\[l])>Math.abs(nums\[r])){

&nbsp;               arr\[pos]=nums\[l] \* nums\[l];

&nbsp;               l++;

&nbsp;           }else{

&nbsp;               arr\[pos] = nums\[r] \* nums\[r];

&nbsp;               r--;

&nbsp;           }

&nbsp;           pos--;

&nbsp;       }									

&nbsp;       return arr;

&nbsp;   }

}



