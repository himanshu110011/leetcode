class Solution {
    public boolean isSameAfterReversals(int n) {
        if(n==0){
            return true;
        }
        else{
        int r=n%10;
        if(r==0) return false;
        else return true;
        }
    }
}