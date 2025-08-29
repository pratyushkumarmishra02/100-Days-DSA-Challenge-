class NextPermutation {
    public void nextPermutation(int[] nums) {
        int p = -1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1;i>p;i--){
            if(nums[i]>nums[p]){
                nums[p]=nums[p]+nums[i];
                nums[i]=nums[p]-nums[i];
                nums[p]=nums[p]-nums[i];

                break;
            }
        }

        int l=p+1,r=n-1;
        while(l<r){
            nums[l]=nums[l]+nums[r];
            nums[r]=nums[l]-nums[r];
            nums[l]=nums[l]-nums[r];

            l++;
            r--;
        }
    }
}