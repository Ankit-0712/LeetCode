class Solution {
    public int maxDistance(int[] colors) {
        int max = -1;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!= colors[j]){
                int ans = Math.abs(i-j);
                max = Math.max(max, ans);
                }
            }

        }
        return max;
    }

}