class Solution {
    public int fib(int n) {
     int x=0,y=1;
     if(n==0) return 0;
     if(n==1) return 1;
     int s=0;
     for(int i=2;i<=n;i++){
        s=x+y;
        x=y;
        y=s;
     }
     return s;
    }
}