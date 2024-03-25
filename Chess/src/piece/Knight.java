package piece;

import Main.GamePanel;
import piece.strategy.KnightMoveStrategy;

public class Knight extends Piece{

    public Knight(int color, int col, int row) {
        super(color, col, row, new KnightMoveStrategy());

        if(color == GamePanel.WHITE){
            image = getImage("/piece/w-knight");
        } else {
            image = getImage("/piece/b-knight");
        }
    }
}
