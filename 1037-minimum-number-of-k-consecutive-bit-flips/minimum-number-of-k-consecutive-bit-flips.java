class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] flipped = new int[n];
        int flipCount = 0;
        int currentFlip = 0;
        for(int i=0;i<n;i++){
            if(i>=k){
                currentFlip -= flipped[i-k];
            }

            if((nums[i] + currentFlip)%2==0){
                if(i+k>n) return -1;
                flipped[i] = 1;
                currentFlip++;
                flipCount++;
            }
        }

        return flipCount;
    }
}