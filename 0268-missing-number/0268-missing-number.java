class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
      int sum=n*(n+1)/2;
      int asum=0;
      for(int i:nums){
        asum+=i;
      }
      return sum-asum;
    }
}