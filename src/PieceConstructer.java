/**
 * Created by mengleisun on 1/17/16.
 */
import java.util.*;
public class PieceConstructer {
    public PieceConstructer() {

    }
    public List<Piece> generate(PieceColor color) {
        List<Piece> set = new ArrayList<Piece>();
        Piece king = new PieceKing(PieceType.King,color);
        return set;
    }
}
