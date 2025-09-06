\# 🚀 Day 40 – DSA Challenge



This day focuses on some bit manipulation question like "Minimum Operations to Make the Integer Zero" .

...



\# LeetCode 2749 — Minimum Operations to Make the Integer Zero



\*\*Difficulty:\*\* Medium  

\*\*Topics:\*\* Bit Manipulation, Brainteaser, Enumeration



\## Problem Statement



Given two integers, `num1` and `num2`, you may perform the following operation any number of times (including zero):



1\. Choose any integer `i` in the range \\\[0, 60\\].

2\. Subtract `(2^i + num2)` from `num1`.



You must reduce `num1` to \*\*exactly 0\*\* using the minimum number of operations. If it is impossible, return `-1` :contentReference\[oaicite:0]{index=0}.



\## Key Insight



If you perform exactly `k` operations:



\- You subtract `k \* num2` in total.

\- You also subtract `k` powers of two (one for each operation).



Thus:



num1 - k \* num2 = sum of k powers of two



Let:



target = num1 - k \* num2





To be valid:



\- `target` must be non-negative (`target >= 0`)

\- `target` must be expressible as exactly `k` powers of two.

&nbsp; - The \_minimum\_ number of powers needed is `bit\_count(target)` (number of 1s in its binary form).

&nbsp; - The \_maximum\_ is `target` itself (if you use `1 = 2^0` that many times).



Hence, `bit\_count(target) ≤ k ≤ target` must hold for a solution:contentReference\[oaicite:1]{index=1}.



\## Algorithm Outline



1\. Loop `k` from `0` (or `1`) up to a reasonable limit, e.g., 60.

2\. Compute `target = num1 - k \* num2`.

3\. If `target < 0`, you can break—further `k` will only increase the subtraction.

4\. Otherwise, check:

&nbsp;  - Does `bit\_count(target) ≤ k ≤ target` hold?

&nbsp;  - If yes, return `k`.

5\. If the loop ends with no valid `k`, return `-1`.



\## Complexity



\- \*\*Time Complexity:\*\* \\(O(1)\\) — You check at most 61 values of `k`, and each check involves constant-time bit operations :contentReference\[oaicite:2]{index=2}.

\- \*\*Space Complexity:\*\* \\(O(1)\\).



\## Code Examples



\### Python



```java

class Solution {

&nbsp;   public int makeTheIntegerZero(int num1, int num2) {

&nbsp;       for (long k = 0; k <= 60; ++k) {

&nbsp;           long target = num1 - k \* num2;

&nbsp;           if (target < 0) {

&nbsp;               break;

&nbsp;           }

&nbsp;           if (Long.bitCount(target) <= k \&\& k <= target) {

&nbsp;               return (int) k;

&nbsp;           }

&nbsp;       }

&nbsp;       return -1;

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list



