\# 🚀 Day 35 – DSA Challenge



LeetCode 179. Largest Number

Problem Statement

Given a list of non-negative integers, arrange them to form the largest possible number and return it as a string.



Constraints

Integers can be very large when concatenated, so return type is string.



Input array length ranges from 1 to 100.



Numbers are non-negative.



Approach

Convert integers to strings.



Sort strings using a custom comparator based on concatenation comparison (a+b vs b+a).



Join sorted strings.



Handle edge case when result is multiple zeros by returning "0".



Time Complexity

O

(

n

log

⁡

n

×

k

)

O(nlogn×k), where 

n

n is number of elements and 

k

k is average string length (comparison cost).



Space Complexity

O

(

n

k

)

O(nk) for storing string array.



Sample Code (Java)



```java

class Solution {

&nbsp;   public String largestNumber(int\[] nums) {

&nbsp;       List<String> list = new ArrayList<>();

&nbsp;       for(int i : nums){

&nbsp;           list.add(String.valueOf(i));

&nbsp;       }

&nbsp;       Collections.sort(list, (a, b) -> compare(a, b));

&nbsp;       String ans = String.join("", list);

&nbsp;       if(allZeros(ans)) return "0";

&nbsp;       return ans;

&nbsp;   }



&nbsp;   private boolean allZeros(String s) {

&nbsp;       for(char c : s.toCharArray()) {

&nbsp;           if(c != '0') return false;

&nbsp;       }

&nbsp;       return true;

&nbsp;   }



&nbsp;   private int compare(String a, String b) {

&nbsp;       int i = 0, j = 0;

&nbsp;       while(i < a.length() || j < b.length()) {

&nbsp;           if(i == a.length()) i = 0;

&nbsp;           if(j == b.length()) j = 0;

&nbsp;           if(a.charAt(i) > b.charAt(j)) return -1;

&nbsp;           if(a.charAt(i) < b.charAt(j)) return 1;

&nbsp;           i++;

&nbsp;           j++;

&nbsp;       }

&nbsp;       return 0;

&nbsp;   }

}







