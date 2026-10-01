class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        
        List<List<Integer>> ans  = new ArrayList<>();

        solve(nums, used, ans, new ArrayList<>());

        return ans;

    }
    public void solve(int[] nums, boolean[] used, List<List<Integer>> ans, List<Integer> list){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i] == true) continue;

            used[i] = true;
            list.add(nums[i]);
            solve(nums, used, ans, list);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}