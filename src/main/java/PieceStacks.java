import java.util.Stack;
import java.util.ArrayList;

public class PieceStacks {
    // stacks of peices OFF the board
    private String color = "";
    private ArrayList<Stack<Piece>> playerPieceStacks = new ArrayList<>();

    public PieceStacks(Player player){
        this.color = player.getColor();
        Stack<Piece> offBoardPieceStackOne = new Stack<>();
        Stack<Piece> offBoardPieceStackTwo = new Stack<>(); 
        Stack<Piece> offBoardPieceStackThree = new Stack<>();

        for (int i = 1; i < 5; i++) {
            offBoardPieceStackOne.push(new Piece(i, this.color));
            offBoardPieceStackTwo.push(new Piece(i, this.color));
            offBoardPieceStackThree.push(new Piece(i, this.color));
        }

        playerPieceStacks.add(offBoardPieceStackOne);
        playerPieceStacks.add(offBoardPieceStackTwo);
        playerPieceStacks.add(offBoardPieceStackThree);
    }

    public ArrayList<Stack<Piece>> getOffBoardPieces() {
        return playerPieceStacks;
    }

    public boolean arePieceStacksEmpty(){
        for (Stack<Piece> stack : playerPieceStacks) {
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
