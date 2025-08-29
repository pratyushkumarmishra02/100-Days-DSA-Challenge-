\# 🚀 Day 31 – DSA Challenge



\# Problem: Frequency Queries on ArrayList



\## Description

You are given an initially empty \*\*ArrayList\*\* of lowercase characters.  

There are two types of queries to perform on the ArrayList:



1\. \*\*Insert Operation\*\*  

&nbsp;  - Query: `i c`  

&nbsp;  - Action: Append character `c` into the ArrayList.  



2\. \*\*Find Frequency Operation\*\*  

&nbsp;  - Query: `f c`  

&nbsp;  - Action: Find the frequency of character `c` in the ArrayList.  

&nbsp;  - If the character is not present in the list, print `-1`.  



You must use:

\- `add()` to append elements into the list.  

\- `contains()` to check whether an element exists in the list.  

\- `Collections.frequency()` to find the frequency of the element.  



---



\## Example



\*\*Input:\*\*  



i g

i e

i e

i k

i s

f e





\*\*Output:\*\*  

2





\*\*Explanation:\*\*  

\- Insert `g`, `e`, `e`, `k`, `s` → ArrayList becomes `\[g, e, e, k, s]`.  

\- Query `f e` asks for the frequency of `e`.  

\- `e` occurs `2` times in the ArrayList → Output = `2`.



---



\## Constraints

\- Only lowercase characters (`a` to `z`) are considered.  

\- At least one `f` query will be given.  

\- If the character in an `f` query does not exist in the ArrayList, output should be `-1`.  



---



\## Approach

1\. Initialize an empty `ArrayList<Character>`.  

2\. For each query:

&nbsp;  - If the query type is `i`, use `add(c)` to append the character.  

&nbsp;  - If the query type is `f`, check:

&nbsp;    - If `list.contains(c)` is false → print `-1`.  

&nbsp;    - Otherwise → use `Collections.frequency(list, c)` to print the frequency.  



---



\## Sample Java Implementation

```java

import java.util.\*;



public class FrequencyQueries {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       ArrayList<Character> list = new ArrayList<>();

&nbsp;       

&nbsp;       while (sc.hasNext()) {

&nbsp;           char query = sc.next().charAt(0);

&nbsp;           char c = sc.next().charAt(0);

&nbsp;           

&nbsp;           if (query == 'i') {

&nbsp;               list.add(c);

&nbsp;           } else if (query == 'f') {

&nbsp;               if (!list.contains(c)) {

&nbsp;                   System.out.println(-1);

&nbsp;               } else {

&nbsp;                   System.out.println(Collections.frequency(list, c));

&nbsp;               }

&nbsp;           }

&nbsp;       }

&nbsp;       sc.close();

&nbsp;   }

}





\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string

