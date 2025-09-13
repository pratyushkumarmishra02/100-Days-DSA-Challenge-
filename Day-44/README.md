\# 🚀 Day 44 – DSA Challenge



\# LeetCode 3541 — Find Most Frequent Vowel and Consonant



\*\*Difficulty:\*\* Easy  

\*\*Topics:\*\* String, Hash Table, Frequency Counting



---



\## Problem Statement



You are given a string `s` consisting of lowercase English letters (`'a'` to `'z'`).  

You need to find:



1\. The vowel (`'a'`, `'e'`, `'i'`, `'o'`, or `'u'`) that appears \*\*most frequently\*\* in `s`  

2\. The consonant (any letter not in the vowel list) that appears \*\*most frequently\*\* in `s`



Return the \*\*sum\*\* of these two frequencies.



\- If there are \*\*no vowels\*\* in the string, treat the vowel frequency as `0`.

\- If there are \*\*no consonants\*\*, treat the consonant frequency as `0`. :contentReference\[oaicite:0]{index=0}



---



\## Key Insight



\- We only care about \*counts\* of characters, not their positions.

\- We can maintain two data structures (or maps/arrays): one for vowels, one for consonants.

\- As we traverse the string, update counts accordingly.

\- Finally find the maximum count in vowels, maximum count in consonants, sum them.



---



\## Algorithm



1\. Initialize two maps/dictionaries (or frequency arrays):  

&nbsp;  - `vowelMap` for counts of vowels  

&nbsp;  - `consonantMap` for counts of consonants  

2\. Define the set of vowels: `{'a','e','i','o','u'}`  

3\. Iterate over each character `c` in `s`:

&nbsp;  - If `c` is a vowel, increment `vowelMap\[c]`

&nbsp;  - Else, increment `consonantMap\[c]`

4\. After counting:

&nbsp;  - Let `vFreq = max frequency value in vowelMap` (or `0` if map is empty)

&nbsp;  - Let `cFreq = max frequency value in consonantMap` (or `0` if empty)

5\. Return `vFreq + cFreq`



\*\*Time Complexity:\*\* `O(n + k)` where `n = length of s`, `k = number of distinct letters` (at most 26).  

\*\*Space Complexity:\*\* `O(k)` i.e. at most constant extra space (`O(26)`) beyond input. :contentReference\[oaicite:1]{index=1}



---



\## Code Example



\### Java



```java

class Solution {

&nbsp;   public int maxFreqSum(String s) {

&nbsp;       Map<Character, Integer> vMap = new HashMap<>();

&nbsp;       Map<Character, Integer> cMap = new HashMap<>();



&nbsp;       String vowels = "aeiou";



&nbsp;       for (char c : s.toCharArray()) {

&nbsp;           if (vowels.indexOf(c) != -1) {

&nbsp;               vMap.put(c, vMap.getOrDefault(c, 0) + 1);

&nbsp;           } else {

&nbsp;               cMap.put(c, cMap.getOrDefault(c, 0) + 1);

&nbsp;           }

&nbsp;       }



&nbsp;       int vFrq = 0;

&nbsp;       for (int freq : vMap.values()) {

&nbsp;           if (freq > vFrq) {

&nbsp;               vFrq = freq;

&nbsp;           }

&nbsp;       }



&nbsp;       int cFrq = 0;

&nbsp;       for (int freq : cMap.values()) {

&nbsp;           if (freq > cFrq) {

&nbsp;               cFrq = freq;

&nbsp;           }

&nbsp;       }



&nbsp;       return vFrq + cFrq;

&nbsp;   }

}





| Input             | Most Frequent Vowel                                      | Most Frequent Consonant                   | Output      |

| ----------------- | -------------------------------------------------------- | ----------------------------------------- | ----------- |

| `"aaabc"`         | `'a'` appears 3 times                                    | `'b'` appears 1 time                      | `3 + 1 = 4` |

| `"xyz"`           | no vowels → 0                                            | `'x'` / `'y'` / `'z'` appears 1 time each | `0 + 1 = 1` |

| `"aeiouaeiouzzz"` | `'a','e','i','o','u'` each appear 2 times → pick any → 2 | `'z'` appears 3 times                     | `2 + 3 = 5` |





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list



