class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;

        if(grid[0][0] != 0) return false;

        return solve(grid, 0, 0, 1);
    }
    public boolean solve(int[][] grid, int r, int c, int num){
        int n = grid.length;

        if(num == n * n) return true;

        int moves[][] = {
            {1, 2},
            {1, -2},
            {-1, 2},
            {-1, -2},
            {2, 1},
            {2, -1},
            {-2, 1},
            {-2, -1}
        };

        for(int[] move : moves){
            int nr = r + move[0];
            int nc = c + move[1];

            if(nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == num){
                if(solve(grid, nr, nc, num + 1)) return true;
            }
        }
        return false;
    }
}