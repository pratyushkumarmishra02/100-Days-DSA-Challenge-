\# 🚀 Day 33 – DSA Challenge



\# 📘 LeetCode 49 \& 35



---



\## 🔹 LeetCode 49: Group Anagrams



\### Problem Statement

Given an array of strings `strs`, group the anagrams together. You can return the answer in \*\*any order\*\*.



An \*\*anagram\*\* is a word or phrase formed by rearranging the letters of a different word, typically using all the original letters exactly once.



\### Example 1

\*\*Input:\*\*  

`strs = \["eat","tea","tan","ate","nat","bat"]`  

\*\*Output:\*\*  

`\[\["bat"],\["nat","tan"],\["ate","eat","tea"]]`



\### Example 2

\*\*Input:\*\*  

`strs = \[""]`  

\*\*Output:\*\*  

`\[\[""]]`



\### Example 3

\*\*Input:\*\*  

`strs = \["a"]`  

\*\*Output:\*\*  

`\[\["a"]]`



\### Constraints

\- `1 <= strs.length <= 10^4`  

\- `0 <= strs\[i].length <= 100`  

\- `strs\[i]` consists of lowercase English letters.  



\### Approach

\- Sort each word’s characters and use it as a \*\*key\*\* in a HashMap.  

\- Group words with the same sorted key together.



\*\*Complexity:\*\*  

\- Time: `O(n \* k log k)` (where `n` is the number of words and `k` is the max length of a word).  

\- Space: `O(n \* k)` for storing results.    



\## Sample Java Implementation



```java

class GroupAnagrams {

&nbsp;   public List<List<String>> groupAnagrams(String\[] strs) {

&nbsp;       Map<String, List<String>> map = new HashMap<>();



&nbsp;       for (String s : strs) {

&nbsp;           char\[] chars = s.toCharArray();

&nbsp;           Arrays.sort(chars);

&nbsp;           String key = new String(chars);



&nbsp;           if (!map.containsKey(key)) {

&nbsp;               map.put(key, new ArrayList<>());

&nbsp;           }

&nbsp;           map.get(key).add(s);

&nbsp;       }



&nbsp;       return new ArrayList<>(map.values());

&nbsp;   }

}







---



\## 🔹 LeetCode 35: Search Insert Position



\### Problem Statement

Given a \*\*sorted array of distinct integers\*\* and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.



\### Example 1

\*\*Input:\*\*  

`nums = \[1,3,5,6], target = 5`  

\*\*Output:\*\*  

`2`



\### Example 2

\*\*Input:\*\*  

`nums = \[1,3,5,6], target = 2`  

\*\*Output:\*\*  

`1`



\### Example 3

\*\*Input:\*\*  

`nums = \[1,3,5,6], target = 7`  

\*\*Output:\*\*  

`4`



\### Constraints

\- `1 <= nums.length <= 10^4`  

\- `-10^4 <= nums\[i] <= 10^4`  

\- `nums` contains \*\*distinct\*\* values sorted in ascending order.  



\### Approach

\- Use \*\*Binary Search\*\* to find the target efficiently in `O(log n)` time.  

\- If not found, return the position where it should be inserted.  



---



\## Sample Java Implementation



```java



class SearchInsert {

&nbsp;   public int searchInsert(int\[] nums, int target) {

&nbsp;       int left = 0, right = nums.length - 1;



&nbsp;       while (left <= right) {

&nbsp;           int mid = left + (right - left) / 2;



&nbsp;           if (nums\[mid] == target) {

&nbsp;               return mid;

&nbsp;           } else if (nums\[mid] < target) {

&nbsp;               left = mid + 1;

&nbsp;           } else {

&nbsp;               right = mid - 1;

&nbsp;           }

&nbsp;       }

&nbsp;       return left;

&nbsp;   }

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string



