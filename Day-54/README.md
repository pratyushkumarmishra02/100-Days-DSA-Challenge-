\# 🚀 Day 54 – DSA Challenge



\# Java – Read and Print an Array



\## Problem Statement

Write a Java program that:



1\. Reads an integer `n` from standard input, representing the size of an array.  

2\. Reads `n` integers into an array.  

3\. Prints each integer from the array on a new line in the order they were read.



---



\## Input Format

\- The first line contains a single integer `n` — the number of integers in the array.

\- The second line (or next `n` lines) contains `n` space-separated integers.



---



\## Output Format

\- Print each integer from the array on a new line.



---



\## Sample Input

5

10 20 30 40 50





---



\## Sample Output

10

20

30

40

50





---



\## Constraints

\- `1 <= n <= 10^5` (depending on system memory constraints)

\- `-10^9 <= arr\[i] <= 10^9`



---



\## Approach

1\. Use a `Scanner` to read input from stdin.

2\. Create an array of size `n`.

3\. Store input integers into the array using a loop.

4\. Use an enhanced for-loop to print all elements.



\*\*Time Complexity:\*\* `O(n)`  

\*\*Space Complexity:\*\* `O(n)`



---



\## Java Solution

```java

import java.io.\*;

import java.util.\*;



public class Solution {

&nbsp;   public static void main(String\[] args) throws IOException {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n = sc.nextInt(); // Read array size

&nbsp;       int arr\[] = new int\[n];



&nbsp;       // Read array elements

&nbsp;       for(int i = 0; i < n; i++) {

&nbsp;           arr\[i] = sc.nextInt();

&nbsp;       }



&nbsp;       // Print array elements

&nbsp;       for(int i : arr) {

&nbsp;           System.out.println(i);

&nbsp;       }

&nbsp;   }

}

\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

