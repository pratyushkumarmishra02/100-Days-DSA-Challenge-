\# 🚀 Day 46 – DSA Challenge



\# LeetCode 412. Fizz Buzz



\## Problem Statement

Given an integer `n`, return a string array `answer` (1-indexed) where:

\- `answer\[i] == "FizzBuzz"` if `i` is divisible by 3 and 5.

\- `answer\[i] == "Fizz"` if `i` is divisible by 3.

\- `answer\[i] == "Buzz"` if `i` is divisible by 5.

\- `answer\[i] == i` (as a string) if none of the above conditions are true.



---



\### Example

\*\*Input:\*\*

n = 5



\*\*Output:\*\*

\["1","2","Fizz","4","Buzz"]





---



\## Approach

\- Iterate from `1` to `n`.

\- Check divisibility by 15, 3, and 5 in order.

\- Otherwise, return the number as a string.



\*\*Time Complexity:\*\* `O(n)`  

\*\*Space Complexity:\*\* `O(n)`



---



\## Java Solution

```java

import java.util.\*;



class Solution {

&nbsp;   public List<String> fizzBuzz(int n) {

&nbsp;       List<String> result = new ArrayList<>();

&nbsp;       

&nbsp;       for (int i = 1; i <= n; i++) {

&nbsp;           if (i % 15 == 0) {

&nbsp;               result.add("FizzBuzz");

&nbsp;           } else if (i % 3 == 0) {

&nbsp;               result.add("Fizz");

&nbsp;           } else if (i % 5 == 0) {

&nbsp;               result.add("Buzz");

&nbsp;           } else {

&nbsp;               result.add(String.valueOf(i));

&nbsp;           }

&nbsp;       }

&nbsp;       

&nbsp;       return result;

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

