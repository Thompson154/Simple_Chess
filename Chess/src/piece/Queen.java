package piece;

import Main.GamePanel;
import piece.strategy.MoveStrategy;
import piece.strategy.QueenMoveStrategy;

public class Queen extends Piece {

    public Queen(int color, int col, int row) {
        super(color, col, row, new QueenMoveStrategy());

        if(color == GamePanel.WHITE){
            image = getImage("/piece/w-queen");
        } else {
            image = getImage("/piece/b-queen");
        }
    }
}
