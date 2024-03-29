
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

    public String toString(){
        String str = "";
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                str += String.format("%10s", board[i][j].currentColor);
                if(j != board[i].length-1) str += ", ";
            }
            if(i != board.length-1) str += "\n";
        }
        return str;
    }
    
    
    public WinningState hasWon(Player player, int x, int y){
        WinningState winState;
        winState = checkRow(y, player);
        if(winState.won){
            return winState;
        }
        winState = checkColumn(x, player);
        if(winState.won){
            return winState;
        }
        if(x == y){
            winState = checkBackDiagonal(player);
            if(winState.won){
                return winState;
            }
        }
        if(x + y == board.length-1){
            winState = checkForwardDiagonal(player);
            if(winState.won){
                return winState;
            }
        }
        return winState;
    }
    
    private WinningState checkRow(int row, Player player){
        WinningState winState = new WinningState(player);
        Square[] squares = new Square[4];
        for(int i = 0; i < 4; i++){
            if(!player.getColor().equals(board[row][i].currentColor)){
                winState.setWinState(false);
                squares[i] = board[row][i];
                return winState;
            }
        }
        winState.setWinState(true);
        winState.setSquaresState(squares);
        return winState;
    }
    
    private WinningState checkColumn(int col, Player player){
        WinningState winState = new WinningState(player);
        Square[] squares = new Square[4];
        for(int i = 0; i < 4; i++){
            if(!player.getColor().equals(board[i][col].currentColor)){
                winState.setWinState(false);
                squares[i] = board[i][col];
                return winState;
            }
        }
        winState.setWinState(true);
        winState.setSquaresState(squares);
        return winState;
    }

    //Back diagonal like a backslash \
    private WinningState checkBackDiagonal(Player player){
        WinningState winState = new WinningState(player);
        Square[] squares = new Square[4];
        for(int i = 0; i < 4; i++){
            if(!player.getColor().equals(board[i][i].currentColor)){
                winState.setWinState(false);
                squares[i] = board[i][i];
                return winState;
            }
        }
        winState.setWinState(true);
        winState.setSquaresState(squares);
        return winState;
    }
    
    //Forward diagonal like a forward slash /
    private WinningState checkForwardDiagonal(Player player){
        WinningState winState = new WinningState(player);
        Square[] squares = new Square[4];
        for(int i = 0; i < 4; i++){
            if(!player.getColor().equals(board[i][3-i].currentColor)){
                winState.setWinState(false);
                squares[i] = board[i][3-i];
                return winState;
            }
        }
        winState.setWinState(true);
        winState.setSquaresState(squares);
        return winState;
    }
    
    
    
}
