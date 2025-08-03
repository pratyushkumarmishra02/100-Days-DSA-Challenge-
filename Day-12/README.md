\# 🚀 Day 10 – DSA Challenge



\# 🍎 Leetcode 2561: Rearranging Fruits



> 🔗 \[Leetcode Problem Link](https://leetcode.com/problems/rearranging-fruits/)



---



\## 🧩 Problem Statement



You have two baskets, each containing some type of fruit. Each fruit has a cost of 1 and can be swapped between the baskets. The goal is to make the two baskets have the \*\*same multiset of fruit types\*\* using the \*\*minimum number of fruit swaps\*\*.



You are given two integer arrays `basket1` and `basket2` representing the types of fruits in each basket.



Return the \*\*minimum cost\*\* of making the two baskets equal by swapping fruits. If it is impossible, return `-1`.



---



\## ✅ Constraints



\- `1 <= basket1.length == basket2.length <= 10⁵`

\- `1 <= basket1\[i], basket2\[i] <= 10⁹`



---



\## 💡 Examples



\### Example 1:

Input: basket1 = \[4,2,2,2], basket2 = \[1,4,1,2]

Output: 1

Explanation: Swap 2 with 1. Then baskets are \[4,1,2,2] and \[1,4,2,2]





\### Example 2:

Input: basket1 = \[1,2,2], basket2 = \[1,1,2]

Output: -1

Explanation: It's impossible to make both baskets equal



---



\## 🔍 Approach



1\. Count the frequency of each fruit type in both baskets.

2\. If the total frequency of any fruit is \*\*odd\*\*, return `-1` (not possible to balance).

3\. Determine which fruits are \*\*extra\*\* in each basket by comparing the counts.

4\. Sort the extra fruits and try to \*\*pair smallest unmatched elements\*\* to minimize cost.

5\. Use the \*\*minimum of either the direct swap cost or double the smallest overall fruit\*\* (to simulate indirect swap through the cheapest fruit).



---



\## 💻 Java Code



```java



class Solution {

&nbsp;   public long minCost(int\[] basket1, int\[] basket2) {

&nbsp;       TreeMap<Integer, Integer> freqDifference = new TreeMap<>();

&nbsp;       int globalMin = Integer.MAX\_VALUE;



&nbsp;       for (int b1 : basket1) {

&nbsp;           freqDifference.put(b1, freqDifference.getOrDefault(b1, 0) + 1);

&nbsp;           globalMin = Math.min(globalMin, b1);

&nbsp;       }



&nbsp;       for (int b2 : basket2) {

&nbsp;           freqDifference.put(b2, freqDifference.getOrDefault(b2, 0) - 1);

&nbsp;           globalMin = Math.min(globalMin, b2);

&nbsp;       }



&nbsp;       List<Integer> mismatchedItems = new ArrayList<>();

&nbsp;       for (var entry : freqDifference.entrySet()) {

&nbsp;           int count = entry.getValue();

&nbsp;           if (count % 2 != 0) {

&nbsp;               return -1; // Cannot balance baskets

&nbsp;           }

&nbsp;           for (int i = 0; i < Math.abs(count) / 2; i++) {

&nbsp;               mismatchedItems.add(entry.getKey());

&nbsp;           }

&nbsp;       }



&nbsp;       Collections.sort(mismatchedItems);

&nbsp;       long minCost = 0;

&nbsp;       int size = mismatchedItems.size();



&nbsp;       for (int i = 0; i < size / 2; i++) {

&nbsp;           minCost += Math.min(mismatchedItems.get(i), 2 \* globalMin);

&nbsp;       }



&nbsp;       return minCost;

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

