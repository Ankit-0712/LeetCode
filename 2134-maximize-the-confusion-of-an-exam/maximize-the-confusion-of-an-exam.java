class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
          int[] arr = new int[26];
        int res = 0;
        int max=  0;
        
        int l = 0;
        for(int r=0;r<answerKey.length();r++){
            arr[answerKey.charAt(r)-'A']++;

            max = Math.max(max,arr[answerKey.charAt(r)-'A']);
            if(r-l+1-max>k){
                arr[answerKey.charAt(l)-'A']--;
                l++;
            }

            res= Math.max(res,r-l+1);
        }

        return res;
    }
}