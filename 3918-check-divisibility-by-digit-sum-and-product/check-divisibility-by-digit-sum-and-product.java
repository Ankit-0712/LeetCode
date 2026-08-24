class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProd = 1;
        int temp = n;
        while(temp != 0){
            int digit = temp % 10;
            digitSum += digit;
            digitProd *= digit;
            temp/= 10;
        }
        int newSum = digitSum + digitProd;
        return n !=0 && n % newSum==0;
    }
}