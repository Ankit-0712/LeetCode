class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;
        for(int[] rect : dimensions){
            int length = rect[0];
            int breadth = rect[1];

            double diagonal = Math.sqrt(length*length + breadth*breadth);
            int area = length*breadth;

            if(diagonal>maxDiagonal){
                maxDiagonal = diagonal;
                maxArea = area;
            }else if(diagonal==maxDiagonal && area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}