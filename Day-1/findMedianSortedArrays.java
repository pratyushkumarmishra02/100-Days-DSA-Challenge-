class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length + nums2.length];
        
        // Copy nums1
        for(int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        // Copy nums2
        for(int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }

        // Sort merged array using bubble sort
        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = 0; j < merged.length - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }

        // Find median
        int mid = merged.length / 2;
        if (merged.length % 2 == 0) {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            return merged[mid];
        }
    }
}
