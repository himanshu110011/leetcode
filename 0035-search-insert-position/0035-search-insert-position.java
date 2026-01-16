class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l1.add(nums[i]);
        }
        int k=Collections.binarySearch(l1,target);
        if(k>=0){
            return k;
        }
        else return Math.abs(k)-1;
    }
}