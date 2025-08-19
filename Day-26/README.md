\# 🚀 Day 26 – DSA Challenge



This day focuses on 1. \*\*LCS.java\*\* – Finds the number of common vowels between two strings.  

2\. \*\*SumofPrimeASCII.java\*\* – Extracts characters whose ASCII values are prime numbers and computes their sum.



---



\## 1. LCS.java



\### Problem Statement

Given two input strings, find the \*\*number of distinct vowels\*\* (`a, e, i, o, u`) that appear in \*\*both strings\*\*.



\### Approach

\- Convert both input strings to lowercase.

\- Define a set of vowels.

\- Store all vowels from the first string into a set.

\- Store all vowels from the second string into another set.

\- Use `retainAll()` to find the intersection (common vowels).

\- Print the size of the intersection set.



\### Example

\*\*Input\*\*

hello

world





\*\*Output\*\*

1



(Only the vowel `o` is common in both strings)



---



\## 2. SumofPrimeASCII.java



\### Problem Statement

Given a string, find all characters whose \*\*ASCII values are prime numbers\*\*. Print those characters concatenated together followed by the sum of their ASCII values.  



\- If no such character exists, print the \*\*first character’s ASCII value\*\* and the \*\*last character\*\* of the string separated by a colon.



\### Approach

\- Traverse each character of the string.

\- Convert to ASCII value using `(int) ch`.

\- Check if the ASCII value is prime using `isPrime()`.

\- If prime:

&nbsp; - Append character to a `StringBuilder`.

&nbsp; - Add its ASCII value to `sum`.

\- After traversal:

&nbsp; - If at least one prime character found, print the characters + `:` + sum.

&nbsp; - Otherwise, print the first character's ASCII value + `:` + last character.



\### Example 1

\*\*Input\*\*

AB123IOJO





\*\*Output\*\*

BIO:214



(`B`, `I`, and `O` have prime ASCII values, sum = 214)



\### Example 2

\*\*Input\*\*

XYZ





\*\*Output\*\*

x:z



(No prime ASCII values, so prints ASCII of first char `X` (88) and last char `Z`)



---



\## Files

\- `LCS.java` – Common vowel counter.

```java
import java.util.\*;

class LCS{

&nbsp;   public static void main(String args\[]){

&nbsp;       Scanner sc =new Scanner(System.in);

&nbsp;       String s1 = sc.nextLine().toLowerCase();

&nbsp;       String s2 = sc.nextLine().toLowerCase();

&nbsp;       String s = "\[aeiou]";

&nbsp;       Set<Character> set = new HashSet<>();

&nbsp;       Set<Character> set1 = new HashSet<>();

&nbsp;       for(char c1:s1.toCharArray()){

&nbsp;           if(s.indexOf(c1)!=-1){

&nbsp;               set.add(c1);

&nbsp;           }

&nbsp;       }

&nbsp;       for(char c2:s2.toCharArray()){

&nbsp;           if(s.indexOf(c2)!=-1){

&nbsp;               set1.add(c2);

&nbsp;           }

&nbsp;       }



&nbsp;       set.retainAll(set1);

&nbsp;       System.out.println(set.size());

&nbsp;   }

}



\- `SumofPrimeASCII.java` – Prime ASCII character extractor.



```java

import java.util.\*;

import java.lang.\*;

class SumofPrimeASCII{

&nbsp;   public static void main(String args\[]){

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       String s = sc.nextLine();

&nbsp;       int ascii = 0;

&nbsp;       int sum = 0;



&nbsp;       StringBuilder sb = new StringBuilder();

&nbsp;       for(char ch:s.toCharArray()){

&nbsp;           ascii =(int)ch;

&nbsp;           if(isPrime(ascii)) {

&nbsp;               sb.append(ch);

&nbsp;               sum+=ascii;

&nbsp;           }

&nbsp;       }

&nbsp;       if(sb.length()>0){

&nbsp;           System.out.println(sb.toString()+":"+sum);

&nbsp;       }else{

&nbsp;           

&nbsp;       System.out.println(s.charAt(0)+":"+s.charAt(s.length()-1));

&nbsp;       }

&nbsp;   }

&nbsp;   public static boolean isPrime(int n){

&nbsp;       if(n<2) return false;

&nbsp;       int count = 0;

&nbsp;       for(int i=1;i<=n;i++){

&nbsp;           if(n%i==0) count++;

&nbsp;       }

&nbsp;       return count==2;

&nbsp;   }

}







\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

