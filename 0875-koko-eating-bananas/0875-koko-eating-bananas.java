class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i : piles){
            max = Math.max(max, i);
        }
        int l = 1;
        int r = max;
        while(l<r){
            int mid = l+(r-l)/2;
            int hours = 0;
            for(int i : piles){
                hours += (i+(mid-1))/mid;
            }
            if(hours <= h) r = mid;
            else l = mid+1;
        }
       return l;
    }
}