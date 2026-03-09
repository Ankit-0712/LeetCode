class Solution {
    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        String res ="";
        for(int i=0;i<str.length;i++){
            String s = Integer.toBinaryString(Integer.parseInt(str[i]));
            res += s;
            if(i<str.length-1){
                res += "-";
            }
        }

        return res;
    }
}