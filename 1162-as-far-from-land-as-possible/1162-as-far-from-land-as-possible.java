class Solution {
    public int maxDistance(int[][] grid) {
        int  n = grid.length;

        Queue<int[]> que = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1) 
                que.offer(new int[]{i, j});
            }
        }
          if (que.isEmpty() || que.size() == n * n) {
            return -1;
        }

        int dir[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int dist = -1;
        while(!que.isEmpty()){
            int size = que.size();
            dist++;
            for (int i = 0; i < size; i++) {

            int[] curr = que.poll();

            int cr = curr[0];
            int cc = curr[1];

            for(int[] d : dir){
                int nr = cr + d[0];
                int nc = cc + d[1];

                if(nr >= 0 && nr < n 
                && nc >= 0 && nc < n
                && grid[nr][nc] == 0){
                   grid[nr][nc] = 1;

                    que.offer(new int[]{nr, nc});
                }
                }
            }
        }
        return dist;
    }
}