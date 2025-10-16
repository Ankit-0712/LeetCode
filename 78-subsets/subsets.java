class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(0, new ArrayList<>(), nums);
        return ans;
    }

    public void helper(int index, List<Integer>list, int[] nums){
        if(index== nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        helper(index+1, list, nums);

        list.remove(list.size() - 1);
        helper(index+1, list, nums);
    }
}