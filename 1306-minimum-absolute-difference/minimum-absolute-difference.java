class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff = Math.abs(arr[i]-arr[i+1]);
            minDiff = Math.min(minDiff, diff);
        }

        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])== minDiff){
               ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        return ans;
    }
}