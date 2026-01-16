class Solution {
    public int search(int[] arr, int t) {
        int low=0;
    int high=arr.length-1;
    int flag=0;
    int index=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==t){
            flag=1;
            index=mid;
            break;
        }
        if(t<arr[mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    if(flag==1){
       return index;
    }
    else
       return -1;
    }
}