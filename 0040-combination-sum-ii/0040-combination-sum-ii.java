class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(candidates);

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
        solve(candidates, target - candidates[node], node + 1 , list, l);
        l.remove(l.size() - 1);
        }

        int next = node + 1;

        while(next < candidates.length && candidates[next] == candidates[node]){
            next++;
        }

        solve(candidates, target , next, list, l);
    }
}