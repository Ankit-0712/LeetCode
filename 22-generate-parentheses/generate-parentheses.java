class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack("", 0, 0,n, res);

        return res;
    }

    private void backTrack(String curr, int open, int close, int n, List<String>res ){
        if(curr.length()==2 *n){
            res.add(curr);
            return;
        }

        if(open< n) backTrack(curr + "(", open +1, close, n, res);
        if(close< open) backTrack(curr + ")", open, close+1, n, res);
    }
}