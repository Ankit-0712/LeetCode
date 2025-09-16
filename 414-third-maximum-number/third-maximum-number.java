class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int elemCounted = 1;
        int prevElem = nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] != prevElem){
                elemCounted++;
                prevElem = nums[i];
            }

            if(elemCounted ==3){
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
}