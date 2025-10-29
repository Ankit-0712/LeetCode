class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(simulate(nums,i,1)) count++;

                if(simulate(nums, i, -1)) count++;
            }
        }

        return count;
    }

    private boolean simulate(int[] nums, int curr, int dir){
        int[] arr = nums.clone();

        while(curr>=0 && curr<nums.length){
            if(arr[curr]==0){
                curr += dir;

            }else{
                arr[curr]--;
                dir *= -1;
                curr += dir;
            }
        }

        for(int val : arr){
            if(val != 0) return false;
        }

        return true;
    }
}