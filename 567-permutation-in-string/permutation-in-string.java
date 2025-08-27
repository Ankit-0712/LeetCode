class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;

        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        String sorteds1 = new String(ch);

        for(int i=0;i<=m-n;i++){
            String sub = s2.substring(i,i+n);
            char[] subArr = sub.toCharArray();
            Arrays.sort(subArr);
            String sortedSub = new String(subArr);

            if(sorteds1.equals(sortedSub)) return true;
        }
        return false;
    }
}