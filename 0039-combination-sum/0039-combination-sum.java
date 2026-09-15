class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        solve(candidates, target, 0, list, new ArrayList<>());

        return list;
    }
    public void solve(int[] candidates, int target, int node, List<List<Integer>> list, List<Integer> l){
        if(target == 0){
            list.add(new ArrayList<>(l));
            return;
        }
        if(node == candidates.length) return;
        
        if(candidates[node] <= target){
        l.add(candidates[node]);
        solve(candidates, target - candidates[node], node , list, l);
        l.remove(l.size() - 1);
        }

        solve(candidates, target , node + 1, list, l);
    }
}