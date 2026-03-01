class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int c : n.toCharArray()){
            max = Math.max(max, c - '0');
        }
        return max;
        
    }
}