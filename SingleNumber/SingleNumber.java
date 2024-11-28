package SingleNumber;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {2,2,1};
        int ans = single(nums);
        System.out.println(ans);
    }

    static int single(int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
