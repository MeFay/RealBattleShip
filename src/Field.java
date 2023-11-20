import java.util.Scanner;

public class Field {
    Scanner usernameScanner = new Scanner(System.in);
    String[][] playField = new String[10][10];

    Player player1 = new Player(usernameScanner.next());
    Player player2 = new Player(usernameScanner.next());

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
