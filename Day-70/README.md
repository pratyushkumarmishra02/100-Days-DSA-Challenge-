\# 🚀 Day 70 – DSA Challenge



\# 📘 Student Sorting Program



\## 📖 Overview

This program demonstrates how to sort a list of students based on multiple criteria using \*\*Java's `Comparator` interface\*\*.  

Each student has an \*\*ID\*\*, \*\*name\*\*, and \*\*CGPA\*\*.  

Sorting rules are applied as follows:



1\. \*\*Primary:\*\* Decreasing CGPA (higher CGPA first)  

2\. \*\*Secondary:\*\* Alphabetical order of names (if CGPA is the same)  

3\. \*\*Tertiary:\*\* Increasing ID (if both CGPA and name are the same)



---



\## 🛠️ Features

\- Store a list of students with \*\*ID, Name, and CGPA\*\*.

\- Sort students using \*\*custom comparator logic\*\*.

\- Print the ordered list of student names after sorting.



---



\## 📂 File Structure

Solution.java # Main Java file

README.md # Project documentation





---



\## 💻 Code Example

```java

import java.util.\*;



class Student {

&nbsp;   int id;

&nbsp;   String name;

&nbsp;   double cgpa;



&nbsp;   public Student(int id, String name, double cgpa) {

&nbsp;       this.id = id;

&nbsp;       this.name = name;

&nbsp;       this.cgpa = cgpa;

&nbsp;   }

}



public class Solution {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n = sc.nextInt();

&nbsp;       List<Student> students = new ArrayList<>();



&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           int id = sc.nextInt();

&nbsp;           String name = sc.next();

&nbsp;           double cgpa = sc.nextDouble();

&nbsp;           students.add(new Student(id, name, cgpa));

&nbsp;       }



&nbsp;       // Sort based on custom comparator logic

&nbsp;       Collections.sort(students, new Comparator<Student>() {

&nbsp;           @Override

&nbsp;           public int compare(Student s1, Student s2) {

&nbsp;               if (Double.compare(s2.cgpa, s1.cgpa) != 0) {

&nbsp;                   // Sort by CGPA decreasing

&nbsp;                   return Double.compare(s2.cgpa, s1.cgpa);

&nbsp;               } else {

&nbsp;                   // Sort by name alphabetically

&nbsp;                   int nameCompare = s1.name.compareTo(s2.name);

&nbsp;                   if (nameCompare != 0) {

&nbsp;                       return nameCompare;

&nbsp;                   } else {

&nbsp;                       // Sort by id ascending

&nbsp;                       return Integer.compare(s1.id, s2.id);

&nbsp;                   }

&nbsp;               }

&nbsp;           }

&nbsp;       });



&nbsp;       // Print the ordered list of student names

&nbsp;       for (Student s : students) {

&nbsp;           System.out.println(s.name);

&nbsp;       }

&nbsp;   }

}

▶️ Sample Input



5

33 Rumpa 3.68

85 Ashis 3.85

56 Samiha 3.75

19 Samara 3.75

22 Fahim 3.76



▶️ Sample Output

Ashis

Fahim

Samara

Samiha

Rumpa





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

