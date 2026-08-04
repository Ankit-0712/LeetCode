class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int current = nums[0];

        for(int i=0; i< nums.length ;current++, i++){
            if(current < nums[i]){
                res.add(current);
                i--;
            }
        }

        return res;
    }
}