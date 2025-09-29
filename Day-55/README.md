\# 🚀 Day 55 – DSA Challenge



\# Count Subarrays with Negative Sum



\## Problem Statement

You are given an array of integers.  

Your task is to determine the \*\*number of subarrays whose sum is negative\*\*.  



A \*\*subarray\*\* is defined as a contiguous portion of the array.



---



\## Input Format

\- The first line contains an integer `n`, the size of the array.  

\- The second line contains `n` space-separated integers, representing the elements of the array.



---



\## Output Format

\- Print a single integer: the count of subarrays with negative sums.



---



\## Constraints

\- `1 <= n <= 100`  

\- `-10^4 <= arr\[i] <= 10^4`  



---



\## Sample Input

5

1 -2 4 -5 1





\## Sample Output

9





---



\## Explanation

Array = `\[1, -2, 4, -5, 1]`  



Subarrays with negative sums are:

\- `\[ -2 ]`

\- `\[ -5 ]`

\- `\[ 1, -2 ]`

\- `\[ 4, -5 ]`

\- `\[ -2, 4, -5 ]`

\- `\[ 1, -2, 4, -5 ]`

\- `\[ -2, 4, -5, 1 ]`

\- `\[ 4, -5, 1 ]`

\- `\[ 1, -2, 4, -5, 1 ]`



Total = \*\*9\*\*



---



\## Approach

1\. Use two nested loops to generate all possible subarrays.

2\. Maintain a running sum while extending each subarray.

3\. If the sum becomes negative, increase the count.

4\. Print the final count.



\- \*\*Time Complexity:\*\* `O(n^2)`  

\- \*\*Space Complexity:\*\* `O(1)`



---



\## Java Solution

```java

import java.io.\*;

import java.util.\*;



public class Solution {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);



&nbsp;       int n = sc.nextInt();

&nbsp;       int arr\[] = new int\[n];

&nbsp;       for(int i = 0; i < n; i++) {

&nbsp;           arr\[i] = sc.nextInt();

&nbsp;       }



&nbsp;       int count = 0;



&nbsp;       // Generate all subarrays

&nbsp;       for (int start = 0; start < n; start++) {

&nbsp;           int sum = 0;

&nbsp;           for (int end = start; end < n; end++) {

&nbsp;               sum += arr\[end];

&nbsp;               if (sum < 0) {

&nbsp;                   count++;

&nbsp;               }

&nbsp;           }

&nbsp;       }



&nbsp;       System.out.println(count);

&nbsp;   }

}

\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

