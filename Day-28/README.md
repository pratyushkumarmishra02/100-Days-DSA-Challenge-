\# 🚀 Day 28 – DSA Challenge



\# LeetCode 13: Roman to Integer



\## Problem Statement

Roman numerals are represented by seven different symbols:  

`I`, `V`, `X`, `L`, `C`, `D`, and `M`.



| Symbol | Value |

|--------|-------|

| I      | 1     |

| V      | 5     |

| X      | 10    |

| L      | 50    |

| C      | 100   |

| D      | 500   |

| M      | 1000  |



Given a Roman numeral, convert it to an \*\*integer\*\*.



\### Rules

\- Normally, symbols are added from left to right, e.g., `III = 3`.

\- A smaller numeral before a larger numeral indicates subtraction:  

&nbsp; - `IV = 4`, `IX = 9`  

&nbsp; - `XL = 40`, `XC = 90`  

&nbsp; - `CD = 400`, `CM = 900`



---



\## Examples



\#### Example 1:

Input: s = "III"

Output: 3

Explanation: III = 3.





\#### Example 2:

Input: s = "LVIII"

Output: 58

Explanation: L = 50, V= 5, III = 3 → 58.





\#### Example 3:

Input: s = "MCMXCIV"

Output: 1994

Explanation: M = 1000, CM = 900, XC = 90, IV = 4





---



\## Constraints

\- `1 <= s.length <= 15`

\- `s` is guaranteed to be a valid Roman numeral within the range `\[1, 3999]`.



---



\## Approach

1\. Create a \*\*mapping\*\* of Roman numerals to integers.

2\. Traverse the string:

&nbsp;  - If the current value is less than the next value → \*\*subtract\*\* it.

&nbsp;  - Else → \*\*add\*\* it.

3\. Return the total.



---



\## Java Solution

```java

import java.util.\*;



class Solution {

&nbsp;   public int romanToInt(String s) {

&nbsp;       Map<Character, Integer> map = new HashMap<>();

&nbsp;       map.put('I', 1);

&nbsp;       map.put('V', 5);

&nbsp;       map.put('X', 10);

&nbsp;       map.put('L', 50);

&nbsp;       map.put('C', 100);

&nbsp;       map.put('D', 500);

&nbsp;       map.put('M', 1000);



&nbsp;       int total = 0;

&nbsp;       for (int i = 0; i < s.length(); i++) {

&nbsp;           int value = map.get(s.charAt(i));

&nbsp;           if (i + 1 < s.length() \&\& value < map.get(s.charAt(i + 1))) {

&nbsp;               total -= value;

&nbsp;           } else {

&nbsp;               total += value;

&nbsp;           }

&nbsp;       }

&nbsp;       return total;

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

