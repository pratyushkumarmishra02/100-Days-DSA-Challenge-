class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int non = 0;
        for(int num : nums){
            if(num!=0){
                nums[non++] =  num;
            }
        }
        while(non<n){
            nums[non++] = 0;
        }
        
    }
}