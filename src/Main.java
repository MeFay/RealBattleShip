import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            MainMenu.showMenu();
            switch (scanner.next()){
                case "1":
                    scanner.reset();
                    System.out.println("Insert your username:");
                    Player player = new Player(scanner.next(), false);
                    Player cpu = new Player("cpu", true);
                    break;
                case "2":
                    scanner.reset();
                    System.out.println("Insert your username:");
                    Player player1 = new Player(scanner.next(), false);
                    scanner.reset();
                    System.out.println("Insert your username:");
                    Player player2 = new Player(scanner.next(), false);
                    break;
                default:
                    break;
            }

        }catch (Exception e){
            System.out.println("Fuckme");
        }
        Field.showField();

        System.out.println("\nSelect coordinate");
        String string = scanner.next();
        int horizontalNumber = Integer.parseInt(String.valueOf(string.charAt(0)));
        int verticalNumber = Integer.parseInt(String.valueOf(string.charAt(1)));


    }
}