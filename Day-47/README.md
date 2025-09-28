\# 🚀 Day 47 – DSA Challenge





---



\## 📘 `README.md` for \*\*LeetCode 812. Largest Triangle Area\*\*

```markdown

\# LeetCode 812. Largest Triangle Area



\## Problem Statement

Given an array of points on the 2D plane, return the \*\*largest area of a triangle\*\* that can be formed by any three different points.



---



\### Example

\*\*Input:\*\*

points = \[\[0,0],\[0,1],\[1,0],\[0,2],\[2,0]]

\*\*Output:\*\*

2.0





---



\## Approach

\- Use the \*\*Shoelace formula\*\* for triangle area:  

Area = |x1(y2−y3) + x2(y3−y1) + x3(y1−y2)| / 2



\- Iterate over all combinations of 3 points.

\- Track the maximum area.



\*\*Time Complexity:\*\* `O(n^3)`  

\*\*Space Complexity:\*\* `O(1)`



---



\## Java Solution

```java

class Solution {

&nbsp; public double largestTriangleArea(int\[]\[] points) {

&nbsp;     double maxArea = 0.0;

&nbsp;     

&nbsp;     for (int i = 0; i < points.length; i++) {

&nbsp;         for (int j = i + 1; j < points.length; j++) {

&nbsp;             for (int k = j + 1; k < points.length; k++) {

&nbsp;                 int\[] p1 = points\[i];

&nbsp;                 int\[] p2 = points\[j];

&nbsp;                 int\[] p3 = points\[k];

&nbsp;                 

&nbsp;                 double area = Math.abs(

&nbsp;                     p1\[0] \* (p2\[1] - p3\[1]) +

&nbsp;                     p2\[0] \* (p3\[1] - p1\[1]) +

&nbsp;                     p3\[0] \* (p1\[1] - p2\[1])

&nbsp;                 ) / 2.0;

&nbsp;                 

&nbsp;                 maxArea = Math.max(maxArea, area);

&nbsp;             }

&nbsp;         }

&nbsp;     }

&nbsp;     

&nbsp;     return maxArea;

&nbsp; }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

