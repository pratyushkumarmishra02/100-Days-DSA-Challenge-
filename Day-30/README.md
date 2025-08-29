\# 🚀 Day 30 – DSA Challenge



\# Java Programs – EvenOddSum \& FindFreqKeyFromLast



This repository contains two Java programs that solve different algorithmic problems:



1\. \*\*EvenOddSum\*\* – Computes the difference between the sum of even and odd digits from given numbers based on a condition.

2\. \*\*FindFreqKeyFromLast\*\* – Finds the first positive integer (from the end) that occurs more than once in an array.



---



\## 1. EvenOddSum



\### Problem Statement

You are given \*\*four integers\*\*: `n1`, `n2`, `n3`, and `n4`.



\- Extract all digits from `n1`, `n2`, and `n3`.

\- Separate digits into \*\*even\*\* and \*\*odd\*\* lists.

\- Compute the \*\*sum of even digits\*\* and \*\*sum of odd digits\*\*.

\- If `n4` is \*\*even\*\*, return `evenSum - oddSum`.  

\- If `n4` is \*\*odd\*\*, return `oddSum - evenSum`.



\### Example

\*\*Input\*\*

1234 5678 90 2



\- Even digits = {2,4,6,8,0} → sum = 20  

\- Odd digits = {1,3,5,7,9} → sum = 25  

\- Since `n4 = 2` (even), result = `20 - 25 = -5`



\*\*Output\*\*

-5





\### Java Code

```java

import java.util.\*;



class EvenOddSum {

&nbsp;   public static void main(String args\[]) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n1 = sc.nextInt();

&nbsp;       int n2 = sc.nextInt();

&nbsp;       int n3 = sc.nextInt();

&nbsp;       int n4 = sc.nextInt();



&nbsp;       int result = findEvenOddSum(n1, n2, n3, n4);

&nbsp;       System.out.println(result);

&nbsp;   }



&nbsp;   public static int findEvenOddSum(int n1, int n2, int n3, int n4) {

&nbsp;       ArrayList<Integer> even = new ArrayList<>();

&nbsp;       ArrayList<Integer> odd = new ArrayList<>();

&nbsp;       int sum1 = 0, sum2 = 0;



&nbsp;       // process digits of n1, n2, n3

&nbsp;       for (int num : new int\[]{n1, n2, n3}) {

&nbsp;           while (num > 0) {

&nbsp;               int r = num % 10;

&nbsp;               if (r % 2 == 0) even.add(r);

&nbsp;               else odd.add(r);

&nbsp;               num /= 10;

&nbsp;           }

&nbsp;       }



&nbsp;       for (int e : even) sum1 += e;

&nbsp;       for (int o : odd) sum2 += o;



&nbsp;       return (n4 % 2 == 0) ? sum1 - sum2 : sum2 - sum1;

&nbsp;   }

}



Complexity



Time: O(d) where d = total digits in n1+n2+n3



Space: O(d) for storing digits in lists



2\. FindFreqKeyFromLast

Problem Statement



You are given an array of n positive/negative integers.

The task is to:



Traverse from the end of the array.



Find the first positive integer that has appeared at least twice.



If no positive integers exist, return 0.



If no duplicates exist among positive numbers, return the last positive integer.



Example



Input



7

-1 3 5 2 3 7 9





Process



Start from last element → 9 (unique)



Next → 7 (unique)



Next → 3 (already seen before) → return 3



Output



3





\### Java Code

```java



import java.util.\*;



class FindFreqKeyFromLast {

&nbsp;   public static void main(String args\[]) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int n = sc.nextInt();

&nbsp;       int arr\[] = new int\[n];

&nbsp;       for (int i = 0; i < n; i++) {

&nbsp;           arr\[i] = sc.nextInt();

&nbsp;       }

&nbsp;       int result = findFreqKeyFromLast(arr, n);

&nbsp;       System.out.println(result);

&nbsp;   }



&nbsp;   public static int findFreqKeyFromLast(int\[] arr, int n) {

&nbsp;       int res = 0;

&nbsp;       boolean isPositive = false;

&nbsp;       Set<Integer> set = new HashSet<>();



&nbsp;       for (int i = n - 1; i >= 0; i--) {

&nbsp;           int x = arr\[i];

&nbsp;           if (x > 0) {

&nbsp;               isPositive = true;

&nbsp;               if (set.contains(x)) {

&nbsp;                   return x;

&nbsp;               }

&nbsp;               set.add(x);

&nbsp;               res = x;

&nbsp;           }

&nbsp;       }

&nbsp;       return isPositive ? res : 0;

&nbsp;   }

}





Complexity



Time: O(n) (one traversal of array)



Space: O(n) (to store seen elements in a HashSet)



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



