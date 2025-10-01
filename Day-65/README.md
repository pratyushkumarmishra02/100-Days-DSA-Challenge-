\# 🚀 Day 65 – DSA Challenge



\# 📘 LLCollectionFRameWork



\## 📖 Overview

This project demonstrates how to use Java’s \*\*Collection Framework (`LinkedList`)\*\* to perform basic linked list operations such as \*\*adding, removing, traversing, and checking size\*\*.  

It is a simpler alternative to manually implementing a linked list.



\## 🛠️ Features

\- Add elements:

&nbsp; - At the \*\*beginning\*\* (`addFirst`)

&nbsp; - At the \*\*end\*\* (`addLast`, `add`)

\- Traverse and print the list

\- Remove elements:

&nbsp; - From the \*\*first position\*\* (`removeFirst`)

&nbsp; - By \*\*index\*\* (`remove(index)`)

\- Retrieve size dynamically using `size()`



\## 📂 File Structure



\## 💻 Code Example

```java

import java.util.\*;



public class LLCollectionFRameWork {

&nbsp;   public static void main(String\[] args) {

&nbsp;       LinkedList<Integer> ll = new LinkedList<>();

&nbsp;       ll.addFirst(10);

&nbsp;       ll.add(20);

&nbsp;       ll.addLast(30);

&nbsp;       ll.add(40);



&nbsp;       for (int i = 0; i < ll.size(); i++) {

&nbsp;           System.out.print(ll.get(i) + "->");

&nbsp;       }

&nbsp;       System.out.println("Null");



&nbsp;       System.out.println(ll.size());



&nbsp;       ll.removeFirst();

&nbsp;       System.out.println(ll.size());

&nbsp;       ll.remove(1);



&nbsp;       for (int i = 0; i < ll.size(); i++) {

&nbsp;           System.out.print(ll.get(i) + "->");

&nbsp;       }

&nbsp;       System.out.println("Null");

&nbsp;   }

}

▶️ Sample Output

10->20->30->40->Null

4

3

20->40->Null

\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list





