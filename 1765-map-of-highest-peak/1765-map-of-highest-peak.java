class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int r = isWater.length;
        int c = isWater[0].length;

        Queue<int[]> que = new ArrayDeque<>();
        int[][] height = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                height[i][j] = -1;
                if(isWater[i][j] == 1){
                que.offer(new int[]{i, j});
                height[i][j] = 0;
                } 
            }
        }
        
        int[][] dir = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        while(!que.isEmpty()){
            int size = que.size();
            
            for(int i=0; i<size; i++){
                int [] curr = que.poll();
                int cr = curr[0];
                int cc = curr[1];

                for(int d[] : dir){
                    int nr = cr + d[0];
                    int nc = cc + d[1];

                    if(nr >= 0 && nr < r
                    && nc >= 0 && nc < c
                    && height[nr][nc] == -1){
                    height[nr][nc] = height[cr][cc] + 1;
                    que.offer(new int[]{nr, nc});
                    }
                }
            }
        }
        return height;
    }
}