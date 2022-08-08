public class Board {

    Square[][] board;

    public Board(){
        board = new Square[4][4];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = new Square();
            }
        }
    }

    public boolean hasWon(int x, int y){
        String color = board[y][x].currentColor;
        if(checkRow(x, color)){
            return true;
        }
        if(checkColumn(y, color)){
            return true;
        }
        if(x == y){
            if(checkBackDiagonal(color)){
                return true;
            }
        }
        if(x + y == board.length-1){
            if(checkForwardDiagonal(color)){
                return true;
            }
        }
        return false;
    }

    private boolean checkRow(int x, String color){
        for(int i = 0; i < 4; i++){
            if(!color.equals(board[i][x].currentColor)){
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int y, String color){
        for(int i = 0; i < 4; i++){
            if(!color.equals(board[y][i].currentColor)){
                return false;
            }
        }
        return true;
    }

    //Back diagonal like a backslash \
    private boolean checkBackDiagonal(String color){
        for(int i = 0; i < 4; i++){
            if(!color.equals(board[i][i].currentColor)){
                return false;
            }
        }
        return true;
    }

    //Forward diagonal like a forward slash /
    private boolean checkForwardDiagonal(String color){
        for(int i = 0; i < 4; i++){
            if(!color.equals(board[i][4-i].currentColor)){
                return false;
            }
        }
        return true;
    }

    
}
