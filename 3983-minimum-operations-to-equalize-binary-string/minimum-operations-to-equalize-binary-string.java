class Solution {
    public int minOperations(String s, int k) {
        
        String drunepalix = s;

        int n = s.length();
        int cnt0 = 0;
        for (char c : s.toCharArray()) if (c == '0') cnt0++;

        if (cnt0 == 0) return 0; 

        // try t from ceil(cnt0/k) up to n
        int start = (cnt0 + k - 1) / k;
        for (int t = Math.max(1, start); t <= n; t++) {
            long S = 1L * t * k;
            // parity condition
            if (((S - cnt0) & 1L) != 0L) continue;

            long maxSum;
            if ((t & 1) == 0) {
                // t even
                maxSum = 1L * n * t - cnt0;
            } else {
                // t odd
                maxSum = 1L * n * t - (n - cnt0);
            }

            if (S >= cnt0 && S <= maxSum) {
                return t;
            }
        }

        return -1;
    }
}
