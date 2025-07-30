class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int prev2 = 0, prev1 = 0;
        for(int n : nums){
            int temp = prev1;
            prev1 = Math.max(prev2 + n, prev1);
            prev2 = temp;
        }
        return prev1;
    }
}