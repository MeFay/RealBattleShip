import java.util.Scanner;

public class Field {
    private String[][] playField = new String[10][10];

    public Field( String[][] playField) {
        this.playField = playField;
    }


    public String[][] getPlayField() {
        return playField;
    }

    public void setPlayField(String[][] playField) {
        this.playField = playField;
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
