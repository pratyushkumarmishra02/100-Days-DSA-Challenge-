\# 🚀 Day 22 – DSA Challenge



This day focuses on some more sliding window problems like "Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold"

\& "Minimum Size Subarray Sum".



...

\## 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold



\*\*Problem Link:\*\* \[1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/)



\### Problem Statement

Given an integer array `arr` and two integers `k` and `threshold`, return the number of sub-arrays of size `k` whose average is greater than or equal to `threshold`.



\*\*Example:\*\*



Input: arr = \[2,2,2,2,5,5,5,8], k = 3, threshold = 4

Output: 3

Explanation: Sub-arrays = \[2,5,5], \[5,5,5], \[5,5,8]





\### Approach

\- Use a \*\*sliding window\*\* of size `k` to keep track of the sum of the current subarray.

\- For each window, check if `(sum / k) >= threshold`. If yes, increment the count.

\- Time Complexity: \*\*O(n)\*\*

\- Space Complexity: \*\*O(1)\*\*



\### Java Code

```java

class NumOfSubarrays {

&nbsp;   public int numOfSubarrays(int\[] arr, int k, int threshold) {

&nbsp;       if (arr == null || arr.length < k) return 0;

&nbsp;       int sum = 0;

&nbsp;       int count =0;

&nbsp;       int target = threshold \* k;

&nbsp;       for(int i=0;i<k;i++){

&nbsp;           sum+=arr\[i];

&nbsp;       }

&nbsp;       

&nbsp;       if(sum>=target) count++;



&nbsp;       for(int i=k;i<arr.length;i++){

&nbsp;           sum+=arr\[i] - arr\[i-k];

&nbsp;           if(sum>=target){

&nbsp;               count++;

&nbsp;           }

&nbsp;       }

&nbsp;       return count;

&nbsp;   }

}



209\. Minimum Size Subarray Sum

Problem Link:https://leetcode.com/problems/minimum-size-subarray-sum/description/

Problem Statement

Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0.



Example:

Input: target = 7, nums = \[2,3,1,2,4,3]

Output: 2

Explanation: The subarray \[4,3] has the minimal length under the problem constraint.



Approach

Use a sliding window to expand and contract the window until the sum is less than target.



Keep track of the smallest window size that satisfies the condition.



Time Complexity: O(n)



Space Complexity: O(1)



Java Code



...java

class MinSubArrayLen {

&nbsp;   public int minSubArrayLen(int target, int\[] nums) {

&nbsp;       int minLength = Integer.MAX\_VALUE;

&nbsp;       int sum = 0;

&nbsp;       int left = 0;



&nbsp;       for (int right = 0; right < nums.length; right++) {

&nbsp;           sum += nums\[right];

&nbsp;           

&nbsp;           while (sum >= target) {

&nbsp;               minLength = Math.min(minLength, right - left + 1);

&nbsp;               sum -= nums\[left];

&nbsp;               left++;

&nbsp;           }

&nbsp;       }



&nbsp;       return minLength == Integer.MAX\_VALUE ? 0 : minLength;

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



