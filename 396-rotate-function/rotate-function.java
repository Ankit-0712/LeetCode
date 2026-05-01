class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int ans = 0;
        for(int x : nums){
            sum += x;
        }
        int total = 0;
        for(int i=0;i<n;i++){
            total += nums[i] * i;
        }

        ans = total;

        for(int i=1;i<n;i++){
            total = total - nums[n-i] * (n-1);
            total += sum-nums[n-i];
            ans = Math.max(ans, total);
        }

        return ans;
    }
}