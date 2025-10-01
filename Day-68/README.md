\# 🚀 Day 68 – DSA Challenge

\# 📘 Balanced Brackets Checker



\## 📖 Overview

This project demonstrates how to use \*\*Java's Stack\*\* to check whether a string of brackets is balanced.  

Balanced brackets mean that each opening bracket has a corresponding closing bracket in the correct order.  

Supported brackets: `()`, `{}`, `\[]`.



---



\## 🛠️ Features

\- Supports multiple types of brackets: parentheses `()`, curly braces `{}`, and square brackets `\[]`.

\- Reads strings continuously until EOF (end of input).

\- Prints `true` if the brackets in the string are balanced, `false` otherwise.

\- Uses a \*\*stack-based approach\*\* for efficient checking.



---



\## 📂 File Structure

Solution.java # Main Java file

README.md # Project documentation





---



\## 💻 Code Example

```java

import java.util.\*;

import java.io.\*;



public class Solution {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       while(sc.hasNextLine()) {

&nbsp;           String s = sc.nextLine();

&nbsp;           System.out.println(isBalanced(s));

&nbsp;       }

&nbsp;   }



&nbsp;   // Stack-based method for checking balance

&nbsp;   public static boolean isBalanced(String s) {

&nbsp;       Stack<Character> stack = new Stack<>();

&nbsp;       for(char c : s.toCharArray()) {

&nbsp;           if(c == '(' || c == '{' || c == '\[') {

&nbsp;               stack.push(c);

&nbsp;           } else if(c == ')' || c == '}' || c == ']') {

&nbsp;               if(stack.isEmpty()) return false;

&nbsp;               char top = stack.pop();

&nbsp;               if((c == ')' \&\& top != '(') ||

&nbsp;                  (c == '}' \&\& top != '{') ||

&nbsp;                  (c == ']' \&\& top != '\[')) {

&nbsp;                   return false;

&nbsp;               }

&nbsp;           }

&nbsp;       }

&nbsp;       return stack.isEmpty();

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list





