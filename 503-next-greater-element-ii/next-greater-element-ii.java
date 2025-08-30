class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            nge[i] = -1;
            for(int j=i+1;j<i+nums.length;j++){
                int index = j % nums.length;
                if(nums[index]>nums[i]){
                    nge[i]= nums[index];
                    break;
                }
            }
        }
        return nge;
    }
}