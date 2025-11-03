class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(nums, new ArrayList<>(), used, ans);
        return ans;
    
    }

    void backTrack(int[] nums, List<Integer>current, boolean[] used, List<List<Integer>> result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            if(!used[i]){
                current.add(nums[i]);
                used[i] = true;
                backTrack(nums,current,used,result);

                current.remove(current.size()-1);
                used[i] = false;
            }
        }
    }
} 
