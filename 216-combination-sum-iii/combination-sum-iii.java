class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(n,1,k,new ArrayList<>(),ans);
        return ans;
    }

    private void backTrack(int sum, int start,int k, List<Integer> current, List<List<Integer>> result){
        //base condition
        if(current.size()==k && sum==0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(sum<=0 || current.size()>k){
            return;
        }

        for(int i=start; i<=9; i++){
            if(i<=sum){
                current.add(i);
                backTrack(sum-i,i+1, k,current, result);
                current.remove(current.size()-1);
            }else{
                break;
            }
        }
    }
}