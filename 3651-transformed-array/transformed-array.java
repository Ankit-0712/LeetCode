class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                result[i] = nums[i];
            }else if(nums[i]>0){
                 index = (i + nums[i])%n;
                result[i] = nums[index];
            }else if(nums[i]<0){
                index = (i - Math.abs(nums[i])%n+n)%n;
                result[i] = nums[index];
            }
        }

        return result;
    }
}