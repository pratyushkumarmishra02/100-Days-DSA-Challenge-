\# 🚀 Day 43 – DSA Challenge





\# LeetCode 48 — Rotate Image



\*\*Difficulty:\*\* Medium  

\*\*Topics:\*\* Array, Math, Matrix



---



\## Problem Statement



You are given an `n x n` 2D matrix representing an image. Rotate the image \*\*in place\*\* by \*\*90 degrees clockwise\*\*.



\- In-place means you must \*\*not\*\* allocate another 2D matrix; modify the input matrix directly.



---



\## Examples



\### Example 1

Input: matrix = \[\[1,2,3],

\[4,5,6],

\[7,8,9]]



Output: \[\[7,4,1],

\[8,5,2],

\[9,6,3]]





\### Example 2

Input: matrix = \[\[5,1,9,11],

\[2,4,8,10],

\[13,3,6,7],

\[15,14,12,16]]



Output: \[\[15,13,2,5],

\[14,3,4,1],

\[12,6,8,9],

\[16,7,10,11]]





---



\## Key Insight



Rotating a matrix by 90° clockwise can be achieved in \*\*two steps\*\*:



1\. \*\*Transpose\*\* the matrix (swap rows with columns).

&nbsp;  - After transpose: `matrix\[i]\[j] ↔ matrix\[j]\[i]`.

2\. \*\*Reverse each row\*\*.

&nbsp;  - This gives the rotated version.



---



\## Algorithm



1\. For `i` in `\[0, n)`:

&nbsp;  - For `j` in `\[i, n)`:

&nbsp;    - Swap `matrix\[i]\[j]` with `matrix\[j]\[i]` (transpose).

2\. For each row in the matrix:

&nbsp;  - Reverse the row.



\*\*Time Complexity:\*\* `O(n^2)`  

\*\*Space Complexity:\*\* `O(1)` (in-place)



---



\## Code Implementations



\### java

```java

class RotateImage {

&nbsp;   public void rotate(int\[]\[] matrix) {

&nbsp;       int n = matrix.length;

&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           for (int j = i + 1; j < n; j++) {

&nbsp;               int temp = matrix\[i]\[j];

&nbsp;               matrix\[i]\[j] = matrix\[j]\[i];

&nbsp;               matrix\[j]\[i] = temp;

&nbsp;           }

&nbsp;       }

&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           int l = 0, r = n - 1;

&nbsp;           while (l < r) {

&nbsp;               int temp = matrix\[i]\[l];

&nbsp;               matrix\[i]\[l] = matrix\[i]\[r];

&nbsp;               matrix\[i]\[r] = temp;

&nbsp;               l++;

&nbsp;               r--;

&nbsp;           }

&nbsp;       }

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

