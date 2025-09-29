\# 🚀 Day 51 – DSA Challenge



\# LeetCode 43. Multiply Strings



\## Problem Statement

Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.



You must not use any built-in BigInteger library or directly convert the inputs to integers.



---



\### Example 1

\*\*Input:\*\*

num1 = "2", num2 = "3"

\*\*Output:\*\*

"6"





\### Example 2

\*\*Input:\*\*

num1 = "123", num2 = "456"



\*\*Output:\*\*

"56088"





---



\## Constraints

\- `1 <= num1.length, num2.length <= 200`

\- `num1` and `num2` consist of digits only.

\- Both `num1` and `num2` do not contain leading zeros, except the number `"0"` itself.



---



\## Approach

\- Use the \*\*grade-school multiplication\*\* method:

&nbsp; - Multiply each digit of `num1` with each digit of `num2`.

&nbsp; - Store intermediate results in an integer array.

&nbsp; - Handle carries and construct the final string.

\- Remove leading zeros.



\*\*Time Complexity:\*\* `O(m \* n)` where `m` and `n` are lengths of `num1` and `num2`.  

\*\*Space Complexity:\*\* `O(m + n)`



---



\## Java Solution

```java

class Solution {

&nbsp;   public String multiply(String num1, String num2) {

&nbsp;       int m = num1.length(), n = num2.length();

&nbsp;       int\[] result = new int\[m + n];

&nbsp;       

&nbsp;       for (int i = m - 1; i >= 0; i--) {

&nbsp;           for (int j = n - 1; j >= 0; j--) {

&nbsp;               int mul = (num1.charAt(i) - '0') \* (num2.charAt(j) - '0');

&nbsp;               int sum = mul + result\[i + j + 1];

&nbsp;               

&nbsp;               result\[i + j] += sum / 10;

&nbsp;               result\[i + j + 1] = sum % 10;

&nbsp;           }

&nbsp;       }

&nbsp;       

&nbsp;       StringBuilder sb = new StringBuilder();

&nbsp;       for (int num : result) {

&nbsp;           if (!(sb.length() == 0 \&\& num == 0)) {

&nbsp;               sb.append(num);

&nbsp;           }

&nbsp;       }

&nbsp;       

&nbsp;       return sb.length() == 0 ? "0" : sb.toString();

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

