import java.awt.*;
import java.util.List;

public class Player {
private Field actualField;
private Field pseudoField;
    private String username;
    private List<Boolean> playerTakesHit;
    private int quantRightGuesses = 17;
    private Ship[] playerShips = new Ship[5];
    private boolean cpu;

    public Player(String username) {
        this.username = username;
    }

    public Player(String username, boolean cpu) {
        this.username = username;
        this.cpu = cpu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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



    public boolean setShips(int intialX, int initalY){
return false;
    }

}


