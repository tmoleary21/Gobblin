import java.util.Stack;

public class Square {

    // member variables
    String currentColor = ""; // top color on square
    Stack<Piece> pieceStack = new Stack<>();  // pieceStack has access to pop(), peek(), push(), and size()

    public Square(){} //Default constructor because squares should start without pieces or color
    
    public Square(String currentColor, Stack<Piece> pieceStack){
        this.currentColor = currentColor;
        this.pieceStack = pieceStack;
    }
    
    public void addPiece(Piece piece) {
        pieceStack.push(piece);
        currentColor = piece.color;
    }

    public void removePiece() {
        pieceStack.pop();
        if (pieceStack.size() == 0) {
            currentColor = "";
        } else {
            currentColor = pieceStack.peek().color;
        }
    }

    public String checkColor() {
        return currentColor;
    }

    public boolean isFull(){
        if (pieceStack.size() == 4){
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (pieceStack.size() == 0) {
            currentColor = "";
            return true;
        }
        return false;
        
    }

    public boolean canPlace(Piece piece) {
        return piece.size > pieceStack.peek().size;
    }

}
