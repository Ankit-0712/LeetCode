class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0,i=0;
        for(int j = 0;j<nums.size();j++){
              map.put(nums.get(j), map.getOrDefault(nums.get(j), 0) + 1);
            maxCount = Math.max(maxCount, map.get(nums.get(j)));
            if(j-i+1-maxCount>k){
                map.put(nums.get(i), map.get(nums.get(i))-1);
                i++;
            }
        }

        return maxCount;
    }
}