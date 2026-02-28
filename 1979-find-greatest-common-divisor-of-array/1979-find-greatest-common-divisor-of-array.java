class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x=nums[0];
        int y=nums[nums.length-1];
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;
    }
}