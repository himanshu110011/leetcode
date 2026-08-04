class Solution {
    public int mySqrt(int n) {
        // return (int)Math.sqrt(x);
        long l = 0;
        long r = n;
        while(l<=r){
            long mid = (l+r)/2;
            if(mid*mid == n) return (int)mid;
            else if(mid*mid < n) l = mid+1;
            else r = mid-1;
        }
        return (int)r;
    }
}