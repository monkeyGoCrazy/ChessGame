/**
 * Created by mengleisun on 1/17/16.
 */
public class Game {
    Player white;
    Player black;
    Board board;
    public Game(Player white, Player black, Board board) {
        this.white = white;
        this.black = black;
        this.board = board;
    }
    public boolean choose(Player player, Location from) {
        return true;
    }
    public boolean move(Player white, Location from, Location to) {
        if (board.move(from,to)) {
            return board.kill(from,to);
        } else {
            return false;
        }
    }
}
