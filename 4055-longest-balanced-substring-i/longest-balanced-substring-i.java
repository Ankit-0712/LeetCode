class Solution {
    public int longestBalanced(String s) {
        int n  = s.length();
        int maxLen = 0;
        for(int i=0;i<n;i++){
            int[] freq = new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j) - 'a']++;
                if(isBalanced(freq)){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }

        return maxLen;
    }

    private boolean isBalanced(int[] freq){
        int common = 0;
        for(int count : freq){
            if(count>0){
                if(common == 0){
                    common= count;
                }else if(count != common){
                    return false;
                }
            }
        }

        return true;
    }
}