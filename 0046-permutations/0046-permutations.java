class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans  = new ArrayList<>();

        solve(0, nums, ans);

        return ans;

    }
    public void solve(int idx, int[] nums, List<List<Integer>> ans){
        if(idx == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }


        for(int i=idx; i<nums.length; i++){
           swap(idx, i, nums);
           solve(idx + 1, nums, ans);
           swap(idx, i, nums);

        }
    }
    public void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}