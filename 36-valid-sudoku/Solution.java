class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> reg = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char cval = board[i][j];
                if(cval != '.'){
                   if(!reg.add(board[i][j]+"found in"+i+"row") || !reg.add(board[i][j]+"found in"+j+"column")||
                     !reg.add(board[i][j]+"found in"+i/3+"-"+j/3+"cube")
                     ) {
                       return false;
                   }
                }
            }
        }
        return true;
    }
}
