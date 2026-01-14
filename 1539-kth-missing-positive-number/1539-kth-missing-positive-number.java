class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            int m=arr[i]-(i+1);
            if(m>=k){
                return i+k;
            }
        }
        return arr.length+k;
    }
}