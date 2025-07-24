\# 🚀 Day 3 – DSA Challenge



This day focuses on practicing "Max water in a container", "Longest common prefix", and "Factorial of a number" techniques. 



---

\## 📋 Problem Statement



You are given an array `height\[]` of `n` non-negative integers where each element represents the height of a vertical line on the x-axis. Find two lines that together with the x-axis form a container such that the container contains the \*\*most water\*\*.



\### ➕ Constraints:

\- `n >= 2`

\- `0 <= height\[i] <= 10^4`



---



\## 🧠 Approach



\### ✅ Two Pointer Technique:



\- Start with two pointers: one at the beginning (`left`) and one at the end (`right`).

\- Calculate the area formed by the two lines.

\- Move the pointer pointing to the shorter line inward to possibly find a taller line.

\- Repeat until the two pointers meet.



⏱️ \*\*Time Complexity\*\*: O(n)  

📦 \*\*Space Complexity\*\*: O(1)



---



\## 📄 Java Code



```java

public class ContainerWithMostWater {

&nbsp;   public int maxArea(int\[] height) {

&nbsp;       int maxArea = 0;

&nbsp;       int left = 0;

&nbsp;       int right = height.length - 1;



&nbsp;       while (left < right) {

&nbsp;           int h = Math.min(height\[left], height\[right]);

&nbsp;           int w = right - left;

&nbsp;           int area = h \* w;

&nbsp;           maxArea = Math.max(maxArea, area);



&nbsp;           // Move the pointer pointing to the smaller height

&nbsp;           if (height\[left] < height\[right]) {

&nbsp;               left++;

&nbsp;           } else {

&nbsp;               right--;

&nbsp;           }

&nbsp;       }



&nbsp;       return maxArea;

&nbsp;   }

}





\## 📋 Problem Statement



Write a function to find the \*\*longest common prefix string\*\* amongst an array of strings.



If there is no common prefix, return an empty string `""`.



\### 🧾 Example:

Input: strs = \["flower","flow","flight"]

Output: "fl"



Input: strs = \["dog","racecar","car"]

Output: ""





---



\## 🧠 Approach



\### ✅ Vertical Scanning (Character-by-Character Comparison)



\- Pick the first string as the reference.

\- Compare each character of the reference string with the corresponding character in all other strings.

\- If a mismatch occurs or end of any string is reached, return the prefix up to that point.



⏱️ \*\*Time Complexity\*\*: O(S), where S is the sum of all characters in all strings.  

📦 \*\*Space Complexity\*\*: O(1)



---



\## 📄 Java Code



```java

public class LongestCommonPrefix {

&nbsp;   public String longestCommonPrefix(String\[] strs) {

&nbsp;       if (strs == null || strs.length == 0) return "";



&nbsp;       String prefix = strs\[0];



&nbsp;       for (int i = 1; i < strs.length; i++) {

&nbsp;           while (!strs\[i].startsWith(prefix)) {

&nbsp;               prefix = prefix.substring(0, prefix.length() - 1);

&nbsp;               if (prefix.isEmpty()) return "";

&nbsp;           }

&nbsp;       }



&nbsp;       return prefix;

&nbsp;   }

}



\## 📋 Problem Statement



Write a Java program that reads an integer `n` and prints its factorial.



The \*\*factorial\*\* of a non-negative integer `n` is the product of all positive integers less than or equal to `n`. It is denoted by `n!`.



\### Formula:

n! = n × (n - 1) × (n - 2) × ... × 1





\### ⚠️ Constraints:

\- 0 ≤ n ≤ 20 \*(for handling long overflow in Java)\*

\- Input must be a non-negative integer



---



\## 🧠 Approach



\### ✅ Iterative Method (Using Loop)

\- Start with `result = 1`

\- Multiply `result` by every number from 1 to `n`

\- Print the result



\### ✅ Recursive Method (Alternative)

\- Use recursion:  

&nbsp; `factorial(n) = n \* factorial(n - 1)`  

&nbsp; Base case: `factorial(0) = 1`



⏱️ \*\*Time Complexity\*\*: O(n)  

📦 \*\*Space Complexity\*\*: O(1) \*(Iterative)\* / O(n) \*(Recursive)\*



---



\## 📄 Java Code (Iterative)



```java

&nbsp;import java.util.Scanner;



public class Factorial {

&nbsp;   public static long factorial(int n) {

&nbsp;       if (n == 0 || n == 1)

&nbsp;           return 1;

&nbsp;       return n \* factorial(n - 1);

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner scan = new Scanner(System.in);

&nbsp;       System.out.print("Enter a number: ");

&nbsp;       int n = scan.nextInt();



&nbsp;       System.out.println("Factorial of " + n + " is: " + factorial(n));

&nbsp;       scan.close();

&nbsp;   }

}



