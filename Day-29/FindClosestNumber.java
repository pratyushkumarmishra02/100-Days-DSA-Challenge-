class FindClosestNumber {
    public int findClosestNumber(int[] nums) {
        int res=0;
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            if(Math.abs(num)<min){
                min=Math.abs(num);
                res=num;
            }else if(Math.abs(num)==min && num>res){
                res=num;
            }
        }
        return res;
    }
}