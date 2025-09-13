class Solution {
    public int maxFreqSum(String s) {
    Map<Character,Integer> vMap = new HashMap<>();
    Map<Character,Integer> cMap = new HashMap<>();

    String vowels = "aeiou";

    for(char c: s.toCharArray()){
        if (vowels.indexOf(c) != -1) {
            vMap.put(c, vMap.getOrDefault(c,0) + 1);
        } else {
            cMap.put(c, cMap.getOrDefault(c, 0) + 1);
        }
    }

    int vFrq = 0;
    for (int freq : vMap.values()) {
        if (freq > vFrq) {
            vFrq = freq;
        }
    }

    int cFrq = 0;
    for (int freq : cMap.values()) {
        if (freq > cFrq) {
            cFrq = freq;
        }
    }

    return vFrq+cFrq;
 }
}