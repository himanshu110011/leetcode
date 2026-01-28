class Solution {
    public int singleNumber(int[] arr) {
       int n=arr.length;
       int m=0;
       for(int i:arr){
        int c=0;
        for(int j:arr){
            if(i==j) c++;
        }
        if(c==1) m=i;
       }
       return m;
    }
}