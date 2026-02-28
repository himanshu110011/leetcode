class Solution {
    public int findNumbers(int[] nums) {
        int k=0;
        for(int i:nums){
            int c=0;
            while(i!=0){
                c++;
                i=i/10;
            }
            if(c%2==0) k++;
        }
        return k;
    }
}