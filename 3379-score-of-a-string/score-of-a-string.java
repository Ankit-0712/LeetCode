class Solution {
    public int scoreOfString(String s) {
        char[] str = s.toCharArray();
        int index = str.length;
        int score = 0;

        for(int i=0;i<index-1;i++){
            score += Math.abs(str[i]-str[i+1]);
        }

        return score;
    }
}