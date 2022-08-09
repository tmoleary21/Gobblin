public class Main {
    
    public static void main(String[] args){
        testWinning();
    }
    
    public static void testWinning(){
        Player player = new Player();
        player.color = "red";

        //Back diagonal
        Board board = new Board();
        board.board[0][0].currentColor = "red";
        board.board[1][1].currentColor = "red";
        board.board[2][2].currentColor = "red";
        board.board[3][3].currentColor = "red";
        System.out.println(board.toString());
        WinningState winState = board.hasWon(player, 1, 1);
        System.out.println("Win? " + winState.won);
        
        //Forward diagonal
        board = new Board();
        board.board[0][3].currentColor = "red";
        board.board[1][2].currentColor = "red";
        board.board[2][1].currentColor = "red";
        board.board[3][0].currentColor = "red";
        System.out.println(board.toString());
        winState = board.hasWon(player, 2, 1);
        System.out.println("Win? " + winState.won);

        //Row
        board = new Board();
        board.board[2][0].currentColor = "red";
        board.board[2][1].currentColor = "red";
        board.board[2][2].currentColor = "red";
        board.board[2][3].currentColor = "red";
        System.out.println(board.toString());
        winState = board.hasWon(player, 2, 2);
        System.out.println("Win? " + winState.won);

        //Column
        board = new Board();
        board.board[0][1].currentColor = "red";
        board.board[1][1].currentColor = "red";
        board.board[2][1].currentColor = "red";
        board.board[3][1].currentColor = "red";
        System.out.println(board.toString());
        winState = board.hasWon(player, 1, 3);
        System.out.println("Win? " + winState.won);
    }
}