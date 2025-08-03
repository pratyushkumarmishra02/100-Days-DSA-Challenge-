class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        TreeMap<Integer, Integer> freqDifference = new TreeMap<>();
        int globalMin = Integer.MAX_VALUE;

        for (int b1 : basket1) {
            freqDifference.put(b1, freqDifference.getOrDefault(b1, 0) + 1);
            globalMin = Math.min(globalMin, b1);
        }

        for (int b2 : basket2) {
            freqDifference.put(b2, freqDifference.getOrDefault(b2, 0) - 1);
            globalMin = Math.min(globalMin, b2);
        }

        List<Integer> mismatchedItems = new ArrayList<>();
        for (var entry : freqDifference.entrySet()) {
            int count = entry.getValue();
            if (count % 2 != 0) {
                return -1; // Cannot balance baskets
            }
            for (int i = 0; i < Math.abs(count) / 2; i++) {
                mismatchedItems.add(entry.getKey());
            }
        }

        Collections.sort(mismatchedItems);
        long minCost = 0;
        int size = mismatchedItems.size();

        for (int i = 0; i < size / 2; i++) {
            minCost += Math.min(mismatchedItems.get(i), 2 * globalMin);
        }

        return minCost;
    }
}
