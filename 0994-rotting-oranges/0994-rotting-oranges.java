class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> que = new ArrayDeque<>();
        int fresh = 0;

        for(int i=0; i<row; i++){
            for(int j=0 ; j<col; j++){
                if(grid[i][j] == 2) que.offer(new int[]{i, j});

                if(grid[i][j] == 1) fresh++;
            }
        }
        int minutes = 0;

        int[][] directions = {
            {-1,0},
            {0,1},
            {0,-1},
            {1,0}
        };

        while(!que.isEmpty() && fresh > 0){
            int size = que.size();
            for(int i=0; i<size; i++){
                int[] curr = que.poll();
                int cr = curr[0];
                int cc = curr[1];

                for(int[] dir : directions){
                    int nr = cr + dir[0];
                    int nc = cc + dir[1];

                    if(nr >= 0 && nr < row &&
                        nc >= 0 && nc < col
                        && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;

                        que.offer(new int[]{nr, nc});
                        }
                }
            }
            minutes++;
        }
        if(fresh > 0) return -1;
        return minutes;
    }
}