class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] row=new HashSet[n];
        HashSet<Character>[] col=new HashSet[n];//array making
        HashSet<Character>[] box=new HashSet[n];
        for(int r=0;r<n;r++){
            row[r]=new HashSet<Character>();//defining hashset
            col[r]=new HashSet<Character>();
            box[r]=new HashSet<Character>();
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                if(row[r].contains(board[r][c])){
                    return false;
                }
                else{
                    row[r].add(board[r][c]);
                }
                if(col[c].contains(board[r][c])){
                    return false;
                }
                else{
                    col[c].add(board[r][c]);
                }
                int boxno=(r/3)*3+(c/3);
                if(box[boxno].contains(board[r][c])){
                    return false;
                }
                else{
                    box[boxno].add(board[r][c]);
                }
                
            }
        }
   return true; }
}