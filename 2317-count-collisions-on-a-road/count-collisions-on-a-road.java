class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        int ans = 0;
        if(n==1) return 0;
        int l =0, r=n-1;
        while(l<n && directions.charAt(l)=='L') l++;
        while(l>=l && directions.charAt(r)== 'R') r--;
        for(int i=l;i<=r;i++){
            if(directions.charAt(i)!= 'S') ans++;
        }
        return ans;
    }
}