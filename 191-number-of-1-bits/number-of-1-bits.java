class Solution {
    public int hammingWeight(int n) {
        int setBits = Integer.bitCount(n);
        return setBits;
    }
}