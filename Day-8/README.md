\# 🚀 Day 8 – DSA Challenge



This day focuses on practicing array-related problems like "House Robber" and Unique Paths for final destination. 



---



\## 📘 Problem Description



You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.  

However, adjacent houses have security systems connected, and \*\*you cannot rob two adjacent houses\*\* on the same night.



Given an integer array `nums` representing the amount of money of each house, return the \*\*maximum amount\*\* of money you can rob \*\*without alerting the police\*\*.



---



\## 🧠 Example



\### Input:

nums = \[2,7,9,3,1]





\### Output:

12





\### Explanation:

Rob house 1 (money = 2) + rob house 3 (money = 9) + rob house 5 (money = 1) = \*\*12\*\*.



---



\## 🧾 Constraints



\- `1 <= nums.length <= 100`

\- `0 <= nums\[i] <= 400`



---



\## ✅ Approach



This is a classic \*\*Dynamic Programming\*\* problem. At each house, you have two choices:



1\. \*\*Rob it\*\* → add its value to the maximum from two houses before.

2\. \*\*Skip it\*\* → take the max from the previous house.



Use a bottom-up DP approach to build the solution.



---



\## 🚀 Java Solution



```java

class Solution {

&nbsp;   public int rob(int\[] nums) {

&nbsp;       if(nums == null || nums.length == 0) return 0;

&nbsp;       if(nums.length == 1) return nums\[0];

&nbsp;       int prev2 = 0, prev1 = 0;

&nbsp;       for(int n : nums){

&nbsp;           int temp = prev1;

&nbsp;           prev1 = Math.max(prev2 + n, prev1);

&nbsp;           prev2 = temp;

&nbsp;       }

&nbsp;       return prev1;

&nbsp;   }

}



\## 📘 Problem Description



A robot is located at the top-left corner of an `m x n` grid (marked as (0, 0)).



The robot can only move either \*\*down\*\* or \*\*right\*\* at any point in time.  

The robot is trying to reach the bottom-right corner (marked as (m - 1, n - 1)).



How many possible \*\*unique paths\*\* are there?



---



\## 🔒 Constraints



\- `1 <= m, n <= 100`

\- The answer is guaranteed to be less than or equal to `2 \* 10^9`.



---



\## 🧠 Example



\### Input:

m = 3, n = 7





\### Output:

28





---



\## ✅ Approach



We use \*\*Dynamic Programming (DP)\*\* to build up the number of unique paths to each cell from the top-left.



Let `dp\[i]\[j]` be the number of unique paths to reach cell `(i, j)`.



\- The only way to reach the first row or first column is from one direction, so initialize them with `1`.

\- For all other cells, the number of unique paths is the sum of paths from the \*\*top cell\*\* and the \*\*left cell\*\*.



\### Recurrence relation:



dp\[i]\[j] = dp\[i-1]\[j] + dp\[i]\[j-1]





---



\## 🚀 Java Solution



```java

public class UniquePaths {



&nbsp;   public int uniquePaths(int m, int n) {

&nbsp;       int\[]\[] dp = new int\[m]\[n];



&nbsp;       // Fill the first row and first column with 1

&nbsp;       for (int i = 0; i < m; i++) dp\[i]\[0] = 1;

&nbsp;       for (int j = 0; j < n; j++) dp\[0]\[j] = 1;



&nbsp;       // Fill the rest of the dp table

&nbsp;       for (int i = 1; i < m; i++) {

&nbsp;           for (int j = 1; j < n; j++) {

&nbsp;               dp\[i]\[j] = dp\[i - 1]\[j] + dp\[i]\[j - 1];

&nbsp;           }

&nbsp;       }



&nbsp;       return dp\[m - 1]\[n - 1];

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       UniquePaths up = new UniquePaths();

&nbsp;       System.out.println(up.uniquePaths(3, 7));  // Output: 28

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



