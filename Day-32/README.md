\# 🚀 Day 32 – DSA Challenge



📘 LeetCode 31 - Next Permutation

Problem Statement



The Next Permutation problem asks you to rearrange numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must be rearranged as the lowest possible order (i.e., sorted in ascending order).



You must do this in-place and use only constant extra memory.



Example 1



Input:

nums = \[1,2,3]



Output:

\[1,3,2]



Example 2

Input:

nums = \[1,1,5]

Output:

\[1,5,1]

Approach



Traverse from the end and find the first decreasing element (i).



If found, then again traverse from the end and find the first element greater than nums\[i], then swap them.



Finally, reverse the subarray from i+1 to the end to get the next permutation.



If no such element is found, simply reverse the entire array.



Time Complexity: O(n)

Space Complexity: O(1)



\## Sample Java Implementation



```java

class NextPermutation {

&nbsp;   public void nextPermutation(int\[] nums) {

&nbsp;       int p = -1;

&nbsp;       int n=nums.length;

&nbsp;       for(int i=n-2;i>=0;i--){

&nbsp;           if(nums\[i]<nums\[i+1]){

&nbsp;               p=i;

&nbsp;               break;

&nbsp;           }

&nbsp;       }

&nbsp;       if(p==-1){

&nbsp;           Arrays.sort(nums);

&nbsp;           return;

&nbsp;       }

&nbsp;       for(int i=n-1;i>p;i--){

&nbsp;           if(nums\[i]>nums\[p]){

&nbsp;               nums\[p]=nums\[p]+nums\[i];

&nbsp;               nums\[i]=nums\[p]-nums\[i];

&nbsp;               nums\[p]=nums\[p]-nums\[i];



&nbsp;               break;

&nbsp;           }

&nbsp;       }



&nbsp;       int l=p+1,r=n-1;

&nbsp;       while(l<r){

&nbsp;           nums\[l]=nums\[l]+nums\[r];

&nbsp;           nums\[r]=nums\[l]-nums\[r];

&nbsp;           nums\[l]=nums\[l]-nums\[r];



&nbsp;           l++;

&nbsp;           r--;

&nbsp;       }

&nbsp;   }

}



📘 LeetCode 26 - Remove Duplicates from Sorted Array

Problem Statement



Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

The relative order of elements should be kept the same.



Return the number of unique elements in nums.



Example 1



Input:

nums = \[1,1,2]



Output:

2, nums = \[1,2,\_]



(\_ indicates leftover values don’t matter)



Example 2



Input:

nums = \[0,0,1,1,1,2,2,3,3,4]

Output:

5, nums = \[0,1,2,3,4,\_,\_,\_,\_,\_]

Approach



Use a two-pointer technique:



Pointer i tracks the position of the last unique element.



Iterate through the array with another pointer j.



Whenever a new unique element is found, move it to i+1.



Return i+1 as the number of unique elements.



Time Complexity: O(n)

Space Complexity: O(1)



\## Sample Java Implementation



```java


class RemoveDuplicates {

&nbsp;   public int removeDuplicates(int\[] nums) {

&nbsp;       if (nums.length == 0) return 0;

&nbsp;       int k = 1; 

&nbsp;       for (int i = 1; i < nums.length; i++) {

&nbsp;           if (nums\[i] != nums\[k - 1]) {

&nbsp;               nums\[k] = nums\[i];

&nbsp;               k++;

&nbsp;           }

&nbsp;       }

&nbsp;       return k;

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

