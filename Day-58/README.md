\# 🚀 Day 58 – DSA Challenge



\# Comparator Program in Java



This program demonstrates \*\*method overloading\*\* in Java by implementing a custom `Comparator` class that can compare:

1\. Two integers  

2\. Two strings  

3\. Two integer arrays  



Depending on the input type, the program outputs whether the two values are `"Same"` or `"Different"`.



---



\## 📌 Problem Description

You need a comparator that can check equality for different data types:

\- Integers

\- Strings

\- Arrays of integers  



The program reads multiple test cases and performs the comparison accordingly.



---



\## 📥 Input Format

1\. The first line contains an integer `T` → number of test cases.  

2\. For each test case:

&nbsp;  - First line: an integer `type` indicating the comparison type:

&nbsp;    - `1` → compare two strings

&nbsp;    - `2` → compare two integers

&nbsp;    - `3` → compare two integer arrays

&nbsp;  - If `type == 1`:  

&nbsp;    - Next two lines: two strings

&nbsp;  - If `type == 2`:  

&nbsp;    - Next two lines: two integers

&nbsp;  - If `type == 3`:  

&nbsp;    - One line: integer `n` → size of first array  

&nbsp;    - Next line: `n` space-separated integers  

&nbsp;    - One line: integer `m` → size of second array  

&nbsp;    - Next line: `m` space-separated integers  



---



\## 📤 Output Format

For each test case, print:

\- `"Same"` if the two inputs are equal  

\- `"Different"` otherwise  



---



\## ✅ Example



\### Input

3

1

hello

hello

2

5

7

3

3

1 2 3

3

1 2 3





\### Output

Same

Different

Same





---



\## ⚙️ How It Works

\- The `Comparator` class defines \*\*three overloaded methods\*\* named `compare`:

&nbsp; - `compare(int a, int b)` → compares two integers  

&nbsp; - `compare(String a, String b)` → compares two strings using `.equals()`  

&nbsp; - `compare(int\[] a, int\[] b)` → compares two arrays by:

&nbsp;   - Checking if lengths are equal  

&nbsp;   - Checking each element for equality  

\- In the `main` method:

&nbsp; - Input is read based on the test case type.  

&nbsp; - The appropriate `compare` method is called.  

&nbsp; - The result is printed as `"Same"` or `"Different"`.  



---



\## Java Solution



```java



import java.util.\*;



class Comparator {

&nbsp;   // Compare two integers

&nbsp;   public boolean compare(int a, int b) {

&nbsp;       return a == b;

&nbsp;   }



&nbsp;   // Compare two strings

&nbsp;   public boolean compare(String a, String b) {

&nbsp;       return a.equals(b);

&nbsp;   }



&nbsp;   // Compare two integer arrays

&nbsp;   public boolean compare(int\[] a, int\[] b) {

&nbsp;       if (a.length != b.length)

&nbsp;           return false;

&nbsp;       for (int i = 0; i < a.length; i++) {

&nbsp;           if (a\[i] != b\[i])

&nbsp;               return false;

&nbsp;       }

&nbsp;       return true;

&nbsp;   }

}



public class Solution {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner scan = new Scanner(System.in);

&nbsp;       int T = Integer.parseInt(scan.nextLine().trim());

&nbsp;       Comparator comparator = new Comparator();

&nbsp;       for (int t = 0; t < T; t++) {

&nbsp;           int type = Integer.parseInt(scan.nextLine().trim());

&nbsp;           if (type == 1) {

&nbsp;               String a = scan.nextLine();

&nbsp;               String b = scan.nextLine();

&nbsp;               System.out.println(comparator.compare(a, b) ? "Same" : "Different");

&nbsp;           } else if (type == 2) {

&nbsp;               int a = Integer.parseInt(scan.nextLine().trim());

&nbsp;               int b = Integer.parseInt(scan.nextLine().trim());

&nbsp;               System.out.println(comparator.compare(a, b) ? "Same" : "Different");

&nbsp;           } else if (type == 3) {

&nbsp;               int n = Integer.parseInt(scan.nextLine().trim());

&nbsp;               int\[] a = new int\[n];

&nbsp;               for (int i = 0; i < n; i++)

&nbsp;                   a\[i] = scan.nextInt();

&nbsp;               int m = Integer.parseInt(scan.nextLine().trim());

&nbsp;               int\[] b = new int\[m];

&nbsp;               for (int i = 0; i < m; i++)

&nbsp;                   b\[i] = scan.nextInt();

&nbsp;               scan.nextLine(); // consume the rest of the line

&nbsp;               System.out.println(comparator.compare(a, b) ? "Same" : "Different");

&nbsp;           }

&nbsp;       }

&nbsp;       scan.close();

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list



