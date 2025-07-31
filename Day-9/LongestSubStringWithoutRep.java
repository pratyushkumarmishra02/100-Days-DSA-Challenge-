class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0,end=0,max_len=0;
        Set<Character> set = new HashSet<>();
        while(end < s.length()){
            char c = s.charAt(end);
            if(!set.contains(c)){
                set.add(c);
                end++;
                max_len = Math.max(max_len,set.size());
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max_len;
    }
}