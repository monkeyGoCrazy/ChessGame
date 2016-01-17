/**
 * Created by mengleisun on 1/17/16.
 */
public abstract class Piece {
    public PieceType type;
    public PieceColor color;
    public Piece(PieceType type, PieceColor color) {
        this.type = type;
        this.color = color;
    }
}
