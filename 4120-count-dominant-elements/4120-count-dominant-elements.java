class Solution {
    public int countDominantElements(int[] arr) {
        int c = 0;
        if(arr.length == 1) return 1;
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                if(arr[i] >= arr[i+1]) c++;
            }else if(i == arr.length-1){
                if(arr[i] >= arr[i-1]) c++;
            }else {
               
                if((long) arr[i] * 2 >= (long) arr[i - 1] + arr[i + 1]) c++;
            }
            
        }
        return c;
    }
}