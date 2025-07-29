\# 🚀 Day 7 – DSA Challenge



This day focuses on practicing mathematical questions, such as "Divide Two Integers" and "Integer to Roman" techniques. 



---



\## 🧠 Problem Statement



Given two integers `dividend` and `divisor`, \*\*divide\*\* two integers \*\*without using multiplication, division, and mod operator\*\*.



Return the quotient after dividing `dividend` by `divisor`.



\- The integer division should truncate toward zero, which means \*\*losing fractional digits\*\*.

\- Assume that your function will not overflow except when `dividend = Integer.MIN\_VALUE` and `divisor = -1`. In this case, return `Integer.MAX\_VALUE`.



---



\## 🧾 Example



\### ✅ Input:

dividend = 10, divisor = 3





\### ✅ Output:

-2





---



\## 🚧 Constraints



\- -2³¹ <= dividend, divisor <= 2³¹ - 1

\- divisor != 0



---



\## 💡 Approach



1\. Handle edge case: if `dividend == Integer.MIN\_VALUE` and `divisor == -1`, return `Integer.MAX\_VALUE` to prevent overflow.

2\. Convert both `dividend` and `divisor` to long and work with positive values.

3\. Use \*\*bit shifting\*\* to subtract multiples of divisor from dividend.

4\. Adjust the sign of the result based on the sign of the input.



---

\## 🚀 Java Code



```java



class Solution {

&nbsp;   public int divide(int dividend, int divisor) {

&nbsp;       if (dividend == Integer.MIN\_VALUE \&\& divisor == -1) {

&nbsp;           return Integer.MAX\_VALUE;

&nbsp;       }

&nbsp;       return dividend / divisor;

&nbsp;   }

}





\## 🧠 Problem Statement



Roman numerals are represented by seven different symbols:



| Symbol | Value |

|--------|-------|

| I      | 1     |

| V      | 5     |

| X      | 10    |

| L      | 50    |

| C      | 100   |

| D      | 500   |

| M      | 1000  |



For example:

\- `2` is written as `"II"` in Roman numeral,

\- `12` is written as `"XII"`,

\- `27` is written as `"XXVII"`.



To convert an integer to a Roman numeral:

\- We use the largest possible symbol from left to right.

\- Special cases like 4 (`IV`), 9 (`IX`), 40 (`XL`), 90 (`XC`), 400 (`CD`), 900 (`CM`) are used for subtraction rules.



---



\## ✨ Example



\### ✅ Input:

num = 1994





\### ✅ Output:

"MCMXCIV"





\### 💡 Explanation:

\- 1000 = M  

\- 900 = CM  

\- 90 = XC  

\- 4 = IV  

→ Total = M + CM + XC + IV = \*\*"MCMXCIV"\*\*



---



\## 🚧 Constraints



\- `1 <= num <= 3999`



---



\## 🚀 Java Solution



```java

public class IntegerToRoman {



&nbsp;   public static String intToRoman(int num) {

&nbsp;       int\[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

&nbsp;       String\[] symbols =

&nbsp;           {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};



&nbsp;       StringBuilder sb = new StringBuilder();



&nbsp;       for (int i = 0; i < values.length \&\& num > 0; i++) {

&nbsp;           while (num >= values\[i]) {

&nbsp;               num -= values\[i];

&nbsp;               sb.append(symbols\[i]);

&nbsp;           }

&nbsp;       }



&nbsp;       return sb.toString();

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       System.out.println(intToRoman(1994)); // MCMXCIV

&nbsp;       System.out.println(intToRoman(58));   // LVIII

&nbsp;       System.out.println(intToRoman(9));    // IX

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

