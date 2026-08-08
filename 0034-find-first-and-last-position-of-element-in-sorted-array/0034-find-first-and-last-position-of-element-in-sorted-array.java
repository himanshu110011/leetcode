class Solution {
    public int[] searchRange(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        int findex=-1;
        int lindex =-1;
        int ans[]= new int[2];
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>target) r = mid-1;
            else if(arr[mid]<target) l = mid+1;
            else {
                findex = mid;
                r = mid-1;
            }
        }
        ans[0]=findex;
          l = 0;
        r = arr.length - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>target) r = mid-1;
            else if(arr[mid]<target) l = mid+1;
            else {
                lindex = mid;
                l = mid+1;
            }
        }
        ans[1]=lindex;
        return ans;
    }
}