class Solution {
    public int maximumCount(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int  pcount = 0;
        while(l<=r){
            int mid = l + (r - l)/2;
            if(arr[mid] <= 0) l = mid+1;
            else r = mid-1;
        }
        pcount = arr.length - l;
        l = 0;
        r = arr.length-1;
        int  ncount = 0;
        while(l<=r){
            int mid = l + (r - l)/2;
            if(arr[mid] >= 0) r = mid-1;
            else l = mid+1;
        }
        ncount = l;
        return Math.max(pcount, ncount);
    }
}