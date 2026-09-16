class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

         Arrays.sort(nums);

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
        while(next < nums.length && nums[node] == nums[next]){
            next++;
        }   
     solve(nums, next, list, l); 
    }
}