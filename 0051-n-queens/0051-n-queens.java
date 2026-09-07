class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char [][] board = new char[n][n];

        for(int i=0; i<n; i++){
            Arrays.fill(board[i], '.');
        }

        solve(ans, 0, n, board);

        return ans;
    }
    public void solve(List<List<String>> ans , int row, int n, char[][] board){
        if(row == n){
            List<String> temp = new ArrayList<>();

            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(row, col, n, board)){
                board[row][col] = 'Q';

                solve(ans, row+1, n, board);

                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(int row, int col, int n,  char[][] board){
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q') return false;
        }

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }

        for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }
}