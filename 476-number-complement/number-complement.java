class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder ans = new StringBuilder();
        for(char c : binary.toCharArray()){
            if(c == '0'){
                ans.append('1');
            }else{
                ans.append('0');
            }
        }

        return Integer.parseInt(ans.toString(),2);
    }
}