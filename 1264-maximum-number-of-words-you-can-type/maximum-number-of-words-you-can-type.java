class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for(String word : words){
           boolean isBroken = false;
            for(char ch : word.toCharArray()){
                if(brokenLetters.indexOf(ch)!=-1){ //broken found
                    isBroken = true;
                }
            }

            if(isBroken==false) count++;
        }

        return count;
    }
}