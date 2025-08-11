class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        double current = 0;
        for(int i=0;i<k;i++){
            current+=nums[i];
        }
        max=current;
        for(int i=k;i<nums.length;i++){
            current+=nums[i]-nums[i-k];
            max=Math.max(current,max);
        }
        return max/k;
    }
}