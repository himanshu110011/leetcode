class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int l=m.length;
        int n=m[0].length;
       ArrayList<Integer> li=new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=l-1;
        int right=n-1;
        
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                li.add(m[top][i]);
                
            }
            top++;
            for(int i=top;i<=bottom;i++){
                li.add(m[i][right]);
            
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                li.add(m[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                li.add(m[i][left]);
            }
            left++;}
        }
        
        return li;

    }
}