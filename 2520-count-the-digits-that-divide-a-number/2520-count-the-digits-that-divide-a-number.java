class Solution {
    public int countDigits(int num) {
        int c=0;
        int org=num;
        while(num!=0){
            int r=num%10;
            if(org%r==0) c++;
            num/=10;
        }
        return c;
    }
}