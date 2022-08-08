public class WinningState {
    
    public boolean won;
    public Square[] winningSquares;
    public Player winningPlayer;

    public WinningState(Player winningPlayer){
        this.winningPlayer = winningPlayer;
    }

    public void setWinState(boolean won){
        this.won = won;
    }

    public void setSquaresState(Square[] winningSquares){
        this.winningSquares = winningSquares; 
    }
}
