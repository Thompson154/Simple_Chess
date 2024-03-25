package piece.strategy;

import piece.Piece;

public interface MoveStrategy {
    boolean canMove(int targetCol, int targetRow, Piece piece);
}
