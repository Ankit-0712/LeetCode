class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;
        int min = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > min){
                min = num;
            }
        }

        int start = 1, end = min;
        while(start<= end){
            int mid = start+(end-start)/2;
            if(helper(nums, mid)<= maxOperations){
                end  = mid-1;
            }else{
                start = mid+1;
            }
        }

        return start;
    }

    private int helper(int[] nums, int div){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+= Math.ceil((double)nums[i]/(double)div)-1;
        }

        return sum;
    }

}