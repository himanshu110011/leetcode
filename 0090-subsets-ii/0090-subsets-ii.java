class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        solve(nums, 0, list, new ArrayList<>());

        return list;
    }
    public void solve(int[] nums, int index, List<List<Integer>> list, List<Integer> l){
        list.add(new ArrayList<>(l));
        
        for(int i = index; i<nums.length; i++){
            if(i > index && nums[i-1] == nums[i]){
                continue;
            }

            l.add(nums[i]);

            solve(nums, i + 1, list, l);

            l.remove(l.size() - 1);
        }
    }
}