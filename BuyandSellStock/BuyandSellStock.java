package BuyandSellStock;

public class BuyandSellStock {
    public static void main(String[] args){
        int[] nums = {7,1,5,3,6,4};
        int ans = maxProfit(nums);
        System.out.println(ans);
    }

    static int maxProfit(int[] nums){
        int maxi = 0;
        int minimum = nums[0];
        for(int i =0;i<nums.length;i++){
            minimum = Math.min(minimum, nums[i]);
            maxi = Math.max(maxi, nums[i]-minimum);


        }

        return maxi;
    }
}
