\# 🚀 Day 45 – DSA Challenge



\# LeetCode 3005. Count Elements With Maximum Frequency



\## Problem Statement



You are given an array of integers `nums`.  

The \*\*frequency\*\* of an element is the number of times it appears in the array.



Return the \*\*total number of elements\*\* in `nums` that have the \*\*maximum frequency\*\*.



---



\### Example 1:

\*\*Input:\*\*



nums = \[1,2,2,3,1,4]

\*\*Output:\*\*

4

\*\*Explanation:\*\*

\- The elements `1` and `2` both have frequency `2`.

\- Maximum frequency = `2`.

\- Total elements contributing = `2 (for 1)` + `2 (for 2)` = `4`.



---



\### Example 2:

\*\*Input:\*\*

nums = \[1,2,3,4,5]

\*\*Output:\*\*

5



\*\*Explanation:\*\*

\- Every number occurs once.

\- Maximum frequency = `1`.

\- Total elements contributing = `1+1+1+1+1 = 5`.



---



\## Constraints

\- `1 <= nums.length <= 100`

\- `1 <= nums\[i] <= 100`



---



\## Approach



1\. Count the frequency of each number using a `HashMap`.

2\. Find the \*\*maximum frequency\*\*.

3\. Iterate through the map and sum up the counts of all elements having this maximum frequency.

4\. Return the total.



\- \*\*Time Complexity:\*\* `O(n)` (single pass to count + single pass to compute result).

\- \*\*Space Complexity:\*\* `O(n)` (for the frequency map).



---



\## Java Solution



```java

import java.util.HashMap;

import java.util.Map;



class Solution {

&nbsp;   public int maxFrequencyElements(int\[] nums) {

&nbsp;       Map<Integer, Integer> freq = new HashMap<>();

&nbsp;       

&nbsp;       // Step 1: Count frequency

&nbsp;       for (int num : nums) {

&nbsp;           freq.put(num, freq.getOrDefault(num, 0) + 1);

&nbsp;       }

&nbsp;       

&nbsp;       // Step 2: Find max frequency

&nbsp;       int maxFreq = 0;

&nbsp;       for (int count : freq.values()) {

&nbsp;           maxFreq = Math.max(maxFreq, count);

&nbsp;       }

&nbsp;       

&nbsp;       // Step 3: Count total elements with max frequency

&nbsp;       int total = 0;

&nbsp;       for (int count : freq.values()) {

&nbsp;           if (count == maxFreq) {

&nbsp;               total += count;

&nbsp;           }

&nbsp;       }

&nbsp;       

&nbsp;       return total;

&nbsp;   }

}

\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

