class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> ans = new HashSet<>();
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(j-i>k){
                ans.remove(nums[i]);
                i++;
            }
            if(ans.contains(nums[j])){
                return true;
            }
            ans.add(nums[j]);
        }

        return false;
    }
}