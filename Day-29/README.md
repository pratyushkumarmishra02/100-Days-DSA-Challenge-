\# 🚀 Day 29 – DSA Challenge



\# LeetCode 3000 \& 2239 – Problem Descriptions \& Solutions



This repository includes clear and concise documentation for two specific LeetCode problems:



\- \*\*LeetCode 3000: Maximum Area of Longest Diagonal Rectangle\*\*

\- \*\*LeetCode 2239: Find Closest Number to Zero\*\*



---



\## 1. 3000 – Maximum Area of Longest Diagonal Rectangle



\### Problem Statement  

You are given an array `dimensions`, where each element is an integer pair `\[width, height]` representing different rectangles.  

Calculate the diagonal of each rectangle using the formula:  



diagonal² = width² + height²



Find the rectangle with the \*\*longest diagonal\*\*. If multiple rectangles tie for the longest diagonal, return the \*\*area\*\* (`width × height`) of the one having the largest area among them.



\### Approach  

\- For each rectangle, compute the squared diagonal: `d = w² + h²`.

\- Track the rectangle with the maximum `d`. If two rectangles have the same `d`, choose the one with the larger area.

\- Return the area of the selected rectangle.



\### Time \& Space Complexity  

\- \*\*Time:\*\* O(n), single pass through all rectangles.  

\- \*\*Space:\*\* O(1), constant extra space.



\### Java Solution  

```java

import java.util.\*;



public class Solution {

&nbsp;   public int areaOfMaxDiagonal(int\[]\[] dims) {

&nbsp;       long maxDiag = -1;

&nbsp;       int bestArea = 0;

&nbsp;       for (int\[] d : dims) {

&nbsp;           long w = d\[0], h = d\[1];

&nbsp;           long diag2 = w \* w + h \* h;

&nbsp;           int area = d\[0] \* d\[1];

&nbsp;           if (diag2 > maxDiag || (diag2 == maxDiag \&\& area > bestArea)) {

&nbsp;               maxDiag = diag2;

&nbsp;               bestArea = area;

&nbsp;           }

&nbsp;       }

&nbsp;       return bestArea;

&nbsp;   }

}





2\. 2239 – Find Closest Number to Zero

Problem Statement



Given an integer array nums, return the number whose value is closest to zero. If multiple numbers are equally close, return the greatest value among them (i.e., prefer positive).



Approach



Traverse the array while keeping track of the current closest number (ans) and its absolute distance from zero (dist).



Update ans whenever you find a number with smaller absolute distance.



For ties (same distance), choose the larger number.



Time \& Space Complexity



Time: O(n)



Space: O(1)



Java Solution



```java



public class Solution {

&nbsp;   public int findClosestNumber(int\[] nums) {

&nbsp;       int ans = nums\[0];

&nbsp;       int dist = Math.abs(ans);

&nbsp;       for (int x : nums) {

&nbsp;           int d = Math.abs(x);

&nbsp;           if (d < dist || (d == dist \&\& x > ans)) {

&nbsp;               ans = x;

&nbsp;               dist = d;

&nbsp;           }

&nbsp;       }

&nbsp;       return ans;

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



