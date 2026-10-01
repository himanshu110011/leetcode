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
       for(int i=node; i<candidates.length; i++){
        if(i > node && candidates[i] == candidates[i-1]) continue;
        if(candidates[i] > target) break;

        l.add(candidates[i]);
        solve(candidates, target - candidates[i], i + 1, list, l);
        l.remove(l.size() - 1);
       }
    }
}