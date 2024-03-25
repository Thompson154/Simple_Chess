package piece.strategy;

import Main.GamePanel;
import piece.Piece;

public class PawnMoveStrategy implements MoveStrategy{
    @Override
    public boolean canMove(int targetCol, int targetRow, Piece piece) {
        if(piece.isWithinBoard(targetCol,targetRow) && piece.isSameSquare(targetCol,targetRow) == false) {
            int moveValue;
            if(piece.color == GamePanel.WHITE) {
                moveValue = -1;
            } else {
                moveValue = 1;
            }

            piece.hittingP = piece.getHittingP(targetCol,targetRow);

            if(targetCol == piece.preCol && targetRow == piece.preRow + moveValue && piece.hittingP == null) {
                return true;
            }

            if(targetCol == piece.preCol && targetRow == piece.preRow + moveValue*2 && piece.hittingP == null && piece.moved == false &&
                    piece.pieceIsOnStraightLine(targetCol,targetRow) == false) {
                return true;
            }

            if(Math.abs(targetCol - piece.preCol) == 1 && targetRow == piece.preRow + moveValue && piece.hittingP != null &&
                    piece.hittingP.color != piece.color) {
                return true;
            }
        }
        return false;
    }
}
