class Solution {
    public int dominantIndex(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int maxindex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi = nums[i];
                maxindex = i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] != maxi && maxi < 2*nums[i]){
                return -1;
            }
        }

        return maxindex;
    }
}