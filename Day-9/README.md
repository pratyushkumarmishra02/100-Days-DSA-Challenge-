\# 🚀 Day 8 – DSA Challenge





This day focuses on practicing array-related problems like "House Robber" and Unique Paths for final destination. 





---



\## 📘 Problem Description



Given a string `s`, find the length of the \*\*longest substring\*\* without repeating characters.



---



\### 🧠 Example



\#### Example 1:

Input: s = "abcabcbb"

Output: 3

Explanation: The answer is "abc", with the length of 3.





---



\## ✅ Constraints



\- `0 <= s.length <= 5 \* 10^4`

\- `s` consists of English letters, digits, symbols, and spaces.



---



\## ✅ Approach



We use the \*\*sliding window\*\* technique with a \*\*HashSet\*\* or \*\*HashMap\*\* to keep track of characters in the current window.



\### Steps:

\- Use two pointers (`left` and `right`) to create a dynamic window.

\- Move the `right` pointer to expand the window.

\- If a character is already in the set, move `left` to shrink the window.

\- Keep updating the maximum length found.



---



\## 🚀 Java Code



```java

class Solution {

&nbsp;   public int lengthOfLongestSubstring(String s) {

&nbsp;       int start = 0,end=0,max\_len=0;

&nbsp;       Set<Character> set = new HashSet<>();

&nbsp;       while(end < s.length()){

&nbsp;           char c = s.charAt(end);

&nbsp;           if(!set.contains(c)){

&nbsp;               set.add(c);

&nbsp;               end++;

&nbsp;               max\_len = Math.max(max\_len,set.size());

&nbsp;           }else{

&nbsp;               set.remove(s.charAt(start));

&nbsp;               start++;

&nbsp;           }

&nbsp;       }

&nbsp;       return max\_len;

&nbsp;   }

}





\### ✅ Next Goal:





I will continue the same new quest according to the array as well as the string



