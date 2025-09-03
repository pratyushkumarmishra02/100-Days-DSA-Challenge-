\# 🚀 Day 37 – DSA Challenge





LeetCode 392. Is Subsequence

Problem Statement

Given two strings s and t, determine if s is a subsequence of t.



Subsequence Definition

A subsequence of a string is a new string generated from the original string by deleting some characters without changing the order of the remaining characters.



Approach

Use two pointers:



Traverse through t



Move pointer in s forward when characters match



If pointer in s reaches the end, s is a subsequence of t.



Time Complexity

O

(

n

)

O(n), where 

n

n is the length of t.



Space Complexity

O

(

1

)

O(1)



Sample Code (Java)



```java

class IsSubsequence {

&nbsp;   public boolean isSubsequence(String s, String t) {

&nbsp;       int sp = 0, tp = 0;

&nbsp;       while (sp < s.length() \&\& tp < t.length()) {

&nbsp;           if (s.charAt(sp) == t.charAt(tp)) {

&nbsp;               sp++;

&nbsp;           }

&nbsp;           tp++;

&nbsp;       }

&nbsp;       return sp == s.length();

&nbsp;   }

}



\### ✅ Next Goal:





I will continue the same new quest according to the array as well as the string and Linked list.

