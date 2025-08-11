\# 🚀 Day 19 – DSA Challenge



This day focuses on the sliding window problem like "Defuse the bomb"



...

LeetCode 1652 - Defuse the Bomb

Problem Description

You have a circular array of integers called code and a key integer k.

You need to create a new array result of the same length as code where each element is replaced according to the following rules:



If k > 0: Replace code\[i] with the sum of the next k elements.



If k < 0: Replace code\[i] with the sum of the previous |k| elements.



If k == 0: Replace all elements with 0.



The array is circular, meaning:



The element after the last element is the first element.



The element before the first element is the last element.



Example 1

Input:

code = \[5, 7, 1, 4]

k = 3





Output:

\[12, 10, 16, 13]



Explanation:



For index 0: sum of next 3 elements → 7 + 1 + 4 = 12



For index 1: sum of next 3 elements → 1 + 4 + 5 = 10



For index 2: sum of next 3 elements → 4 + 5 + 7 = 16



For index 3: sum of next 3 elements → 5 + 7 + 1 = 13





Complexity

Time Complexity: O(n × |k|), where n is the length of code.



Space Complexity: O(n) for the result array.



\#### Code (Java)



```java

class Solution {

&nbsp;   public int\[] decrypt(int\[] code, int k) {

&nbsp;       int n = code.length;

&nbsp;       int\[] result = new int\[n];

&nbsp;       

&nbsp;       if (k == 0) return result; // all zeros

&nbsp;       

&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           int sum = 0;

&nbsp;           if (k > 0) {

&nbsp;               for (int j = 1; j <= k; j++) {

&nbsp;                   sum += code\[(i + j) % n];

&nbsp;               }

&nbsp;           } else {

&nbsp;               for (int j = 1; j <= -k; j++) {

&nbsp;                   sum += code\[(i - j + n) % n];

&nbsp;               }

&nbsp;           }

&nbsp;           result\[i] = sum;

&nbsp;       }

&nbsp;       return result;

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

