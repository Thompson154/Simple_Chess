package piece;

import Main.GamePanel;
import piece.strategy.MoveStrategy;
import piece.strategy.PawnMoveStrategy;

public class Pawn extends Piece {
    public Pawn(int color, int col, int row) {
        super(color, col, row, new PawnMoveStrategy());

        if(color == GamePanel.WHITE) {
            image = getImage("/piece/w-pawn");
        } else {
            image = getImage("/piece/b-pawn");
        }
    }
}
