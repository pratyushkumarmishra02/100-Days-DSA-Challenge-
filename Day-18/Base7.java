class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        int original = num;
        int temp = Math.abs(num);
        StringBuilder remds = new StringBuilder();
        while(temp  > 0){
            int rem = temp%7;
            remds.append(rem);
            temp = temp/7;            
        }
        if(original<0){
            remds.append('-');
        }
        return remds.reverse().toString();
    }
}