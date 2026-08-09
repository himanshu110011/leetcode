class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]) l = mid+1;
                else r = mid;
            }
            else{
                if(arr[mid]==arr[mid-1]) l = mid+1;
                else r = mid;
            }
        }
        return arr[l];
    }
}