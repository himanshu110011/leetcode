class Solution {
    public int mySqrt(int n) {
        // return (int)Math.sqrt(x);
         int l = 1;
        int r = n;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid == n/mid) return mid;
            else if(mid < n/mid) l = mid+1;
            else r = mid-1;
        }
        return r;
    }
}