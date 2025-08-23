\# 🚀 Day 27 – DSA Challenge



\# LeetCode 27: Remove Element



\## Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` \*\*in-place\*\*. The relative order of the elements may be changed.



Since it is impossible to change the length of the array in some languages, you must instead place the result in the \*\*first part\*\* of the array `nums`.  

More formally, if there are `k` elements after removing the duplicates, then the first `k` elements of `nums` should hold the final result.  

It does not matter what you leave beyond the first `k` elements.



Return `k` after placing the final result in the first `k` slots of `nums`.



---



\## Example 1

\*\*Input:\*\*

nums = \[3,2,2,3], val = 3



\*\*Output:\*\*

k = 2, nums = \[2,2,,]



Explanation: Your function should return `k = 2`, with the first two elements of `nums` being `2`.  

It does not matter what you leave beyond the returned `k` (thus `\_` are placeholders).



---



\## Example 2

\*\*Input:\*\*

nums = \[0,1,2,2,3,0,4,2], val = 2



\*\*Output:\*\*

k = 5, nums = \[0,1,3,0,4,,,\_]

Explanation: Your function should return `k = 5`, with the first five elements of `nums` containing `0, 1, 3, 0, 4`.  

It does not matter what values are set beyond `k`.



---



\## Constraints

\- `0 <= nums.length <= 100`

\- `0 <= nums\[i] <= 50`

\- `0 <= val <= 100`



---



\## Approach

1\. Use two pointers:

&nbsp;  - One pointer (`i`) iterates through the array.

&nbsp;  - Another pointer (`k`) tracks the position of the next valid element.

2\. If the current element is \*\*not equal\*\* to `val`, copy it to position `k` and increment `k`.

3\. At the end, return `k` as the new length of the array.



---



\## Java Solution

```java

class Solution {

&nbsp;   public int removeElement(int\[] nums, int val) {

&nbsp;       int k = 0;

&nbsp;       for (int i = 0; i < nums.length; i++) {

&nbsp;           if (nums\[i] != val) {

&nbsp;               nums\[k] = nums\[i];

&nbsp;               k++;

&nbsp;           }

&nbsp;       }

&nbsp;       return k;

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

