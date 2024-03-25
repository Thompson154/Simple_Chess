package piece.strategy;


import piece.Piece;

public class KingMoveStrategy implements MoveStrategy{

    @Override
    public boolean canMove(int targetCol, int targetRow, Piece piece) {
        if(piece.isWithinBoard(targetCol,targetRow)){

            if(Math.abs(targetCol - piece.preCol) + Math.abs(targetRow - piece.preRow) == 1 ||
                    Math.abs(targetCol - piece.preCol) * Math.abs(targetRow - piece.preRow) == 1) {

                if(piece.isValidSquare(targetCol,targetRow)) {
                    return true;
                }
            }
        }
        return false;
    }
}
