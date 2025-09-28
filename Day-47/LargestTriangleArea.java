class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int p1[]=points[i];
                    int p2[]=points[j];
                    int p3[]=points[k];

                    int x1 = p1[0],y1 = p1[1];
                    int x2 = p2[0],y2 = p2[1];
                    int x3 = p3[0],y3 = p3[1];

                    double area = 0.5*(Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)));
                    maxArea = Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
}