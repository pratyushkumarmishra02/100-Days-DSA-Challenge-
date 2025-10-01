\# 🚀 Day 66 – DSA Challenge



\# 📘 ListExample



\## 📖 Overview

This project demonstrates the use of Java’s \*\*`List` interface (ArrayList implementation)\*\* to perform dynamic operations such as \*\*insertion and deletion\*\* at specific indices.  

It simulates modifying a list of integers based on user commands.



\## 🛠️ Features

\- Read an initial list of integers.

\- Perform \*\*Insert\*\* operation:

&nbsp; - `Insert index value` → Inserts a new integer at the given index.

\- Perform \*\*Delete\*\* operation:

&nbsp; - `Delete index` → Removes the element at the specified index.

\- Print the final state of the list.



\## 📂 File Structure

ListExample.java # Main Java file

README.md # Project documentation





\## 💻 Code Example

```java

import java.io.\*;

import java.util.\*;



public class ListExample {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n = sc.nextInt();

&nbsp;       List<Integer> l = new ArrayList<>();

&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           l.add(sc.nextInt());

&nbsp;       }

&nbsp;       

&nbsp;       int q = sc.nextInt();

&nbsp;       for (int i = 1; i <= q; i++) {

&nbsp;           String command = sc.next();

&nbsp;           if (command.equals("Insert")) {

&nbsp;               int index = sc.nextInt();

&nbsp;               int value = sc.nextInt();

&nbsp;               l.add(index, value);

&nbsp;           } else {

&nbsp;               int idx = sc.nextInt();

&nbsp;               l.remove(idx);

&nbsp;           }

&nbsp;       }

&nbsp;       for (int i = 0; i < l.size(); i++) {

&nbsp;           System.out.print(l.get(i) + " ");

&nbsp;       }

&nbsp;   }

}

▶️ Sample Input



5

12 0 1 78 12

2

Insert 5 23

Delete 0

▶️ Sample Output



0 1 78 12 23

\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list



