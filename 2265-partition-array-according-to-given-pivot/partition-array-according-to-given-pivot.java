class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int num : nums){
            if(num<pivot){
                left.add(num);
            }else if(num == pivot){
                mid.add(num);
            }else{
                right.add(num);
            }
        }

        int index = 0;
        for(int num : left) nums[index++] = num;
        for(int num : mid) nums[index++] = num;
        for(int num : right) nums[index++] = num;

        return nums;
    }
}