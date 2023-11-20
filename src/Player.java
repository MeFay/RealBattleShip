import java.awt.*;
import java.util.List;

public class Player {
    private String username;
    private List<Integer> selection;
    private List<Boolean> playerTakesHit;
    private int quantRightGuesses = 17;
    private Ship[] playerShips = new Ship[5];

    public Player(String username, List<Integer> selection, List<Boolean> playerTakesHit, int quantRightGuesses, Ship[] playerShips) {
        this.username = username;
        this.selection = selection;
        this.playerTakesHit = playerTakesHit;
        this.quantRightGuesses = quantRightGuesses;
        this.playerShips = playerShips;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Integer> getSelection() {
        return selection;
    }

    public void setSelection(List<Integer> selection) {
        this.selection = selection;
    }

    public List<Boolean> getPlayerTakesHit() {
        return playerTakesHit;
    }

    public void setPlayerTakesHit(List<Boolean> playerTakesHit) {
        this.playerTakesHit = playerTakesHit;
    }

    public int getQuantRightGuesses() {
        return quantRightGuesses;
    }

    public void setQuantRightGuesses(int quantRightGuesses) {
        this.quantRightGuesses = quantRightGuesses;
    }

    public Ship[] getPlayerShips() {
        return playerShips;
    }

    public void setPlayerShips(Ship[] playerShips) {
        this.playerShips = playerShips;
    }

    public Player(String username) {
        this.username = username;
    }
}


