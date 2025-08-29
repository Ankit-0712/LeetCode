class Solution {
    public long flowerGame(int n, int m) {
        long evenN = (n+1)/2;
        long oddN = n/2;
        long evenM = (m+1)/2;
        long oddM = m/2;

        long aliceWins = (oddN * evenM) + (evenN * oddM);

        return aliceWins;
    }
}