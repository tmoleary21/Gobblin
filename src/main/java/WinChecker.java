public class WinChecker {

    public boolean checkWin(Square square) {
        if (square.pieceStack.size() == 0) {
            return false;
        }
        Piece topPiece = square.pieceStack.peek();
        if (topPiece.color.equals("red")) {
            return true;
        }
        return false;
    }
}
