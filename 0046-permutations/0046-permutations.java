class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        helper(list, new ArrayList<>(), nums, used);

        return list;
    }

    public void helper(List<List<Integer>> list,
                       List<Integer> l,
                       int[] nums,
                       boolean[] used) {

        if (l.size() == nums.length) {
            list.add(new ArrayList<>(l));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) continue;

            used[i] = true;
            l.add(nums[i]);

            helper(list, l, nums, used);

            l.remove(l.size() - 1);
            used[i] = false;
        }
    }
}