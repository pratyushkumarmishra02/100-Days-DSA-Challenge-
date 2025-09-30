\# 🚀 Day 59 – DSA Challenge



\# Balanced Brackets Checker in Java



This program checks whether a given string of parentheses and braces is \*\*balanced\*\*.  

It uses a \*\*stack-based approach\*\* to ensure that every opening bracket has a corresponding closing bracket in the correct order.



---



\## 📌 Problem Description

Given `n` strings consisting of `{`, `}`, `(`, and `)`, determine if each string is balanced:

\- Every opening `{` must have a matching closing `}`.

\- Every opening `(` must have a matching closing `)`.

\- Brackets must close in the correct order.



The program prints `true` if a string is balanced, otherwise `false`.



---



\## 📥 Input Format

1\. The first line contains an integer `n` (number of test cases).

2\. The next `n` lines each contain a string `s` consisting of `{`, `}`, `(`, `)`.



---



\## 📤 Output Format

For each test case, print:

\- `"true"` if the string is balanced.

\- `"false"` otherwise.



---



\## ✅ Example



\### Input

3

{}

({})

({)}





\### Output

true

true

false



---



\## ⚙️ How It Works

1\. A `Stack<Character>` is used to store opening brackets.

2\. Traverse each character in the string:

&nbsp;  - If it's `{` or `(` → push onto the stack.

&nbsp;  - If it's `}` or `)`:

&nbsp;    - If the stack is empty → return `false`.

&nbsp;    - Pop the top of the stack and check if it matches the closing bracket.

&nbsp;    - If not → return `false`.

3\. After processing, if the stack is empty → return `true`; otherwise → `false`.



---



\## Java Solution



```java

import java.util.*;

class Parser {
    public String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ')') {
                if (stack.isEmpty()) return "false";
                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ')' && top != '(')) {
                    return "false";
                }
            }
        }
        return stack.isEmpty() ? "true" : "false";
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        Parser parser = new Parser();
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            System.out.println(parser.isBalanced(s));
        }
    }
}

### ✅ Next Goal:

I will continue the same new quest according to the array as well as the string and Linked list

