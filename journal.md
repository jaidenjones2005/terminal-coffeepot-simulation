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