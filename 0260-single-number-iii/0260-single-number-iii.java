class Solution {
    public int[] singleNumber(int[] arr) {
        int n=arr.length;
        int num[]=new int[2];
        int k=0;
        for(int i:arr){
            int c=0;
            for(int j:arr){
                if(i==j) c++;
            }
            if(c==1) {
                num[k]=i;
                k++;
            }
        }
        return num;
    }
}