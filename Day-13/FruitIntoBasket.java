class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0,right, maxSize = 0;

        for (right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {
                int fruitLeft = fruits[left];
                int count = basket.get(fruitLeft);
                if (count == 1) {
                    basket.remove(fruitLeft);
                } else {
                    basket.put(fruitLeft, count - 1);
                }
                left++;
            }

            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }
}
