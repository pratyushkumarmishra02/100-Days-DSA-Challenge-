class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for (int i = n - 1; i >= 2; i--){
            int left = 0;
            int right = i-1;
            int target = nums[i];
            while(left<right){
                int sum = nums[left] + nums[right];
                if(sum>target){
                    res += (right-left);
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}