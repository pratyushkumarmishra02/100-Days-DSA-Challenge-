\# 🚀 Day 52 – DSA Challenge





---



\## 📘 `README.md` for \*\*LeetCode 66. Plus One\*\*

```markdown

\# LeetCode 66. Plus One



\## Problem Statement

You are given a \*\*large integer\*\* represented as an integer array `digits`, where:

\- `digits\[i]` is the i-th digit of the integer.

\- The digits are ordered from most significant to least significant.

\- The large integer does not contain leading zeros (except the number `0` itself).



Increment the large integer by one and return the resulting array of digits.



---



\### Example 1

\*\*Input:\*\*

digits = \[1,2,3]



\*\*Output:\*\*

\[1,2,4]



\*\*Explanation:\*\* The integer is `123`. Incrementing by one gives `124`.



---



\### Example 2

\*\*Input:\*\*

digits = \[9]



\*\*Output:\*\*

\[1,0]



\*\*Explanation:\*\* The integer is `9`. Incrementing by one gives `10`.



---



\## Constraints

\- `1 <= digits.length <= 100`

\- `0 <= digits\[i] <= 9`

\- `digits` does not contain any leading zero, except the number `0`.



---



\## Approach

\- Start from the last digit and add `1`.

\- If the digit becomes `10`, set it to `0` and carry over `1`.

\- Continue until no carry remains.

\- If a carry remains after processing all digits, add `1` at the beginning.



\*\*Time Complexity:\*\* `O(n)`  

\*\*Space Complexity:\*\* `O(1)` (excluding output array)



---



\## Java Solution

```java

class Solution {

&nbsp;   public int\[] plusOne(int\[] digits) {

&nbsp;       for (int i = digits.length - 1; i >= 0; i--) {

&nbsp;           if (digits\[i] < 9) {

&nbsp;               digits\[i]++;

&nbsp;               return digits;

&nbsp;           }

&nbsp;           digits\[i] = 0;

&nbsp;       }

&nbsp;       

&nbsp;       int\[] result = new int\[digits.length + 1];

&nbsp;       result\[0] = 1;

&nbsp;       return result;

&nbsp;   }

}


### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

