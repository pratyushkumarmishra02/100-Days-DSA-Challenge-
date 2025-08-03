\# 🚀 Day 11 – DSA Challenge







This day focuses on practicing array-related problems, such as 🔁 Rotate Array \\\& 🔺 Pascal's Triangle – Java Solutions. 







This repository includes Java implementations for two classic string-related problems from Leetcode:







1\\. \\\*\\\*\\\[Leetcode 189: Rotate Array](https://leetcode.com/problems/longest-palindromic-substring/?envType=problem-list-v2\&envId=string)\\\*\\\*



---



\## 🧩 Problem Statement



Given a string `s`, return the longest \*\*palindromic\*\* substring in `s`.



A palindrome is a string that reads the same backward as forward.



---



\### ✅ Constraints



\- `1 <= s.length <= 1000`

\- `s` consists of only digits and English letters.



---



\## 💡 Examples



\### Example 1:



Input: s = "babad"

Output: "bab"





\### Example 2:

Input: s = "cbbd"

Output: "bb"





---



\## 🔍 Approach



There are multiple ways to solve this problem. Here, we use the \*\*Expand Around Center\*\* technique.



\### 🧠 Expand Around Center:



For each index in the string:

\- Expand around a single character (odd-length palindrome)

\- Expand around a pair of characters (even-length palindrome)



Keep track of the longest substring found during this expansion.



---



\## 💻 Java Code (Expand Around Center)



```java

public class LongestPalindrome {

&nbsp;   public String longestPalindrome(String s) {

&nbsp;       if (s == null || s.length() < 1) return "";

&nbsp;       

&nbsp;       int start = 0, end = 0;



&nbsp;       for (int i = 0; i < s.length(); i++) {

&nbsp;           int len1 = expandFromCenter(s, i, i);     // Odd length

&nbsp;           int len2 = expandFromCenter(s, i, i + 1); // Even length

&nbsp;           int len = Math.max(len1, len2);

&nbsp;           

&nbsp;           if (len > end - start) {

&nbsp;               start = i - (len - 1) / 2;

&nbsp;               end = i + len / 2;

&nbsp;           }

&nbsp;       }



&nbsp;       return s.substring(start, end + 1);

&nbsp;   }



&nbsp;   private int expandFromCenter(String s, int left, int right) {

&nbsp;       while (left >= 0 \&\& right < s.length() \&\& s.charAt(left) == s.charAt(right)) {

&nbsp;           left--;

&nbsp;           right++;

&nbsp;       }

&nbsp;       return right - left - 1;

&nbsp;   }

}



\##⏱ Time and Space Complexity

| Complexity | Value |

| ---------- | ----- |

| 🕒 Time    | O(n²) |

| 🛑 Space   | O(1)  |





\### ✅ Next Goal:





I will continue the same new quest according to the array as well as the string

