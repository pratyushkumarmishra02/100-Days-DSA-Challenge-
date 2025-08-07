class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int l=0,r=n-1;
        int pos = n-1;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                arr[pos]=nums[l] * nums[l];
                l++;
            }else{
                arr[pos] = nums[r] * nums[r];
                r--;
            }
            pos--;
        }
        return arr;
    }
}