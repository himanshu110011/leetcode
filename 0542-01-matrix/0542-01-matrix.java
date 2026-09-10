class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        Queue<int[]> que = new ArrayDeque<>();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(mat[i][j] == 0) que.offer(new int[]{i, j});

                else mat[i][j] = -1;
            }
        }
        int dir[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!que.isEmpty()){
            int[] curr = que.poll();

            int cr = curr[0];
            int cc = curr[1];

            for(int d[] : dir){
                int nr = cr + d[0];
                int nc = cc + d[1];

                if(nr >= 0 && nr < r &&
                    nc >= 0 && nc < c &&
                    mat[nr][nc] == -1){
                    mat[nr][nc] = mat[cr][cc] + 1;

                    que.offer(new int[]{nr, nc});
                }
            }
        }
        return mat;
    }
}