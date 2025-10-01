\# 🚀 Day 69 – DSA Challenge

\# 📘 Unique Pairs Using HashSet



\## 📖 Overview

This program demonstrates how to use \*\*Java’s `HashSet`\*\* to store unique pairs of strings.  

It keeps track of the number of unique pairs entered so far.



\- Each pair consists of two strings: `first` and `second`.

\- If a pair is repeated, it is \*\*not counted again\*\*.



---



\## 🛠️ Features

\- Store and manage \*\*unique pairs\*\* efficiently.

\- Automatically checks for duplicates using `HashSet`.

\- Uses custom `Pair` class with properly overridden `equals` and `hashCode`.

\- Prints the total number of unique pairs after each insertion.



---



\## 📂 File Structure

Solution.java # Main Java file

README.md # Project documentation





---



\## 💻 Code Example

```java

import java.util.\*;



public class Solution {



&nbsp;   static class Pair {

&nbsp;       String first, second;

&nbsp;       public Pair(String first, String second) {

&nbsp;           this.first = first;

&nbsp;           this.second = second;

&nbsp;       }

&nbsp;       @Override

&nbsp;       public boolean equals(Object o) {

&nbsp;           if (this == o) return true;

&nbsp;           if (!(o instanceof Pair)) return false;

&nbsp;           Pair p = (Pair) o;

&nbsp;           return first.equals(p.first) \&\& second.equals(p.second);

&nbsp;       }

&nbsp;       @Override

&nbsp;       public int hashCode() {

&nbsp;           return Objects.hash(first, second);

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner s = new Scanner(System.in);

&nbsp;       int t = s.nextInt();



&nbsp;       Set<Pair> set = new HashSet<>();

&nbsp;       for (int i = 0; i < t; i++) {

&nbsp;           String first = s.next().trim();

&nbsp;           String second = s.next().trim();

&nbsp;           Pair p = new Pair(first, second);

&nbsp;           set.add(p);

&nbsp;           System.out.println(set.size());

&nbsp;       }

&nbsp;   }

}

▶️ Sample Input:



5

john tom

john mary

john tom

mary anna

mary anna

▶️ Sample Output:



1

2

2

3

3

\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list





