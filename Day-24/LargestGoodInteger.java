class Solution {
    public String largestGoodInteger(String num) {
        String best = "";
        for (int i=2;i<num.length();i++) {
            if(num.charAt(i-2)==num.charAt(i-1) && num.charAt(i-1)==num.charAt(i)){
                String s = num.substring(i-2,i+1);
                if(s.compareTo(best)>0){
                    best=s;
                }
            }
        }
        return best;
    }
}