class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0; i<=n; i++){
            int temp = i;
            int c = 0;
            while(temp != 0){
               if((temp & 1) != 0) c++;
               temp = temp>>1;
            }
            arr[i] = c;
        }
        return arr;
    }
}