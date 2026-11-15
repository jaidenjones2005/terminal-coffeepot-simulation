# Terminal CoffeePot Simulation Journal

## Phase 0: The Blueprint

### My Plan

For this project, I plan to build a terminal-based coffee pot simulation using the Model-View-Controller (MVC) pattern.

**Model:** The CoffeePotModel class will track the current amount of coffee and the maximum capacity of the pot. It will handle brewing and pouring while making sure the pot cannot overflow or pour more coffee than it contains.

**View:** The CoffeePotView class will display the menu, collect user input, and show messages about the coffee pot.

**Controller:** The CoffeePotController class will process commands entered by the user and communicate with the Model and View. For example, if the user types "pour 8", the Controller will recognize the command, convert 8 into an integer, and request that the Model pour that amount.

### Available Commands

- brew [amount] - Adds coffee to the pot.
- pour [amount] - Removes coffee from the pot.
- status - Displays the current amount of coffee.
- exit - Closes the program.

### Command Validation

The Controller will check that the user enters a valid command and a valid number. The Model will make sure the requested action does not exceed the pot's capacity or remove more coffee than is available.

### Reflection

The most confusing part right now is figuring out how the Controller will communicate with the Model and View without mixing their responsibilities. I'm also unsure about the best way to handle invalid commands. My plan is to keep each class focused on its own job so the program is easier to understand and maintain.

## Phase 1: The Pot (The Model)

### What I Accomplished

In this phase, I created the CoffeePotModel class to manage the coffee pot's volume and capacity. I added methods for brewing and pouring coffee and made sure the program prevents overflowing or pouring more coffee than is available.

I also tested the Model in Main.java to verify that the volume changes correctly and that invalid actions throw exceptions.

### Reflection

I learned that the Model is responsible for managing the application's data and protecting its internal state. It is important for the Model to validate its own data because it prevents invalid operations, even if another part of the program sends incorrect information. This makes the application more reliable and easier to maintain.

## Phase 2: The Terminal Interface (The View)

### What I Accomplished

In this phase, I created the CoffeePotView class to handle the terminal interface. I added methods to display the menu, read user input using Scanner, and display messages.

I also updated Main.java to test the View by allowing users to enter commands and see them printed back in the terminal.

### Reflection

Keeping the input and output logic in a separate View class makes the program easier to organize and maintain. The View only handles what the user sees and types, while the Model handles the coffee pot's data. This separation will make it easier to add the Controller without mixing responsibilities between classes.

## Phase 3: The Command Center (The Controller)

### What I Accomplished

In this phase, I created the CoffeePotController class and connected it to the CoffeePotModel and CoffeePotView classes. I added logic to process commands such as brew, pour, status, and exit. I also added error handling to prevent invalid commands from crashing the program.

### Reflection: Life of a Command

When the user types a command and presses Enter, the View reads the input using Scanner. The Controller receives the input, separates the command from the amount, and determines what action to perform.

The Controller then calls the appropriate method in the Model. The Model checks whether the action is valid and updates the coffee volume. Finally, the Controller sends a message to the View to display the result.

This helped me understand how the MVC pattern separates responsibilities and keeps the code organized.

## Phase 4: The Full Cycle (Integration)

### What I Accomplished

In this phase, I improved the CoffeePotController to make the program more user-friendly. I added a method that automatically displays the current coffee volume after brewing or pouring. I also improved error handling so invalid commands and non-numeric inputs do not crash the program.

I tested the full simulation by checking the status, brewing coffee, attempting to pour too much, pouring a valid amount, and exiting the program.

### Reflection

The hardest part of connecting the three components was making sure each class handled its own responsibility. The Model manages the coffee volume, the View handles user input and output, and the Controller connects everything together.

Separating these responsibilities made error handling easier because the Controller can catch errors from the Model and send helpful messages through the View without mixing the logic between classes.

