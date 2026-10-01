class Solution {
    public void solve(int i, int target, int[] candidates, List<List<Integer>> ans, List<Integer> list){
        if(i == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));    
            }
            return;
        }
        if(candidates[i] <= target){
        list.add(candidates[i]);
        solve(i, target - candidates[i], candidates, ans, list);
        list.remove(list.size() - 1);
        }

        solve(i + 1, target, candidates, ans, list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }
}