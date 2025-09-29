\# Dynamic Array Query Solution



This Java program reads a dynamic array of integers and allows the user to query specific elements within the array. If a query refers to an invalid position, it outputs an error message.



\## Table of Contents

\- \[Problem Description](#problem-description)

\- \[Input Format](#input-format)

\- \[Output Format](#output-format)

\- \[Example](#example)

\- \[How It Works](#how-it-works)

\- \[Usage](#usage)



\## Problem Description

You are given a list of `n` arrays, each possibly of different lengths. After constructing the arrays, the program allows `q` queries where each query asks for the value at a specific position in one of the arrays. If the queried position is invalid, the program prints `"ERROR!"`.



\## Input Format

1\. The first line contains an integer `n`, the number of arrays.

2\. The next `n` lines each start with an integer `k`, the number of elements in that array, followed by `k` space-separated integers.

3\. The next line contains an integer `q`, the number of queries.

4\. The next `q` lines contain two integers `x` and `y`:

&nbsp;  - `x` is the 1-based index of the array to query.

&nbsp;  - `y` is the 1-based index of the element within that array.



\## Output Format

For each query:

\- Print the value at the specified position if it exists.

\- Otherwise, print `"ERROR!"`.



\## Example



\### Input

2

3 1 5 4

5 2 3 7 8 9

3

1 3

2 4

2 6





\### Output

4

8

ERROR!





\## How It Works

1\. The program reads `n` arrays and stores them in a `List` of `ArrayList<Integer>`.

2\. It then reads `q` queries.

3\. For each query `(x, y)`:

&nbsp;  - It checks if the `x` index is valid (exists in the list of arrays).

&nbsp;  - It checks if the `y` index is valid (exists in the selected array).

&nbsp;  - If both indices are valid, it prints the corresponding element.

&nbsp;  - If either index is invalid, it prints `"ERROR!"`.



\## Java Solution



```java

import java.io.\*;

import java.util.\*;



public class Solution {



&nbsp;   public static void main(String\[] args) {

&nbsp;       /\* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. \*/

&nbsp;       Scanner sc =new Scanner(System.in);

&nbsp;       int n = sc.nextInt();

&nbsp;       List<ArrayList<Integer>> al = new ArrayList<>();

&nbsp;       for(int i=0;i<n;i++){

&nbsp;           int k = sc.nextInt();

&nbsp;           ArrayList<Integer> al1 = new ArrayList<>();

&nbsp;           for(int j=0;j<k;j++){

&nbsp;               int e = sc.nextInt();

&nbsp;               al1.add(e);

&nbsp;           }

&nbsp;           al.add(al1);

&nbsp;       }

&nbsp;       int q = sc.nextInt();

&nbsp;       for(int l=0;l<q;l++){

&nbsp;           int x=sc.nextInt();

&nbsp;           int y=sc.nextInt();

&nbsp;           if(x-1>=0 \&\& x-1<al.size()){

&nbsp;               ArrayList<Integer> row = al.get(x-1);

&nbsp;               if(y-1>=0 \&\& y-1<row.size()){

&nbsp;                   System.out.println(row.get(y-1));

&nbsp;               }else{

&nbsp;                   System.out.println("ERROR!");

&nbsp;               }

&nbsp;           }else{

&nbsp;                   System.out.println("ERROR!");

&nbsp;          }

&nbsp;       }

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

