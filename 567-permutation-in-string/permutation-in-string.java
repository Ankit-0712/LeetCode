class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(char ch : s1.toCharArray()){
            s1Count[ch-'a']++;
        }

        int i=0,j=0;
        while(j<m){
            s2Count[s2.charAt(j)-'a']++;
            if(j-i+1>n){//shrink window
                s2Count[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(s1Count, s2Count)){
                return true;
            }
            j++;
        }
        return false;
    }
}