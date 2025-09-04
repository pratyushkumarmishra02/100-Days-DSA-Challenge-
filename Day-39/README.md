\# 🚀 Day 39 – DSA Challenge



Today I have solved one of the easiest problems named "find closest person" .

...

\# LeetCode 3516 — Find Closest Person



\*\*Difficulty:\*\* Easy  

\*\*Topics:\*\* Math



\## Problem Summary



You are given three integers `x`, `y`, and `z` representing positions on a number line:



\- `x`: position of Person 1  

\- `y`: position of Person 2  

\- `z`: position of Person 3 (stationary)



Person 1 and Person 2 both move toward Person 3 at the \*\*same speed\*\*.  

Return:

\- `1` if Person 1 reaches Person 3 first  

\- `2` if Person 2 reaches Person 3 first  

\- `0` if they reach at the same time



> Source: LeetCode “Find Closest Person”. :contentReference\[oaicite:0]{index=0}



\## Key Insight



Because both movers have the same speed, the only thing that matters is \*\*distance to `z`\*\*:

\- `d1 = |x - z|`

\- `d2 = |y - z|`



Compare `d1` and `d2`.



\## Algorithm



1\. Compute `d1 = abs(x - z)` and `d2 = abs(y - z)`.

2\. If `d1 < d2`, return `1`.

3\. If `d2 < d1`, return `2`.

4\. Otherwise, return `0`.



\*\*Time:\*\* `O(1)`  

\*\*Space:\*\* `O(1)`



\## Edge Cases to Consider

\- `x == z` or `y == z` → that person is already at `z` and wins (unless both are at `z`, then return `0`).

\- Negative coordinates (the line is infinite; absolute difference handles it).

\- Large magnitudes within 32-bit int ra



Input: x = 1, y = 4, z = 2

d1 = |1 - 2| = 1

d2 = |4 - 2| = 2

Output: 1



Sample Code (Java)



```java

class Solution {

&nbsp;   public int findClosest(int x, int y, int z) {

&nbsp;       int a = Math.abs(x-z);

&nbsp;       int b = Math.abs(y-z);

&nbsp;       if(a<b){

&nbsp;           return 1;

&nbsp;       }else if(b<a){

&nbsp;           return 2;

&nbsp;       }else{

&nbsp;           return 0;

&nbsp;       }

&nbsp;   }

}

