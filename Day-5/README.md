\# 🚀 Day 3 – DSA Challenge







This day focuses on practicing "Number of String Tockens" and "3Sum" techniques. 



---

\# 📝 Word Tokenizer – Java Program



This Java program reads a line of input, extracts valid words (alphabetic sequences), and prints the count of words followed by each word on a new line.



---



\## 📋 Problem Statement



Given a string with a mix of words and punctuation, tokenize the string and extract all words containing only \*\*alphabetic characters\*\* (A–Z or a–z).  

Then:

1\. Print the number of valid words.

2\. Print each word on a new line in the order they appear.



---



\## 🧠 Approach



\### Step-by-step:

1\. Read the entire input line using `Scanner.nextLine()`.

2\. Use a regular expression in `split("\[^A-Za-z]+")` to break the string into tokens, ignoring anything that is \*\*not\*\* a letter.

3\. Filter out any empty strings (which may occur due to leading/trailing delimiters).

4\. Add valid words to a `List<String>`.

5\. Print the number of words.

6\. Print each word on a separate line.



---



\## 💡 Example



\### Input:

He is a very very good boy, isn't he?

\### Output:

10

He

is

a

very

very

good

boy

isn

t

he



---



\## 📄 Java Code



```java

import java.io.\*;

import java.util.\*;



public class Solution {



&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner scan = new Scanner(System.in);

&nbsp;       String s = scan.nextLine();

&nbsp;       String\[] s1 = s.trim().split("\[^A-Za-z]+");

&nbsp;       List<String> l = new ArrayList<>();

&nbsp;       for (String word : s1) {

&nbsp;           if (!word.isEmpty()) {

&nbsp;               l.add(word);

&nbsp;           }

&nbsp;       }

&nbsp;       System.out.println(l.size());

&nbsp;       for (String sc : l) {

&nbsp;           System.out.println(sc);

&nbsp;       }

&nbsp;       scan.close();

&nbsp;   }

}



\## 📝 Problem Statement



Given an integer array `nums`, return all the \*\*unique triplets\*\* `\[nums\[i], nums\[j], nums\[k]]` such that:



\- `i != j`, `i != k`, and `j != k`

\- `nums\[i] + nums\[j] + nums\[k] == 0`



\*\*Note:\*\* The solution set must not contain duplicate triplets.



🔗 \[LeetCode Problem Link](https://leetcode.com/problems/3sum/?envType=problem-list-v2\&envId=array)



---



\## 💡 Example



\### Example 1:

\*\*Input:\*\*  

`nums = \[-1, 0, 1, 2, -1, -4]`  

\*\*Output:\*\*  

`\[\[-1, -1, 2], \[-1, 0, 1]]`



\### Example 2:

\*\*Input:\*\*  

`nums = \[0, 1, 1]`  

\*\*Output:\*\*  

`\[]`



---



\## ⚙️ Approach



\### ✅ Two Pointer + Sorting



1\. \*\*Sort the array\*\* to simplify duplicate detection and enable two-pointer strategy.

2\. Fix one element at a time and use two pointers (`left` and `right`) to find two numbers such that the total sum becomes 0.

3\. Skip duplicate values to avoid repeated triplets.



---



\## 🔁 Algorithm



1\. Sort the input array.

2\. Loop through the array:

&nbsp;  - Skip duplicates for the first element.

&nbsp;  - For each element `nums\[i]`, set two pointers: `left = i + 1`, `right = n - 1`.

&nbsp;  - Check the sum:

&nbsp;    - If sum == 0: add triplet and move both pointers, skipping duplicates.

&nbsp;    - If sum < 0: move `left` pointer.

&nbsp;    - If sum > 0: move `right` pointer.



---



\## 🧠 Time \& Space Complexity



\- \*\*Time Complexity:\*\* O(n²)  

&nbsp; (Outer loop runs `n` times, and the two-pointer part runs in O(n) time.)



\- \*\*Space Complexity:\*\* O(1) (excluding output list)



---



\## 📄 Java Code



```java

import java.util.\*;



public class ThreeSum {

&nbsp;   public List<List<Integer>> threeSum(int\[] nums) {

&nbsp;       List<List<Integer>> result = new ArrayList<>();

&nbsp;       Arrays.sort(nums);

&nbsp;       

&nbsp;       for(int i = 0; i < nums.length - 2; i++) {

&nbsp;           if(i > 0 \&\& nums\[i] == nums\[i-1]) continue; // skip duplicates

&nbsp;           int left = i + 1;

&nbsp;           int right = nums.length - 1;

&nbsp;           

&nbsp;           while(left < right) {

&nbsp;               int sum = nums\[i] + nums\[left] + nums\[right];

&nbsp;               

&nbsp;               if(sum == 0) {

&nbsp;                   result.add(Arrays.asList(nums\[i], nums\[left], nums\[right]));

&nbsp;                   while(left < right \&\& nums\[left] == nums\[left+1]) left++; // skip duplicates

&nbsp;                   while(left < right \&\& nums\[right] == nums\[right-1]) right--; // skip duplicates

&nbsp;                   left++;

&nbsp;                   right--;

&nbsp;               } else if(sum < 0) {

&nbsp;                   left++;

&nbsp;               } else {

&nbsp;                   right--;

&nbsp;               }

&nbsp;           }

&nbsp;       }

&nbsp;       return result;

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string 

