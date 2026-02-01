class Solution {
    public int[] twoSum(int[] arr, int target) {
        int a[]=new int [2];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            int flag=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    a[0]=i+1;
                    a[1]=j+1;
                    flag=1;
                    break;
                }
            }
            if(flag==1) break;
        }
        return a;
    }
}