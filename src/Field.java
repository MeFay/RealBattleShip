import java.util.Scanner;

public class Field {
    private Scanner usernameScanner = new Scanner(System.in);
    private String[][] playField = new String[10][10];
    private Player player1 = new Player(usernameScanner.next());
    private Player player2 = new Player(usernameScanner.next());

    public Field(Scanner usernameScanner, String[][] playField, Player player1, Player player2) {
        this.usernameScanner = usernameScanner;
        this.playField = playField;
        this.player1 = player1;
        this.player2 = player2;
    }

    public Scanner getUsernameScanner() {
        return usernameScanner;
    }

    public void setUsernameScanner(Scanner usernameScanner) {
        this.usernameScanner = usernameScanner;
    }

    public String[][] getPlayField() {
        return playField;
    }

    public void setPlayField(String[][] playField) {
        this.playField = playField;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    static public void showField() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                System.out.print(i);
                System.out.print(j);
                System.out.print("  ");
                System.out.print("|  ");
            }
        }
    }
}
