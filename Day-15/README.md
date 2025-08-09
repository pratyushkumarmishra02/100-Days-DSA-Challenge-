\# 🚀 Day 15 – DSA Challenge



This day focuses on some sorting and substring related problems like "Sort an array" and "Longest consecutive substring with repetition ".



...

\## 🧩 Problem 1: Leetcode 912 - Sort an Array



\### ✅ Problem Statement:

Sort an integer array in \*\*ascending order\*\* using any efficient sorting algorithm.



\*\*Link:\*\* \[Leetcode 912 - Sort an Array](https://leetcode.com/problems/sort-an-array/)



\### 🧠 Approach:

We use \*\*Merge Sort\*\* or \*\*Quick Sort\*\* to solve this problem efficiently.



\### 📌 Time Complexity:

\- \*\*Merge Sort:\*\* O(n log n)

\- \*\*Quick Sort (avg case):\*\* O(n log n)



\### ✅ Example:

\#### Input:

nums = \[5, 2, 3, 1]



\#### Output:

\[1, 2, 3, 5



\### 📎 Java Code (using Merge Sort):



```java



class Solution {

&nbsp;   public int\[] sortArray(int\[] nums) {

&nbsp;       Arrays.sort(nums);

&nbsp;       return nums;

&nbsp;   }

}



🧩 Problem 2: Longest Consecutive Character Substring

✅ Problem Statement:

Given a string, find the longest substring where all characters are the same.



🔍 Input:

aaaaabbbbbbaaaaaaaaaaaaaaaaa

MaxLen: 17  

The Longest substring is : aaaaaaaaaaaaaaaaa

🧠 Approach:

Traverse the string and keep track of the current character and its consecutive count.



Update max length and max substring when a longer sequence is found.



📎 Java Code:

package Sem7;



import java.util.HashMap;

import java.util.Scanner;



public class LongestSubstringWithRep {



&nbsp;	public static void main(String\[] args) {

&nbsp;		Scanner sc = new Scanner(System.in);

&nbsp;		String s = sc.nextLine();

&nbsp;		int maxLen = 1;

&nbsp;		int currentLen =1;

&nbsp;		char c = s.charAt(0);

&nbsp;		for(int i=1;i<s.length();i++) {

&nbsp;			if(s.charAt(i)== s.charAt(i-1)) {

&nbsp;				currentLen++;

&nbsp;			}else {

&nbsp;				currentLen = 1;

&nbsp;			}

&nbsp;			if(currentLen>maxLen) {

&nbsp;				maxLen=currentLen;

&nbsp;				c = s.charAt(i);

&nbsp;			}

&nbsp;		}

&nbsp;		StringBuilder sb = new StringBuilder();

&nbsp;		for(int i=0;i<maxLen;i++) {

&nbsp;			sb.append(c);

&nbsp;		}

&nbsp;		System.out.println("MaxLen: "+maxLen);

&nbsp;		System.out.println("The Longest substring is : "+ sb.toString());

&nbsp;		//System.out.println("The Longest substring is : " + String.valueOf(maxChar).repeat(maxLen));

&nbsp;		

&nbsp;	}



}





