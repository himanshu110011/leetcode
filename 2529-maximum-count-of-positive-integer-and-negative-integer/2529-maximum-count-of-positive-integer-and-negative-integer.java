class Solution {
    public int maximumCount(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int negativeCount = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]>=0) r=mid-1;
            else {
                l = mid + 1;
            }
        }
        negativeCount = l;
         l = 0;
         r = arr.length-1;
        int positiveCount = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]<=0) l=mid+1;
            else {
               r=mid-1;
            }
        }
       positiveCount = arr.length-l;
       return Math.max(negativeCount,positiveCount);
        
    }
}