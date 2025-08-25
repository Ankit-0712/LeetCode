class Solution {
    public int maxDepth(String s) {
        int counter  = 0, maxCounter = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                counter++;
            }
            if(s.charAt(i)==')'){
                counter--;
            }
        maxCounter = Math.max(maxCounter,counter);
        }

        return maxCounter;

    }
}