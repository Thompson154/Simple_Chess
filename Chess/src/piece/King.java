package piece;

import Main.GamePanel;
import piece.strategy.KingMoveStrategy;

public class King extends Piece {
    public King(int color, int col, int row) {
        super(color, col, row, new KingMoveStrategy());

        if(color == GamePanel.WHITE){
            image = getImage("/piece/w-king");
        } else {
            image = getImage("/piece/b-king");
        }
    }
}
