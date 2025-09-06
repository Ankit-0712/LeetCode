class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        if(n>h) return -1;
        
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(piles[i]>maxi){
                maxi = piles[i];
            }
        }

        int start = 1, end = maxi;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(sumD(piles,mid) <= h){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return start;
    }

    private long sumD(int[] nums, int div){
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += Math.ceil((double)nums[i]/(double)div);
        }

        return sum;
    }
}