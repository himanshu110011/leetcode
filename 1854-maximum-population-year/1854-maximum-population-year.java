class Solution {
    public int maximumPopulation(int[][] logs) {
        ArrayList <int[]> events=new ArrayList<>();
        for(int log[]:logs){
            events.add(new int[]{log[0],+1});
            events.add(new  int[]{log[1],-1});
        }
        Collections.sort(events,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        int max=0;
        int curr=0;
        int year=0;
        for(int[]e : events){
            curr+=e[1];
            if(curr>max){
                max=curr;
                year=e[0];
            }
        }
        return year;
    }
}