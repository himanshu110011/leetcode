class Solution {
    public int maxSubArray(int[] arr) {
      int max = arr[0];
      int sum = arr[0];
      for(int i=1; i<arr.length; i++){ 
        if(sum<0){
            sum=0;
        }
         sum += arr[i];
        max = Math.max(max,sum);
      }
      return max;
    }
}