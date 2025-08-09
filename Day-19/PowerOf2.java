class Solution {
    public boolean isPowerOfTwo(int n) {
        // if (n < 1) return false;   
        // int power = 1;
        // while (power < n) {
        //     power *= 2;
        // }
        // return power == n;
        return n > 0 && (n & (n - 1)) == 0;
    }
}