class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : nums){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }

         ans.addAll(duplicate);

         return ans;
    }
}