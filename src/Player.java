import java.awt.*;
import java.util.List;

public class Player {
    String username;
    List<Integer> selection;
    List<Boolean> playerTakesHit;


    int quantRightGuesses = 17;

    Ship[] playerShips = new Ship[5];

    public Player(String username) {
        this.username = username;
    }
}


