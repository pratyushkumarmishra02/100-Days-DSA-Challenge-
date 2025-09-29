\# 🚀 Day 53 – DSA Challenge



\# HackerRank – Java BigDecimal



\## Problem Statement

You are given an array of real number strings. You need to sort them in \*\*descending order\*\* according to their \*\*numeric values\*\*.  



However, there’s a twist:

1\. Each number must be printed in the \*\*exact same format\*\* as it was read from the input.  

&nbsp;  - Example: `0.12` and `.12` must remain as they are, not converted.

2\. If two numbers are \*\*numerically equal\*\*, maintain their \*\*original input order\*\* (stable sort).



---



\## Input Format

\- The first line contains a single integer `n`, the number of strings.  

\- The next `n` lines each contain a real number string.



---



\## Output Format

Print the array of strings in descending numeric order, preserving their original format.



---



\## Constraints

\- `1 <= n <= 200`

\- Each number string has at most `300` digits.



---



\## Sample Input

9

-100

50

0

56.6

90

0.12

.12

02.34

000.000





---



\## Sample Output

90

56.6

50

02.34

0.12

.12

0

000.000

-100





---



\## Explanation

\- When sorted numerically: `90, 56.6, 50, 2.34, 0.12, 0.12, 0, 0, -100`.

\- The input formatting is preserved:

&nbsp; - `02.34` remains as `02.34` instead of `2.34`.

&nbsp; - `.12` remains as `.12` instead of `0.12`.

&nbsp; - `000.000` remains as `000.000` instead of `0`.



---



\## Approach

1\. Read all strings into an array.

2\. Use \*\*Java’s `BigDecimal` class\*\* for arbitrary-precision comparison.

3\. Sort in descending order using a custom comparator.

&nbsp;  - Compare based on `BigDecimal` values.

&nbsp;  - Maintain stable ordering for equal values.

4\. Print results in the same format as input.



---



\## Java Solution

```java

import java.math.BigDecimal;

import java.util.\*;



class Solution {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n = sc.nextInt();

&nbsp;       String\[] s = new String\[n];



&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           s\[i] = sc.next();

&nbsp;       }



&nbsp;       // Sort with BigDecimal comparator (descending)

&nbsp;       Arrays.sort(s, 0, n, (a, b) -> {

&nbsp;           BigDecimal bd1 = new BigDecimal(a);

&nbsp;           BigDecimal bd2 = new BigDecimal(b);

&nbsp;           return bd2.compareTo(bd1); // descending order

&nbsp;       });



&nbsp;       // Print in the original format

&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           System.out.println(s\[i]);

&nbsp;       }

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list



