class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        solve(nums, list, new ArrayList<>(), 0);
        return list;
    }
    public void solve(int[] nums, List<List<Integer>> list, List<Integer> l, int i){
        if(i == nums.length){
        list.add(new ArrayList<>(l));
        return;
        } 

        l.add(nums[i]);
        solve(nums, list, l, i+1);
        l.remove(l.size()-1);

        solve(nums, list, l, i+1);
    }
}