class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    for(char ch='1'; ch<='9'; ch++){
                        if(isSafe(i, j, ch, board)){
                            board[i][j] = ch;
                            if(solve(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(int row, int col, char ch, char[][] board){
        for(int i=0; i<9; i++){
            if(board[row][i] == ch) return false;
            if(board[i][col] == ch) return false;
        }

        int stRow = (row / 3) * 3;
        int stCol = (col / 3) * 3;

        for(int i=stRow; i<stRow + 3; i++){
            for(int j=stCol; j<stCol + 3; j++){
               if(board[i][j] == ch) return false;
            }
        }
        return true;
    }
}