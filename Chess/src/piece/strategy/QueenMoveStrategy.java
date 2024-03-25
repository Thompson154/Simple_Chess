package piece.strategy;

import piece.Piece;

public class QueenMoveStrategy implements MoveStrategy{
    @Override
    public boolean canMove(int targetCol, int targetRow, Piece piece) {

        if(piece.isWithinBoard(targetCol,targetRow) && piece.isSameSquare(targetCol,targetRow) == false) {
            if(targetCol == piece.preCol || targetRow == piece.preRow){
                if(piece.isValidSquare(targetCol,targetRow) && piece.pieceIsOnStraightLine(targetCol,targetRow) == false){
                    return true;
                }
            }

            if(Math.abs(targetCol - piece.preCol) == Math.abs(targetRow - piece.preRow)) {
                if(piece.isValidSquare(targetCol,targetRow) && piece.pieceIsOnDiagonaliLine(targetCol,targetRow) == false) {
                    return true;
                }
            }
        }
        return false;
    }
}
