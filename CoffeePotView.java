
import java.util.Scanner;

public class CoffeePotView {

    private Scanner scanner;

    public CoffeePotView() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\n=== Coffee Pot Menu ===");
        System.out.println("brew <amount> - Brew coffee");
        System.out.println("pour <amount> - Pour coffee");
        System.out.println("status - Check coffee volume");
        System.out.println("exit - Exit program");
        System.out.print("Enter command: ");
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }
}
