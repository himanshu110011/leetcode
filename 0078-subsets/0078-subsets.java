class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        solve(nums, 0, list, new ArrayList<>());

        return list;
    }
    public void solve(int[] nums, int node, List<List<Integer>> list, List<Integer> l){
        if(node == nums.length){
            list.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[node]);
        solve(nums, node + 1, list, l);
        l.remove(l.size() - 1);

        int next = node + 1;
        if(next < nums.length && nums[next] == nums[node]) next++;

        solve(nums, next, list, l);
    }
}