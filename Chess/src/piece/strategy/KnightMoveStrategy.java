package piece.strategy;

import piece.Piece;

public class KnightMoveStrategy implements MoveStrategy{
    @Override
    public boolean canMove(int targetCol, int targetRow, Piece piece) {
        if(piece.isWithinBoard(targetCol,targetRow)) {
            if(Math.abs(targetCol - piece.preCol) * Math.abs(targetRow - piece.preRow) == 2){
                if(piece.isValidSquare(targetCol,targetRow)){
                    return true;
                }
            }
        }
        return false;
    }
}
