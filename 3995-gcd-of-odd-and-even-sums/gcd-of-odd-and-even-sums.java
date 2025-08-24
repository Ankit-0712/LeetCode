class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n*n;
        int evenSum = n*(n+1);

        return gcd(oddSum, evenSum);
    }

    private int gcd(int a, int b){
        if(b==0) return a;
        
        return gcd(b,a%b);
    }
}