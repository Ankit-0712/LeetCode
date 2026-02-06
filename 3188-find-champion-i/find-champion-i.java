class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<n;i++){
            boolean isChamp = true;
            for(int j=0;j<n;j++){
                if(i !=j && grid[j][i]==1){
                    isChamp = false;
                    break;
                }
            }
            if(isChamp){
            return i;
        }
        }
return -1;
    }
}