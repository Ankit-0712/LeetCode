package MoveZerosToEnd;

public class MoveZero {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        move(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }

    static void move(int[] nums){
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != 0){
                if(i != j){
                    nums[i] = nums[j];
                    i++;
                }
            }
        }
        for(int k = i;k<nums.length;k++){
            nums[k] = 0;
        }
    }
}
