\# 🚀 Day 2 – DSA Challenge with Java Practice: Input Handling and String Reversal



This day focuses on practicing basic Java input/output and string manipulation techniques. Two programs were written to solidify concepts related to user input and reversing strings.



---



\## 1. 🔢 Print the Integer – `printTheInteger.java`



\### 📋 Problem Statement:

Write a program that reads an integer from the user and prints it \*\*only if\*\* the number lies between `-1,000,000` and `1,000,000` (inclusive).



\### 📥 Sample Input: 42

\### 📤 Sample Output:42





\### 💡 Key Concepts:

\- Using `Scanner` class to read input

\- Integer range validation using an `if` condition

\- Basic `System.out.println()` usage



\### 🧾 Code Summary:

```java

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

if (n >= -1000000 \&\& n <= 1000000) {

&nbsp;   System.out.println(n);

}





\# 🔄 Reverse a String – Java Program



This Java program takes a string input from the user and prints its reversed version using two different methods:

1\. Using `StringBuilder.reverse()`

2\. Manually using a loop



---



\## 📋 Problem Statement



Write a program that:

\- Takes a string as input

\- Prints the reverse of the string using:

&nbsp; - The built-in `StringBuilder.reverse()` method

&nbsp; - A manual loop-based reversal



---

\### 🧾 manual Code Summary:

```java

String reversed = "";

&nbsp;		for(int i = s.length() -1;i>=0;i--){

&nbsp;			reversed+=i;

&nbsp;		}

&nbsp;		System.out.println(reversed);



\\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string 





