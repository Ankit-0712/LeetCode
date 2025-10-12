class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev = 0;

        for(String word : words){

            try{
            int curr = Integer.parseInt(word);

            if(curr <= prev){
                return false;
            }

            prev = curr;
        }catch(NumberFormatException e){
            continue;
        }
        }

        return true;
    }
}