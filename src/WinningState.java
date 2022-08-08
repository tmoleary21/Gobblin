public class WinningState {
    
    public boolean won;
    public Square[] winningSquares;
    public Player winningPlayer;

    public WinningState(boolean gameWon){
        this.won = gameWon;
    }
}
