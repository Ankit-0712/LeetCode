class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int first = firstDigit(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                int last = nums[j]%10;

                if(isCoprime(first,last)){
                    count++;
                }

            }
        }

        return count;
    }

    private int firstDigit(int num){
        while(num>=10){
            num/=10;
        }

        return num;
    }

    private boolean isCoprime(int x, int y){
        return gcd(x,y)==1;
    }

    private int gcd(int x, int y){
        while(y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }

        return x;
    }

    
}