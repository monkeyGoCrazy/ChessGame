/**
 * Created by mengleisun on 1/17/16.
 */
import java.util.*;
public class Board {
    List<Piece> whiteSet;
    List<Piece> blackSet;
    Piece[][] board;
    PieceConstructer factory;
    Validation valid = new Validation("chess", "1");
    public Board() {
        factory = new PieceConstructer();
        whiteSet = factory.generate(PieceColor.Black);
        blackSet = factory.generate(PieceColor.White);
        board = new Piece[8][8];
        setBoard(board,whiteSet,blackSet);
    }
    public void setBoard(Piece[][] board, List<Piece> whiteSet, List<Piece> blackSet) {
        for (Piece piece: whiteSet) {

        }
        for (Piece piece: blackSet) {

        }
    }
    public boolean kill(Location from, Location to) {
        return true;
    }
    public boolean gameOver(){
        return true;
    }
    public boolean move(Location from,  Location to) {
        //check valid
        if (board[from.y][from.x] == null) {
            return false;
        }
        Piece piece = board[from.y][from.x];
        if (valid.isValidate(board,piece,to)) {
            Piece temp = board[0][0];
            board[0][0] = null;
            board[to.y][to.x] = temp;
            return true;
        } else {
            return false;
        }
    }

}
