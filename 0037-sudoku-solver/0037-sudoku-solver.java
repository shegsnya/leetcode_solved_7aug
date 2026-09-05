class Solution {
    public void solveSudoku(char[][] board) {
        solver (board);
    }
    static boolean solver(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(isvalid(ch,i,j,board)){//chceking 3 rules
                            board[i][j]=ch;
                            if(solver(board)){
                                return true;
                            }
                           board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
    return true;}
    static boolean isvalid(char ch,int r ,int c,char[][]board){
        for(int i=0;i<9;i++){
            if(board[r][i]==ch){//checkin row
                return false;
            }
            if(board[i][c]==ch){
                return false;
            }
        }
         int boxRowStart = 3 * (r / 3);
        int boxColStart = 3 * (c / 3);
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRowStart + i][boxColStart + j] == ch) {
                    return false;
            }
            }
        }
     return true;  }
        
        
}
