package piece;

import Main.GamePanel;
import piece.strategy.BishopMoveStrategy;
import piece.strategy.MoveStrategy;

public class Bishop extends Piece {
    public Bishop(int color, int col, int row) {
        super(color, col, row, new BishopMoveStrategy());

        if(color == GamePanel.WHITE){
            image = getImage("/piece/w-bishop");
        } else {
            image = getImage("/piece/b-bishop");
        }
    }
}
