class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        List<int[]> events=new ArrayList<>();
        for(int[]b:bookings){
            events.add(new int[]{b[0],b[2]});
            events.add(new int[]{b[1]+1,-b[2]});
        }
        Collections.sort(events,(a,b)->a[0]-b[0]);
        int ans[]=new int[n];
        int sum = 0;
        int idx = 0;
        for (int i = 1; i <= n; i++) {   
            while (idx < events.size() && events.get(idx)[0] == i) {
                sum += events.get(idx)[1];
                idx++;
            }
            ans[i - 1] = sum;
        }
        return ans;
    }
}