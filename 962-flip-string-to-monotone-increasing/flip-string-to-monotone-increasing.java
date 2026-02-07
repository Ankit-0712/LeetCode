class Solution {
    public int minFlipsMonoIncr(String s) {
        int ones = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else { // s.charAt(i) == '0'
                if (ones > 0) {
                    ans++;
                    ones--;   // flip one previous '1' instead of this '0'
                }
            }
        }

        return ans;
    }
}
