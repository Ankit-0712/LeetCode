class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int count = 0;
        for(int i=0;i<piles.length/3;i++){
            count += piles[n-2];
            n -= 2;
        }

        return count;
    }
}