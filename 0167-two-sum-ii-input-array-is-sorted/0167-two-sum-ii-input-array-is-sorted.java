class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l=0;
        int w=arr.length-1;
        while(l<w){
            int sum=arr[l]+arr[w];
            if(sum==target){
                return new int[]{l+1,w+1};
            }
            else if(sum>target) w--;
            else l++;
        }
        return new int[]{-1,-1};
    }
}