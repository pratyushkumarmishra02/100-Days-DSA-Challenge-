\# 🚀 Day 49 – DSA Challenge



\# LeetCode 28. Find the Index of the First Occurrence in a String



\## Problem Statement

Given two strings `haystack` and `needle`, return the \*\*index of the first occurrence\*\* of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.



---



\### Example 1

\*\*Input:\*\*

haystack = "sadbutsad", needle = "sad"



\*\*Output:\*\*

0



\*\*Explanation:\*\*

\- `"sad"` occurs at index `0` and `6`.  

\- The first occurrence is at index `0`.



---



\### Example 2

\*\*Input:\*\*

haystack = "leetcode", needle = "leeto"



\*\*Output:\*\*

-1



\*\*Explanation:\*\*

\- `"leeto"` does not occur in `"leetcode"`.



---



\## Constraints

\- `1 <= haystack.length, needle.length <= 10^4`

\- `haystack` and `needle` consist of only lowercase English characters.



---



\## Approach

\- Use a \*\*sliding window\*\* of size `needle.length()`.

\- Compare substrings of `haystack` with `needle`.

\- Return the first index where they match.

\- If no match is found, return `-1`.



\*\*Time Complexity:\*\* `O((n-m+1) \* m)` in worst case (where `n = haystack.length`, `m = needle.length`)  

\*\*Space Complexity:\*\* `O(1)`



---



\## Java Solution

```java

class Solution {

&nbsp;   public int strStr(String haystack, String needle) {

&nbsp;       int n = haystack.length();

&nbsp;       int m = needle.length();

&nbsp;       

&nbsp;       for (int i = 0; i <= n - m; i++) {

&nbsp;           if (haystack.substring(i, i + m).equals(needle)) {

&nbsp;               return i;

&nbsp;           }

&nbsp;       }

&nbsp;       return -1;

&nbsp;   }

}

\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list



