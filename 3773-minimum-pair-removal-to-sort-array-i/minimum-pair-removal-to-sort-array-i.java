class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
      
        int count = 0;
        while(!isSorted(list)){
            int minSum = Integer.MAX_VALUE;
            int index = -1;
            for(int i=0;i<list.size()-1;i++){
                int sum = list.get(i) + list.get(i+1);
                if(sum < minSum){
                    minSum = sum;
                    index = i;
                }
            }

            list.set(index, minSum);
            list.remove(index+1);
            count++;
        }
        
        return count;
    }

    boolean isSorted(List<Integer> nums){
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
    
}