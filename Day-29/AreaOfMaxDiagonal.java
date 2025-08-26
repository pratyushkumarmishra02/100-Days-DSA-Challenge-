class AreaOfMaxDiagonal {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDia = 0;
        int maxArea = 0;
        for(int[] dimen:dimensions){
            int i=dimen[0];
            int j=dimen[1];
            double diagonal = Math.sqrt((i*i) + (j*j));
            int area =i*j;
            if(diagonal>maxDia){
                maxDia = diagonal;
                maxArea = area;
            }else if(diagonal==maxDia && area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;
    }
}