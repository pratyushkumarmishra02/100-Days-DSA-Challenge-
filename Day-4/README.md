\# 🚀 Day 4 – DSA Challenge



This day focuses on practicing "Count Even \& Odd" and "TwoStringsEquivalent" techniques. 





---



\## 📋 Problem Statement



Write a Java program that reads an integer from the user and counts how many digits in that number are \*\*even\*\* and how many are \*\*odd\*\*.



---



\## 🧠 Approach



\### Steps:

1\. Read an integer from the user using `Scanner`.

2\. Convert the number to positive using `Math.abs()` (to handle negative inputs).

3\. Extract each digit using `% 10` and `÷ 10`.

4\. Use a loop to:

&nbsp;  - Check if digit is even (`digit % 2 == 0`)

&nbsp;  - Increment respective counters

5\. Print the number of even and odd digits.



\### 🔁 Loop Type:

\- A `while` loop is used to traverse each digit of the number.



⏱️ \*\*Time Complexity\*\*: O(d) — where `d` is the number of digits  

📦 \*\*Space Complexity\*\*: O(1)



---



\## 📄 Java Code



```java

package Sem7;



import java.util.Scanner;



public class CountEvenOdd {



&nbsp;	public static void main(String\[] args) {

&nbsp;		Scanner sc = new Scanner(System.in);

&nbsp;		

&nbsp;		int n = sc.nextInt();

&nbsp;		int even = 0;

&nbsp;		int odd = 0;

&nbsp;		

&nbsp;		while(n>0) {

&nbsp;			int r = n%10;

&nbsp;			if(r%2==0) {

&nbsp;				even++;

&nbsp;			}else {

&nbsp;				odd++;

&nbsp;			}

&nbsp;			n=n/10;

&nbsp;		}

&nbsp;		System.out.println("Even: "+even);

&nbsp;		System.out.println("Odd: "+odd);

&nbsp;	}



}



\## 📋 Problem Statement



Given two strings `s1` and `s2`, determine if they are \*\*equivalent\*\* in terms of character frequency. That is, both strings must:

\- Be of the same length

\- Contain the same characters the same number of times



> 📌 This is similar to checking if two strings are anagrams of each other.



---



\## 🧠 Approach



\### Steps:

1\. Take input of two strings using `Scanner`.

2\. If the lengths of the strings differ, return `false`.

3\. Use two `HashMap<Character, Integer>`:

&nbsp;  - One for `s1`

&nbsp;  - One for `s2`

4\. Iterate through each string:

&nbsp;  - Count character frequencies and store in the corresponding map

5\. Compare both hash maps:

&nbsp;  - If they are equal, return `true`

&nbsp;  - Otherwise, return `false`



---



\## 💡 Example



\### Input: aaaab

\### Output: false

\## 📄 Java Code



```java


package Sem7;



import java.util.\*;



public class TwoStringsEquivalent {



&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       String s1 = sc.next();

&nbsp;       String s2 = sc.next();



&nbsp;	if (s1.length() != s2.length()) {

&nbsp;           System.out.println(false);

&nbsp;           return;

&nbsp;       }



&nbsp;       HashMap<Character, Integer> map1 = new HashMap<>();

&nbsp;       HashMap<Character, Integer> map2 = new HashMap<>();



&nbsp;       // Store frequencies for s1

&nbsp;       for (char ch : s1.toCharArray()) {

&nbsp;           map1.put(ch, map1.getOrDefault(ch, 0) + 1);

&nbsp;       }



&nbsp;       // Store frequencies for s2

&nbsp;       for (char ch : s2.toCharArray()) {

&nbsp;           map2.put(ch, map2.getOrDefault(ch, 0) + 1);

&nbsp;       }



&nbsp;       // Create a set of all characters from both strings

&nbsp;       Set<Character> allChars = new HashSet<>();

&nbsp;       allChars.addAll(map1.keySet());

&nbsp;       allChars.addAll(map2.keySet());



&nbsp;       boolean equivalent = true;



&nbsp;       for (char ch : allChars) {

&nbsp;           int freq1 = map1.getOrDefault(ch, 0);

&nbsp;           int freq2 = map2.getOrDefault(ch, 0);



&nbsp;           if (Math.abs(freq1 - freq2) > 3) {

&nbsp;               equivalent = false;

&nbsp;               break;

&nbsp;           }

&nbsp;       }



&nbsp;       System.out.println(equivalent);

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string 







