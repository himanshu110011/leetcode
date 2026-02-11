class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
       for(int i = 0; i < n; i++){
            int l = 0, r = n - 1;
            while(l < r){
                int temp = a[i][l];
                a[i][l] = a[i][r];
                a[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}