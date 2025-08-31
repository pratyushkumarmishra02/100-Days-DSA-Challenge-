\# 🚀 Day 34 – DSA Challenge



This day focuses on some java regex example like "TagContentExtractor"



\# Tag Content Extractor



\## Problem Statement

In a tag-based language like \*\*XML\*\* or \*\*HTML\*\*, contents are enclosed between a start tag and an end tag like `<tag>contents</tag>`.  

The task is to parse the input text and extract all the valid contents enclosed within properly matching tags.



\### Rules:

1\. The \*\*start and end tag names must match\*\*.  

&nbsp;  - Example: `<h1>Hello</h1>` ✅ valid  

&nbsp;  - Example: `<h1>Hello</h2>` ❌ invalid  

&nbsp;  

2\. \*\*Nested tags are not valid\*\* for extracting text.  

&nbsp;  - Example: `<h1><a>contents</a>invalid</h1>` → only `"contents"` is valid. `"invalid"` is ignored.  



3\. Tags can consist of \*\*any printable characters\*\*.  



4\. If no valid content is found, output `"None"`.  



---



\## Input Format

\- The first line contains an integer `N`, the number of lines.  

\- The next `N` lines contain strings with possible tags.



---



\## Output Format

\- For each line:  

&nbsp; - Print each valid content enclosed within matching tags.  

&nbsp; - If no valid content exists, print `"None"`.



---



\## Example



\### Input:

4



<h1>Nayeem loves counseling</h1> <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par> <Amee>safat codes like a ninja</amee> <SA premium>Imtiaz has a secret crush</SA premium> ```



Output:

Nayeem loves counseling

Sanjay has no watch

So wait for a while

None

Imtiaz has a secret crush



Approach:



Use regular expressions to match valid tag-content-tag sequences.



The regex used:

<(\[^>/]+)>(\[^<>]+)</\\1>



1.<(\[^>/]+)> → captures the opening tag name.



2\.(\[^<>]+) → captures content between tags (excluding nested < >).



3\.</\\1> → ensures closing tag matches the opening tag.



For each line:



. Check for matches with the regex.



. Print all valid contents found.



. If none are found, print "None".



\## Sample Java Implementation



```java

import java.io.\*;

import java.util.\*;

import java.util.regex.\*;



public class Solution {



&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       int N = Integer.parseInt(sc.nextLine());

&nbsp;       

&nbsp;       // Regex pattern to extract valid tag contents

&nbsp;       Pattern tagPattern = Pattern.compile("<(\[^>/]+)>(\[^<>]+)</\\\\1>");



&nbsp;       for (int i = 0; i < N; i++) {

&nbsp;           String line = sc.nextLine();

&nbsp;           Matcher m = tagPattern.matcher(line);

&nbsp;           boolean found = false;

&nbsp;           

&nbsp;           while (m.find()) {

&nbsp;               System.out.println(m.group(2));

&nbsp;               found = true;

&nbsp;           }

&nbsp;           

&nbsp;           if (!found) {

&nbsp;               System.out.println("None");

&nbsp;           }

&nbsp;       }

&nbsp;   }

}

Complexity



Time Complexity: O(N \* M) where N = number of lines and M = length of each line (regex scan).



Space Complexity: O(1) aside from regex matching overhead.



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



