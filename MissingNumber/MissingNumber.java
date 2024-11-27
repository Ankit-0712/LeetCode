package MissingNumber;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {3,0,1};
        int ans = missing(nums);
        System.out.println(ans);
    }

    static int missing(int[] nums){
        int n = nums.length;
        int Nsum = n*(n+1)/2;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return(Nsum - sum);
    }
}
