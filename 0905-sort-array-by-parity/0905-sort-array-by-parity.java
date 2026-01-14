class Solution {
    public int[] sortArrayByParity(int[]arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
          for(int j=0;j<n-i-1;j++){
            if(arr[j]%2!=0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
          }
        }
        return arr;
    }
}