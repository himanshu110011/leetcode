class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int k=0;
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
                nums[k]=i;
                k++;
            }
        }
        return k;
    }
}