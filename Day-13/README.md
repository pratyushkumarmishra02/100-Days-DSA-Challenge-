\# 🚀 Day 13 – DSA Challenge



This day focuses on some Java RegEx and some Array and HashMap related questions like "FruitIntoBasket" and "IP RegEx"



---

\## 🧩 Problem Statement



You are visiting a farm with \*\*only one row of trees\*\*, and each tree has a single type of fruit. You are allowed to carry \*\*at most two baskets\*\*, and each basket can carry \*\*only one type of fruit\*\*.



Given an integer array `fruits` where `fruits\[i]` is the type of fruit on the `i-th` tree, return the \*\*maximum number of fruits\*\* you can pick.



---



\## ✅ Constraints



\- `1 <= fruits.length <= 10⁵`

\- `0 <= fruits\[i] < fruits.length`



---



\## 💡 Example

Input: fruits = \[1,2,1]

Output: 3

Explanation: We can pick all fruits: basket 1 has type 1, basket 2 has type 2.



---

\## 🔍 Approach



This is a classic \*\*sliding window\*\* problem.



1\. Use a hashmap to keep track of the count of each fruit.

2\. Expand the window while the number of fruit types is ≤ 2.

3\. Shrink the window from the left if the types exceed 2.

4\. Keep track of the max window size during this process.



---



\## 💻 Java Code



```java

&nbsp;class Solution {

&nbsp;   public int totalFruit(int\[] fruits) {

&nbsp;       Map<Integer, Integer> basket = new HashMap<>();

&nbsp;       int left = 0,right, maxSize = 0;



&nbsp;       for (right = 0; right < fruits.length; right++) {

&nbsp;           basket.put(fruits\[right], basket.getOrDefault(fruits\[right], 0) + 1);



&nbsp;           while (basket.size() > 2) {

&nbsp;               int fruitLeft = fruits\[left];

&nbsp;               int count = basket.get(fruitLeft);

&nbsp;               if (count == 1) {

&nbsp;                   basket.remove(fruitLeft);

&nbsp;               } else {

&nbsp;                   basket.put(fruitLeft, count - 1);

&nbsp;               }

&nbsp;               left++;

&nbsp;           }



&nbsp;           maxSize = Math.max(maxSize, right - left + 1);

&nbsp;       }



&nbsp;       return maxSize;

&nbsp;   }

}



| Complexity | Value                    |

| ---------- | ------------------------ |

| Time       | O(n)                     |

| Space      | O(1) – max 2 keys in map |





```markdown

\# 🧪 MyRegex: Validate an IP Address



> Problem: Write a class `MyRegex` with a pattern that matches valid IPv4 addresses.



---



\## 🌐 Definition of a Valid IP Address



An IPv4 address consists of \*\*four numbers\*\* (each between \*\*0 and 255\*\*) separated by dots.



Each number can’t have leading zeroes unless it’s zero itself.



\### Valid Examples



\- 192.168.0.1 ✅

\- 0.0.0.0 ✅

\- 255.255.255.255 ✅



\### Invalid Examples



\- 256.100.0.1 ❌

\- 01.02.03.04 ❌

\- 123.456.78.90 ❌



---



\## 🛠 Java Code



```java

import java.util.Scanner;

import java.util.regex.Pattern;



public class Solution {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner in = new Scanner(System.in);

&nbsp;       MyRegex myRegex = new MyRegex();

&nbsp;       Pattern p = Pattern.compile(myRegex.pattern);



&nbsp;       while (in.hasNext()) {

&nbsp;           String IP = in.next();

&nbsp;           System.out.println(p.matcher(IP).matches());

&nbsp;       }

&nbsp;   }

}



class MyRegex {

&nbsp;   String pattern = 

&nbsp;       "^((0\\\\d{2}|\\\\d{1,2}|1\\\\d{2}|2\[0-4]\\\\d|25\[0-5])\\\\.){3}"

&nbsp;     + "(0\\\\d{2}|\\\\d{1,2}|1\\\\d{2}|2\[0-4]\\\\d|25\[0-5])$";

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

