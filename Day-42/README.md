\# 🚀 Day 42 – DSA Challenge



\# LeetCode 7 — Reverse Integer



\*\*Difficulty:\*\* Medium  

\*\*Topics:\*\* Math



---



\## Problem Statement



Given a signed 32-bit integer `x`, return its digits reversed.  

If reversing `x` causes the value to go outside the \*\*32-bit signed integer range\*\*:



\[-2^31, 2^31 - 1] → \[-2147483648, 2147483647]





then return `0`.



---



\## Examples



\### Example 1



Input: x = 123

Output: 321



\### Example 2

Input: x = -123

Output: -321





\### Example 3

Input: x = 120

Output: 21





---



\## Key Insight



\- Reversing digits can be done by repeatedly taking the \*\*last digit\*\* using `x % 10` and building the result.

\- Overflow needs to be checked \*\*before\*\* multiplying by 10 and adding the digit.

\- Use 32-bit integer bounds:

&nbsp; - `INT\_MAX = 2^31 - 1 = 2147483647`

&nbsp; - `INT\_MIN = -2^31 = -2147483648`



---



\## Algorithm



1\. Initialize `rev = 0`.

2\. While `x != 0`:

&nbsp;  - Extract the last digit: `digit = x % 10`.

&nbsp;  - Update `x = x / 10` (integer division).

&nbsp;  - Before adding, check for overflow:

&nbsp;    - If `rev > INT\_MAX // 10` or  

&nbsp;      `rev == INT\_MAX // 10 and digit > 7` → return `0`.

&nbsp;    - If `rev < INT\_MIN // 10` or  

&nbsp;      `rev == INT\_MIN // 10 and digit < -8` → return `0`.

&nbsp;  - Update `rev = rev \* 10 + digit`.

3\. Return `rev`.



\*\*Time Complexity:\*\* `O(log10(x))` (since we process each digit once)  

\*\*Space Complexity:\*\* `O(1)`



---



\## Code Implementations



\### Java

```java

class ReverseInteger {

&nbsp;   public int reverse(int x) {

&nbsp;       boolean neg = x<0;

&nbsp;       StringBuilder sb = new StringBuilder(Integer.toString(Math.abs(x)));

&nbsp;       sb.reverse();

&nbsp;       int n;

&nbsp;       try {

&nbsp;           n = Integer.parseInt(sb.toString());

&nbsp;       } catch (NumberFormatException e) {

&nbsp;           return 0; 

&nbsp;       }

&nbsp;       return neg?-n:n;

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

