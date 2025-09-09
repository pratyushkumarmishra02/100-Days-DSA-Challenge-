class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int sum =0;
        for(int i=1;i<n;i++){
            ans[i-1] = i;
            sum+=i;
        }
        ans[n-1] = -1*sum;
        return ans;
    }
}
