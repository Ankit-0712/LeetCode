class Solution {
    public int minOperations(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == 0){
                nums[i] = 1;
                nums[i+1] = flip(nums[i+1]);
                nums[i+2] = flip(nums[i+2]);
                count++;
            }
        }

        // Check if all are 1
        for(int num : nums){
            if(num == 0) return -1;
        }

        return count;
    }

    int flip(int n){
        return 1 - n;  // cleaner way
    }
}
