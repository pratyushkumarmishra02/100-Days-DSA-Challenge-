\# 🚀 Day 64 – DSA Challenge



\# Singly Linked List using Java Collection Framework



This project demonstrates how to use Java's \*\*Collection Framework\*\* (`java.util.LinkedList`) to implement a simple linked list.  

It performs basic operations like:

\- Adding elements at the beginning (`addFirst`)

\- Adding elements at the end (`addLast`)

\- Adding elements in between (`add`)

\- Traversing and printing the list



---



\## 📌 Problem Description

Unlike a manually implemented linked list, Java provides a built-in \*\*`LinkedList` class\*\* inside the `java.util` package.  

It implements the \*\*List\*\*, \*\*Deque\*\*, and \*\*Queue\*\* interfaces, and allows efficient insertions and deletions at both ends.  



This program demonstrates how to create a `LinkedList<Integer>` and perform basic operations using the framework.



---



\## 📂 Classes and Structure

\### `LLCollectionFRameWork`

\- Main class with the `main` method.  

\- Uses Java's `LinkedList<Integer>` for storing integer values.  



---



\## 🛠 Methods Used

\- \*\*`addFirst(E e)`\*\*  

&nbsp; Inserts the element at the \*\*beginning\*\* of the list.  



\- \*\*`add(E e)`\*\*  

&nbsp; Inserts the element at the \*\*end\*\* of the list (default behavior).  



\- \*\*`addLast(E e)`\*\*  

&nbsp; Inserts the element at the \*\*end\*\* of the list explicitly.  



\- \*\*`get(int index)`\*\*  

&nbsp; Returns the element at the specified index.  



\- \*\*`size()`\*\*  

&nbsp; Returns the number of elements in the list.  



---



\## ✅ Example



\### Code Execution

```java

import java.util.\*;



public class LLCollectionFRameWork {

&nbsp;   public static void main(String\[] args) {

&nbsp;       LinkedList<Integer> ll = new LinkedList<>();

&nbsp;       ll.addFirst(10);

&nbsp;       ll.add(20);

&nbsp;       ll.addLast(30);

&nbsp;       ll.add(40);



&nbsp;       for(int i=0;i<ll.size();i++){

&nbsp;           System.out.print(ll.get(i)+"->");

&nbsp;       }

&nbsp;       System.out.println("Null");

&nbsp;   }

}

Output:

10->20->30->40->Null



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

