class Solution {
    public int maxVowels(String s, int k) {
        int current = 0;
        int max = 0;
        String v = "[aeiou]";
        for(int i=0;i<k;i++){
            if(String.valueOf(s.charAt(i)).matches(v)) current++;
        }
        max=current;
        for(int i=k;i<s.length();i++){
            if(String.valueOf(s.charAt(i)).matches(v)) current++;
            if(String.valueOf(s.charAt(i-k)).matches(v)) current--;
            max=Math.max(current,max);
        }
        return max;
    }
}