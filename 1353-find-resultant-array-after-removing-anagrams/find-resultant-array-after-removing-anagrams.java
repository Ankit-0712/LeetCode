class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        String prev = "";
        for(String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted  = new String(chars);

            if(!sorted.equals(prev)){
                ans.add(word);
                prev = sorted;
            }

        }

        return ans;
    }
}