class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = Integer.MIN_VALUE;
        int maxArea = 0;
        for(int[] rect : dimensions){
            int length = rect[0];
            int breadth = rect[1];

            int diagonal = length*length + breadth*breadth;
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