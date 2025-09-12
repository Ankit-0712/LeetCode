class Solution {
    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch == 'i' || ch =='o' || ch =='u';
    }
    public boolean doesAliceWin(String s) {
        int n = s.length();

        int vowelCount = 0;
        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
        }
        if(vowelCount==0){
            return false;
        }

        return true;
    }
}