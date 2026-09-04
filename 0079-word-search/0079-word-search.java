class Solution {
    public boolean exist(char[][] board, String word) {
        return firstlettersearch(board,word);
        
    }
    static boolean firstlettersearch(char[][]board,String word){
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(wordsearch(board,word,i,j,0)){
                    return true;
                }
            }
        }
    return false;}
    static boolean wordsearch(char[][]board,String word,int r,int c,int index){
        if(index==word.length()){
            return true;
        }
        if(r<0||c<0||r>=board.length||c>=board[0].length){
            return false;}
        if(board[r][c]!=word.charAt(index)){
            return false;
            }
        
        char temp=word.charAt(index);
        board[r][c]='*';
        boolean found=wordsearch(board,word,r,c+1,index+1)||wordsearch(board,word,r,c-1,index+1)||wordsearch(board,word,r-1,c,index+1)||wordsearch(board,word,r+1,c,index+1);

        board[r][c]=temp;
    return found;}
}