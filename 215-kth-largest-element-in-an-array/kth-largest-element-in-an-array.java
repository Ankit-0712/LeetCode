class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int largest = nums[n-k];

        return largest;
    }
}