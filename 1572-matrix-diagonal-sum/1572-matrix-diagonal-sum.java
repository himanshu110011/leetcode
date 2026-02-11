class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int k=n-1;
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i];
            sum+=mat[i][k];
            k--;
        }
        if(n%2!=0){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
}