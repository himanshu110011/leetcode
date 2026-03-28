class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        List <int[]> events=new ArrayList<>();
        for(List<Integer> interval: nums){
            int st=interval.get(0);
            int en=interval.get(1);
             events.add(new int[]{st,+1});
             events.add(new int[]{en+1,-1});
        }
        Collections.sort(events,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
             return a[0]-b[0];
        });
        int active = 0;
        int prev = 0;
        int total = 0;

        for (int[] e : events) {
            int pos = e[0];
            int change = e[1];
            if (active > 0) {
                total += (pos - prev);
            }
            active += change;
            prev = pos;
        }
    return total;
    }
}