class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list =  new ArrayList<>();
        solve(candidates, target, 0, list, new ArrayList<>());
        return list;
    }
    public void solve(int[] candidates, int target, int i, List<List<Integer>> list, List<Integer> l){
        if(target == 0){
            list.add(new ArrayList<>(l));
            return;
        }

        if(i == candidates.length){
            return;
        }

        if(candidates[i] <= target){
            l.add(candidates[i]);

            solve(candidates, target - candidates[i], i, list, l);

            l.remove(l.size()-1);
        }

        solve(candidates, target, i+1, list, l);
    }
}