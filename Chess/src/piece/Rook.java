package piece;

import Main.GamePanel;
import piece.strategy.RookMoveStrategy;

public class Rook extends Piece {

    public Rook(int color, int col, int row) {
        super(color, col, row, new RookMoveStrategy());

        if(color == GamePanel.WHITE) {
            image = getImage("/piece/w-rook");
        } else {
            image = getImage("/piece/b-rook");
        }
    }
}
