\# 🚀 Day 13 – DSA Challenge



This day focuses on some basic problems like "NxN pattern" and "Flore and Double division"



...

\## 🧩 Problem Statement

1st problem related to the basic pattern, like if you give a integer value the output should be a N x N "\*" pattern 



\## 💡 Example

n=5

\* \* \* \* \*

\* \* \* \* \*

\* \* \* \* \*

\* \* \* \* \*

\* \* \* \* \*



\## 💻 Java Code

```java

import java.util.\*;

class NxNPattern{

&nbsp;	public static void main(String args\[]){

&nbsp;		Scanner sc = new Scanner(System.in);

&nbsp;		int n = sc.nextInt();

&nbsp;		for(int i=0;i<n;i++){

&nbsp;			for(itn j=0;j<n;j++){

&nbsp;				System.out.print("\*" + " ");

&nbsp;			}

&nbsp;			System.out.println();

&nbsp;		}

&nbsp;	}

}



\## 🧩 Problem Statement

2nd problem is to print the output of integer like 



Input:

a=3

b=5



Output:

0 0.6



\## 💻 Java Code

```java


import java.util.\*;

class Main {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int a = sc.nextInt();

&nbsp;       int b = sc.nextInt();

&nbsp;        int x = a/b;

&nbsp;        double y = (double)a/b;

&nbsp;        System.out.println(x + " " + y);

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



