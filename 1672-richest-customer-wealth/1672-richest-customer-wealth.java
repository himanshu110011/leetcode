class Solution {
    public int maximumWealth(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=a[i][j];
                
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}