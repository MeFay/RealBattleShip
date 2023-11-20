import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Field.showField();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect coordinate");
        String string = scanner.next();
        int horizontalNumber = Integer.parseInt(String.valueOf(string.charAt(0)));
        int verticalNumber = Integer.parseInt(String.valueOf(string.charAt(1)));
        System.out.println(horizontalNumber);
        System.out.println(verticalNumber);
       // boolean gameOver = false;
    }
}