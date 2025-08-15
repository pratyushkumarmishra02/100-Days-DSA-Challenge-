class Solution {
    public int missingNumber(int[] nums) {
        int curSum = 0, actualSum = 0;
        for(int i : nums){
            curSum+=i;
        }
        for(int i=0;i<nums.length+1;i++){
            actualSum+=i;
        }
        return actualSum-curSum;

    }
}