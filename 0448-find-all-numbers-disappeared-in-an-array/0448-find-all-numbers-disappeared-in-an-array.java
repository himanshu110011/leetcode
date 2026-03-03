class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        for(int i:nums){
            arr[i-1]++;
        }
        ArrayList <Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                li.add(i+1);
            }
        }
        return li;
    }
}