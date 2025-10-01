\# 🚀 Day 67 – DSA Challenge

\# 📘 Phone Book (HashMap Example)



\## 📖 Overview

This project demonstrates the use of Java’s \*\*`HashMap`\*\* to implement a simple phone book directory.  

It stores `name → phone number` mappings and supports queries to look up numbers by name.



\## 🛠️ Features

\- Store multiple phone book entries (`name` and `number`).

\- Efficiently search for a contact by name using `HashMap`.

\- Print result in the format:

&nbsp; - `name=number` if the contact exists.

&nbsp; - `Not found` if the contact is missing.



\## 📂 File Structure

Solution.java # Main Java file

README.md # Project documentation





\## 💻 Code Example

```java

import java.util.\*;

import java.io.\*;



public class Solution {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n = sc.nextInt();

&nbsp;       sc.nextLine(); 



&nbsp;       Map<String, String> phoneBook = new HashMap<>();

&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           String name = sc.nextLine();

&nbsp;           String number = sc.nextLine();

&nbsp;           phoneBook.put(name, number);

&nbsp;       }



&nbsp;       while (sc.hasNextLine()) {

&nbsp;           String query = sc.nextLine();

&nbsp;           if (phoneBook.containsKey(query)) {

&nbsp;               System.out.println(query + "=" + phoneBook.get(query));

&nbsp;           } else if (!query.isEmpty()) {

&nbsp;               System.out.println("Not found");

&nbsp;           }

&nbsp;       }

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

