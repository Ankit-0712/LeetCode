class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int sal : salary) {
            min = Math.min(min, sal);
            max = Math.max(max, sal);
            sum += sal;
        }

        int ans = sum - min - max;
        return (double) ans / (n - 2);

    }
}