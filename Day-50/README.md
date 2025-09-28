\# 🚀 Day 50 – DSA Challenge



\# LeetCode 33. Search in Rotated Sorted Array



\## Problem Statement

There is an integer array `nums` sorted in ascending order (with \*\*distinct values\*\*).



Before being passed to your function, `nums` is \*\*rotated\*\* at an unknown pivot index `k` (0 <= k < nums.length) such that the resulting array is:

\[nums\[k], nums\[k+1], ..., nums\[n-1], nums\[0], nums\[1], ..., nums\[k-1]]





Given the array `nums` \*\*after rotation\*\* and an integer `target`, return the index of `target` if it is in `nums`, otherwise return `-1`.



You must write an algorithm with `O(log n)` runtime complexity.



---



\### Example 1

\*\*Input:\*\*

nums = \[4,5,6,7,0,1,2], target = 0



\*\*Output:\*\*

4





---



\### Example 2

\*\*Input:\*\*

nums = \[4,5,6,7,0,1,2], target = 3



\*\*Output:\*\*

-1





---



\## Constraints

\- `1 <= nums.length <= 5000`

\- `-10^4 <= nums\[i] <= 10^4`

\- All values of `nums` are \*\*unique\*\*

\- `nums` is guaranteed to be rotated at some pivot

\- `-10^4 <= target <= 10^4`



---



\## Approach

We can use \*\*binary search\*\* with modification:

1\. Find the mid index.

2\. Determine which side (left or right) is sorted.

3\. If the target lies within the sorted half, discard the other half.

4\. Repeat until the target is found or search space is empty.



\*\*Time Complexity:\*\* `O(log n)`  

\*\*Space Complexity:\*\* `O(1)`



---



\## Java Solution

```java

class Solution {

&nbsp;   public int search(int\[] nums, int target) {

&nbsp;       int left = 0, right = nums.length - 1;

&nbsp;       

&nbsp;       while (left <= right) {

&nbsp;           int mid = left + (right - left) / 2;

&nbsp;           

&nbsp;           if (nums\[mid] == target) {

&nbsp;               return mid;

&nbsp;           }

&nbsp;           

&nbsp;           // Left half is sorted

&nbsp;           if (nums\[left] <= nums\[mid]) {

&nbsp;               if (target >= nums\[left] \&\& target < nums\[mid]) {

&nbsp;                   right = mid - 1;

&nbsp;               } else {

&nbsp;                   left = mid + 1;

&nbsp;               }

&nbsp;           }

&nbsp;           // Right half is sorted

&nbsp;           else {

&nbsp;               if (target > nums\[mid] \&\& target <= nums\[right]) {

&nbsp;                   left = mid + 1;

&nbsp;               } else {

&nbsp;                   right = mid - 1;

&nbsp;               }

&nbsp;           }

&nbsp;       }

&nbsp;       

&nbsp;       return -1;

&nbsp;   }

}

Key Insight



The rotated sorted array always has one half sorted.

Binary search leverages this fact to discard half of the search space in every iteration.

### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

