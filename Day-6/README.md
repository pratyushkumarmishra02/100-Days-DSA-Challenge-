\# 🚀 Day 6 – DSA Challenge



This day focuses on practicing "Pattern matcher using regex" and "3Sum closet" techniques. 



---

\## 📌 Problem Description



You are given a number `n`, followed by `n` strings where each string is intended to be a regular expression. Your task is to determine whether each string is a valid regex pattern in Java.



For each input string:

\- Print `Valid` if the pattern compiles without error.

\- Print `Invalid` if it throws a `PatternSyntaxException`.



---



\## 🧵 Example



\### ✅ Input:

3

(\[A-Z])(.+)

\[AZa-z

batcatpat(nat





\### ✅ Output:

Valid

Invalid

Invalid





---



\## 🛠️ Technologies Used



\- Java

\- Java Regex (`java.util.regex.Pattern`)

\- Exception Handling (`PatternSyntaxException`)

\- Collections (`ArrayList`)

\- Input Scanner (`java.util.Scanner`)



---



\## 📚 Key Concepts



\- \*\*Regex Compilation\*\*: `Pattern.compile(String)` is used to check if a regex string is syntactically valid.

\- \*\*Exception Handling\*\*: If the regex is not valid, `PatternSyntaxException` is thrown.

\- \*\*Scanner Input\*\*: Reads input efficiently from the console.



---



\## 🧾 Code Explanation



```java

import java.io.\*;

import java.util.\*;

import java.util.regex.\*;



public class Solution {



&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n = sc.nextInt();       // Number of regex inputs

&nbsp;       sc.nextLine();              // Consume leftover newline

&nbsp;       List<String> inputStrings = new ArrayList<>();



&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           String input = sc.nextLine();

&nbsp;           inputStrings.add(input);

&nbsp;       }



&nbsp;       for (String s : inputStrings) {

&nbsp;           try {

&nbsp;               Pattern.compile(s); 

&nbsp;               System.out.println("Valid");

&nbsp;           } catch (PatternSyntaxException e) {

&nbsp;               System.out.println("Invalid");

&nbsp;           }

&nbsp;       }

&nbsp;   }

}





\## 🧠 Problem Statement



Given an integer array `nums` of length `n` and an integer `target`, find three integers in `nums` such that the sum is \*\*closest\*\* to `target`.



Return the sum of the three integers. You may assume that each input would have \*\*exactly one solution\*\*.



---



\## 🧾 Example



\### ✅ Input:

nums = \[-1, 2, 1, -4], target = 1





\### ✅ Output:

2



\### 💬 Explanation:

The sum that is closest to the target is `(-1 + 2 + 1) = 2`.



---



\## 💡 Approach



1\. \*\*Sort the array\*\* to enable two-pointer technique.

2\. Fix one number `i`, then use two pointers `left` and `right` to find the pair such that `nums\[i] + nums\[left] + nums\[right]` is as close as possible to the target.

3\. Track the `closest` sum by maintaining the minimum difference from the target.



---





---



\## 🚀 Code



```java

import java.util.Arrays;



public class ThreeSumClosest {



&nbsp;   public static int threeSumClosest(int\[] nums, int target) {

&nbsp;       Arrays.sort(nums);

&nbsp;       int closestSum = nums\[0] + nums\[1] + nums\[2];



&nbsp;       for (int i = 0; i < nums.length - 2; i++) {

&nbsp;           int left = i + 1;

&nbsp;           int right = nums.length - 1;



&nbsp;           while (left < right) {

&nbsp;               int currentSum = nums\[i] + nums\[left] + nums\[right];



&nbsp;               if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {

&nbsp;                   closestSum = currentSum;

&nbsp;               }



&nbsp;               if (currentSum < target) {

&nbsp;                   left++;

&nbsp;               } else {

&nbsp;                   right--;

&nbsp;               }

&nbsp;           }

&nbsp;       }



&nbsp;       return closestSum;

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       int\[] nums = {-1, 2, 1, -4};

&nbsp;       int target = 1;

&nbsp;       System.out.println("Closest Sum: " + threeSumClosest(nums, target));

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string 

