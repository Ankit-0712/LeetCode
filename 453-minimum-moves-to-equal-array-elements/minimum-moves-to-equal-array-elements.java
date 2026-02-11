class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int minElement = Integer.MAX_VALUE;
        for(int num: nums){
            minElement = Math.min(minElement, num);
            sum += num;
        }
       return sum - (nums.length * minElement);
    }
}