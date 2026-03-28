class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
       int [] diff=new int[n];
       for(int[]b:bookings){
        int st=b[0]-1;
        int end=b[1]-1;
        int seat=b[2];
        diff[st]+=seat;
        if(end+1<n){
            diff[end+1]-=seat;
        }
       } 
       int pre[]=new int[n];
       pre[0]=diff[0];
       for(int i=1;i<n;i++){
        pre[i]=pre[i-1]+diff[i];
       }
       return pre;
    }
}