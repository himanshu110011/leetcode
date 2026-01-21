class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int z=0,o=0,t=0;
         for(int i=0;i<n;i++){
            if(arr[i]==0) z++;
            if(arr[i]==1) o++;
            if(arr[i]==2) t++;
         }
         int j=0;
         while(z!=0) {
            arr[j]=0;
            j++;
            z--;
         }
         while(o!=0){
            arr[j]=1;
            j++;
            o--;
         }
         while(t!=0){
            arr[j]=2;
            j++;
            t--;
         }
    }
}