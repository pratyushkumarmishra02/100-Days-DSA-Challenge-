\# 🚀 Day 60 – DSA Challenge



\# Arithmetic and Adder Inheritance Example in Java



This program demonstrates \*\*inheritance in Java\*\* by creating a base class `Arithmetic` and a derived class `Adder`.  

The `Adder` class extends `Arithmetic` and adds functionality to perform integer addition.



---



\## 📌 Problem Description

You need to:

1\. Create a class `Arithmetic`.  

2\. Create a subclass `Adder` that extends `Arithmetic`.  

3\. Implement an `add(int a, int b)` method in `Adder` that returns the sum of two integers.  

4\. Print the name of the superclass of `Adder`.  

5\. Demonstrate the `add` method with sample inputs.  



---



\## 📥 Input Format

There is no direct input from the user in this program.  

The main method creates an `Adder` object and performs predefined operations.



---



\## 📤 Output Format

1\. The first line prints the name of the superclass of `Adder`.  

2\. The second line prints the results of three addition operations as space-separated integers.  



---



\## ✅ Example



\### Output

My superclass is: Arithmetic

42 13 20





---



\## ⚙️ How It Works

1\. `Arithmetic` is a base class with no methods.  

2\. `Adder` extends `Arithmetic` and provides an `add` method:

&nbsp;  ```java

&nbsp;  public int add(int a, int b) {

&nbsp;      return a + b;

&nbsp;  }

3\. In the main method:



An Adder object is created.



a.getClass().getSuperclass().getName() is used to get the superclass name of Adder.



The add method is called three times with sample inputs.



\## Java Solution



```java

import java.io.\*;

import java.util.\*;

import java.text.\*;

import java.math.\*;

import java.util.regex.\*;

class Arithmetic{}

class Adder extends Arithmetic{

&nbsp;   public int add(int a, int b){

&nbsp;       int c = a+b;

&nbsp;       return c;

&nbsp;   }

}

//Write your code here



public class Solution{

&nbsp;   public static void main(String \[]args){

&nbsp;       // Create a new Adder object

&nbsp;       Adder a = new Adder();

&nbsp;       

&nbsp;       // Print the name of the superclass on a new line

&nbsp;       System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	

&nbsp;       

&nbsp;       // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:

&nbsp;       System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\\n");

&nbsp;    }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

