
public class Main {
    public static void main(String[] args) {

        CoffeePotView view = new CoffeePotView();

        boolean running = true;

        while (running) {
            view.showMenu();

            String input = view.getUserInput();

            view.displayMessage("You entered: " + input);

            if (input.equalsIgnoreCase("exit")) {
                running = false;
                view.displayMessage("Goodbye!");
            }
        }
    }
}
