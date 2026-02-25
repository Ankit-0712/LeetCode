class Solution {
    public int[] sortByBits(int[] arr) {
        final int magicNumber = 10001;
        for(int i=0;i<arr.length;i++){
            arr[i] += Integer.bitCount(arr[i]) * magicNumber;
        }

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i] %= magicNumber;
        }

        return arr;

    }
}