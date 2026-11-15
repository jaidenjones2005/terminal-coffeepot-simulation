
public class CoffeePotController {

    private CoffeePotModel model;
    private CoffeePotView view;

    public CoffeePotController(CoffeePotModel model,
                               CoffeePotView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        boolean running = true;

        while (running) {
            view.showMenu();

            String input = view.getUserInput().trim();
            String[] parts = input.split("\\s+");

            String command = parts[0].toLowerCase();

            if (command.equals("exit")) {
                running = false;
                view.displayMessage("Goodbye!");
                continue;
            }

            if (command.equals("status")) {
                view.displayMessage("Current volume: "
                        + model.getCurrentVolume());
                continue;
            }

            if (command.equals("brew") ||
                    command.equals("pour")) {

                if (parts.length != 2) {
                    view.displayMessage(
                            "Please enter a valid amount.");
                    continue;
                }

                try {
                    int amount = Integer.parseInt(parts[1]);

                    if (command.equals("brew")) {
                        model.brew(amount);
                        view.displayMessage(
                                "Brewed " + amount + " units.");
                    } else {
                        model.pour(amount);
                        view.displayMessage(
                                "Poured " + amount + " units.");
                    }

                } catch (NumberFormatException e) {
                    view.displayMessage(
                            "Error: Please enter a number.");

                } catch (IllegalArgumentException |
                         IllegalStateException e) {
                    view.displayMessage(
                            "Error: " + e.getMessage());
                }

            } else {
                view.displayMessage(
                        "Unknown command. Please try again.");
            }
        }
    }
}
