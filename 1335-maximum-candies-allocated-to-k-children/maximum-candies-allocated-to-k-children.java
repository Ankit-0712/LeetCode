class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int maxi = Integer.MIN_VALUE;

        for(int num : candies){
            if(num>maxi){
                maxi = num;
            }
        }

        int start = 0, end = maxi;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(helper(candies,mid)>=k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }

    private long helper(int[] nums, int div){
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += Math.floor((double)nums[i]/(double)div);
        }

        return sum;
    }
}