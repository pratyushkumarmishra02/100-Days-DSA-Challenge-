\# 🚀 Day 23 – DSA Challenge



This day focuses on some basic problem of math like "Palindrome number" and "Power of Three"



...



📌 326. Power of Three

Problem Statement

Given an integer n, return true if it is a power of three. Otherwise, return false.



An integer n is a power of three if there exists an integer x such that:



n == 3^x

Example:

Input: n = 27

Output: true

Explanation: 3^3 = 27





Constraints:

-2^31 <= n <= 2^31 - 1



Approach

Loop Division Method



Keep dividing n by 3 as long as it’s divisible.



If we end up with n == 1, it’s a power of three.



Logarithmic Method



Use logarithms to check if log3(n) is an integer.



Max Power Method



Use the fact that the maximum power of 3 in 32-bit signed integer is 3^19 = 1162261467.



If n > 0 and 1162261467 % n == 0, it’s a power of three.



Java Solution (Loop Division)

...java



class PowerofThree {

&nbsp;   public boolean isPowerOfThree(int n) {

&nbsp;       if(n==1) return true;

&nbsp;       if(n<1 || n%3!=0) return false;

&nbsp;       return isPowerOfThree(n/3);

&nbsp;   }

}



📌 9. Palindrome Number

Problem Statement

Given an integer x, return true if x is a palindrome, and false otherwise.



An integer is a palindrome when it reads the same forward and backward.

Example:

Input: x = 121

Output: true

Explanation: 121 reads as 121 from left to right and from right to left.



Constraints:

-2^31 <= x <= 2^31 - 1



Approach

String Conversion



Convert the integer to a string and check if it’s the same reversed.



Mathematical Reverse



Reverse half of the number without converting to string for better performance.



If reversed half equals the remaining half, it’s a palindrome.



Java Solution (Mathematical Approach)



...java



class Solution {

&nbsp;   public boolean isPalindrome(int x) {

&nbsp;       if(x<0) return false;



&nbsp;       int temp = x;

&nbsp;       int reverse = 0;

&nbsp;       while(x!=0){

&nbsp;           int r = x%10;

&nbsp;           reverse = reverse \* 10 + r;

&nbsp;           x/=10;

&nbsp;       }

&nbsp;       return reverse==temp?true:false;

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



