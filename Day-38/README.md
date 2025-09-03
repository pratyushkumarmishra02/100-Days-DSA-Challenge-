\# 🚀 Day 38 – DSA Challenge



This day focuses on some basics of the Java programme like "Print the Table of a number" and "Perfect Number".



...

1\. \*\*Table.java\*\* – Generates the multiplication table for a given number.

2\. \*\*PerfectSum.java\*\* – Checks if a given number is a \*\*Perfect Number\*\*.



---



\## 🔹 Program 1: Multiplication Table



\### Description

This program takes an integer input `n` from the user and prints its multiplication table up to 10.



\### Code File

\- `Table.java`



\### Example Usage

\*\*Input\*\*

5





\*\*Output\*\*

5 x 1 = 5

5 x 2 = 10

5 x 3 = 15

5 x 4 = 20

5 x 5 = 25

5 x 6 = 30

5 x 7 = 35

5 x 8 = 40

5 x 9 = 45

5 x 10 = 50



Sample Code (Java)



```java

import java.util.\*;

class Table{

&nbsp;   public static void main(String args\[]){

&nbsp;       Scanner sc =new Scanner(System.in);

&nbsp;       int n=sc.nextInt();

&nbsp;       for(int i=1;i<=10;i++){

&nbsp;           System.out.println(n+" x "+i+" = "+n\*i);

&nbsp;       }

&nbsp;   }

}





---



\## 🔹 Program 2: Perfect Number Check



\### Description

A \*\*Perfect Number\*\* is a positive integer equal to the sum of its proper divisors.  

For example, `28` is perfect because:



Divisors = 1, 2, 4, 7, 14

Sum = 1 + 2 + 4 + 7 + 14 = 28



This program takes an integer input `n` and determines whether it is a perfect number.



\### Code File

\- `PerfectSum.java`



\### Example Usage

\*\*Input\*\*



28



\*\*Output\*\*



28 is Perfect



\*\*Input\*\*

15



\*\*Output\*\*

15 is not Perfect



Sample Code (Java)



```java


import java.util.Scanner;



public class PerfectSum {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n = sc.nextInt();

&nbsp;       int sum=0;

&nbsp;       for(int i=1;i<n;i++){

&nbsp;           if(n%i==0){

&nbsp;               sum+=i;

&nbsp;           }

&nbsp;       }

&nbsp;       if(sum==n){

&nbsp;           System.out.println(n+" is Perfect");

&nbsp;       }else{

&nbsp;           System.out.println(n+" is not Perfect");

&nbsp;       }

&nbsp;   }

}





---



\## 🛠️ How to Compile \& Run



\### Compile



javac Table.java

javac PerfectSum.java





\### Run





---



\## 📌 Notes

\- These are simple console-based Java programs for practicing \*\*loops\*\*, \*\*conditionals\*\*, and \*\*number theory\*\*.

\- The `Scanner` class is used for user input.

\- Both programs require integers as input.



---

### ✅ Next Goal:

I will continue the same new quest according to the array as well as the string and Linked list.
