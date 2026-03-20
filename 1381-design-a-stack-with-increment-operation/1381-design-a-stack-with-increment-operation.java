class CustomStack {
    int arr[];
     int top;
     int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        arr=new int[maxSize];
        top=-1;
    }
    
    public void push(int x) {
        if(top<maxSize-1){
            top++;
            arr[top]=x;
        }
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        else
        { int t= arr[top];
        top--;
        return t;}
        
    }
    
    public void increment(int k, int val) {
        int l=Math.min(k,maxSize);
        for(int i=0;i<l;i++){
            arr[i]=arr[i]+val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */