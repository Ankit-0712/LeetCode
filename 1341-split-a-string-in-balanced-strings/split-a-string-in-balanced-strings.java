class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'R'){
                r++;
            }else{
                l++;
            }

            if(r == l){
                ans++;
            }
        }

        return ans;
    }
}