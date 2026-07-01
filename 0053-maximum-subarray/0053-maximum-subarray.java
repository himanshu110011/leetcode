class Solution {
    public int maxSubArray(int[] arr) {
       int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
       return maxSum;

    // int maxSum = Integer.MIN_VALUE;
    // int currentSum = 0;
    
    // int maxEle = Integer.MIN_VALUE;
    // for(int i : arr){
    //     maxEle = Math.max(maxEle, i);
    // }

    // if(maxEle < 0){
    //     return maxEle;
    // }

    // for(int i=0; i<arr.length; i++){
    //     currentSum += arr[i];
    //     if(currentSum < 0) currentSum = 0;
    //     if(currentSum > maxSum)  maxSum = currentSum;
    // }
    // return maxSum;
    }
}