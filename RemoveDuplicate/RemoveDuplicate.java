package RemoveDuplicate;

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] nums = {1,2,2,3,3};
        int ans = remove(nums);
        System.out.println(ans);
    }

    static int remove(int[] nums){
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!= nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
