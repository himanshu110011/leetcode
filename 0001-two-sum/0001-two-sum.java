class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
          for(int j=i+1;j<n;j++){
             sum=nums[i]+nums[j];
           if(sum==target){
             a[0]=i;
             a[1]=j;
           }
          }
        }
        return a;
    }
}