class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.isEmpty()){
            return new ArrayList<>();
        }
        return padRet("", digits);
    }
    private List<String> padRet(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        int start = (digit - 2) *3;
        if(digit > 7){
            start += 1;
        }

        int end = start +3;
        if(digit==7 || digit==9){
            end +=1 ;
        }
        List<String> ans = new ArrayList<>();
        for(int i=start ;i<end;i++){
            char ch = (char) ('a' + i);
            ans.addAll(padRet(p+ch, up.substring(1)));
        }
    return ans;
    }
}