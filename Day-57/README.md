\# 🚀 Day 57 – DSA Challenge



\# Animal and Bird OOP Example in Java



This Java program demonstrates basic \*\*Object-Oriented Programming (OOP)\*\* concepts, including \*\*inheritance\*\* and \*\*method overriding\*\*.



\## Table of Contents

\- \[Problem Description](#problem-description)

\- \[Classes](#classes)

\- \[Program Output](#program-output)

\- \[How It Works](#how-it-works)

\- \[Usage](#usage)



\## Problem Description

The program models animals and birds using classes in Java.  

\- The `Animal` class represents a generic animal with basic behavior.  

\- The `Bird` class extends `Animal` and adds additional behaviors specific to birds.



When executed, the program creates a `Bird` object and demonstrates its abilities to \*\*walk, fly, and sing\*\*.



\## Classes



\### `Animal`

\- Parent class.

\- Methods:

&nbsp; - `void walk()`: Prints `"I am walking"`.



\### `Bird`

\- Child class that inherits from `Animal`.

\- Additional Methods:

&nbsp; - `void fly()`: Prints `"I am flying"`.

&nbsp; - `void sing()`: Prints `"I am singing"`.



\## Program Output



When the program is run, it prints:



I am walking

I am flying

I am singing





\## How It Works

1\. The `Animal` class defines a general behavior for all animals (`walk` method).  

2\. The `Bird` class inherits from `Animal`:

&nbsp;  - Inherits the `walk` method.

&nbsp;  - Adds two additional behaviors: `fly` and `sing`.

3\. In `main`, a `Bird` object is created and all three behaviors (`walk`, `fly`, `sing`) are demonstrated.



\## Java Solution



```java



import java.io.\*;

import java.util.\*;



public class Solution {



&nbsp;   public static void main(String\[] args) {

&nbsp;       /\* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. \*/

&nbsp;       Bird bird = new Bird();

&nbsp;       bird.walk();

&nbsp;       bird.fly();

&nbsp;       bird.sing();

&nbsp;   }

}



class Animal{

&nbsp;   void walk(){

&nbsp;       System.out.println("I am walking");

&nbsp;   }

}

class Bird extends Animal {

&nbsp;   void fly() {

&nbsp;       System.out.println("I am flying");

&nbsp;   }

&nbsp;   void sing(){

&nbsp;       System.out.println("I am singing");

&nbsp;   }

}



