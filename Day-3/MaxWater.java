class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int leftPointer = 0;
        int rightPointer = height.length -1;
        while(leftPointer < rightPointer){
            int containerHeigth = Math.min(height[leftPointer],height[rightPointer]);
            int width = rightPointer - leftPointer;
            int containermaxarea = width * containerHeigth;
            maxarea = Math.max(maxarea,containermaxarea);
            if(height[leftPointer] < height[rightPointer]){
                leftPointer ++;
            }else{
                rightPointer--;
            }
        }
        return maxarea;
    }
}