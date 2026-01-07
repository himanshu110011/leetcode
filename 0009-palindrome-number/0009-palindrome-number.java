class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int t=x;
        if(x<0){
            return  false;
        }
        else{
        while(x!=0){
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(sum==t){
            return true;
        }else{
            return false;
        }
    }
  }
}