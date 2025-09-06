class MakeTheIntegerZero {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long target = (long)num1 - (long)k * num2;
            if (target < 0) break;
            int bitCount = Long.bitCount(target);
            if (bitCount <= k && k <= target) return k;
        }
        return -1;
    }
}
