class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;

        // fill with pairs (i, -i)
        for (int i = 1; i <= n / 2; i++) {
            ans[index++] = i;
            ans[index++] = -i;
        }

        // if n is odd, add 0
        if (n % 2 == 1) {
            ans[index] = 0;
        }

        return ans;
    }
}
