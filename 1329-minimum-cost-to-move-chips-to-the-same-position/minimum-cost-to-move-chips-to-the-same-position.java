class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddPos = 0;
        int evenPos = 0;
        for(int i=0;i<position.length;i++){
            if(position[i] %2==0){
                evenPos++;
            }else{
                oddPos++;
            }
        }

        return Math.min(evenPos, oddPos);
    }
}