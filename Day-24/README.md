\# 🚀 Day 24 – DSA Challenge



This day focuses on some basics of recursion and some string-related problems like "Largest 3-Same-Digit Number in String" and 	" Power of Four"



...



\## 1. 2264 – Largest 3-Same-Digit Number in String



\*\*Problem Statement\*\*  

Given a string `num` representing a numeric value, find the \*\*largest "good" integer\*\* that appears as a substring. A "good" integer is defined as:

\- A substring of length exactly 3.

\- All three characters are the same digit (e.g., `"777"`).



Return the largest such substring; if none exist, return an empty string.



\### Example

\- \*\*Input:\*\* `num = "6777133339"`  

\- \*\*Output:\*\* `"777"`  

&nbsp; Explanation: `"777"` and `"333"` are the only "good" substrings; `"777"` is larger.



\### Approach

Iterate through the string from index `2` to end, checking if the current and the two preceding characters are equal. Track the maximum substring encountered.



\### Complexity

\- \*\*Time:\*\* O(n) — single pass through the string  

\- \*\*Space:\*\* O(1) — constant additional space



\### Java Solution

```java

class Solution {

&nbsp;   public String largestGoodInteger(String num) {

&nbsp;       String ans = "";

&nbsp;       for (int i = 2; i < num.length(); i++) {

&nbsp;           if (num.charAt(i) == num.charAt(i - 1)

&nbsp;            \&\& num.charAt(i - 1) == num.charAt(i - 2)) {

&nbsp;               String curr = num.substring(i - 2, i + 1);

&nbsp;               if (curr.compareTo(ans) > 0) {

&nbsp;                   ans = curr;

&nbsp;               }

&nbsp;           }

&nbsp;       }

&nbsp;       return ans;

&nbsp;   }

}



2\. 342 – Power of Four



Problem Statement

Determine if a given integer n is a power of four. In other words, check if there exists an integer x such that n == 4^x.



Example



Input: n = 16



Output: true (because 16 = 4²)



Approach



Use bitwise properties:



n > 0 ensures it's positive.



(n \& (n - 1)) == 0 ensures it's a power of two (only one bit set).



(n \& 0xAAAAAAAA) == 0 ensures the only set bit is in an even position — a property specific to powers of four.



Complexity



Time: O(1) — constant-time bit operations



Space: O(1)



Java Solution



```java



class Solution {

&nbsp;   public boolean isPowerOfFour(int n) {

&nbsp;       if(n==1) return true;

&nbsp;       if(n<1 || n%4 != 0) return false;

&nbsp;       return isPowerOfFour(n/4);

&nbsp;   }

}



| Problem                               | Technique      | Time | Space |

| ------------------------------------- | -------------- | ---- | ----- |

| Largest 3-Same-Digit Number in String | Substring scan | O(n) | O(1)  |

| Power of Four                         | Bitwise checks | O(1) | O(1)  |



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string







