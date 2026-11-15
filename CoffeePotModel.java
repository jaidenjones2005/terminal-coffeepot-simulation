
public class CoffeePotModel {

    private int currentVolume;
    private int maxCapacity;

    public CoffeePotModel(int maxCapacity) {
        if (maxCapacity <= 0) {
            throw new IllegalArgumentException(
                    "Capacity must be greater than zero.");
        }

        this.maxCapacity = maxCapacity;
        this.currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void brew(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Cannot brew a negative amount.");
        }

        if (currentVolume + (long) amount > maxCapacity) {
            throw new IllegalStateException(
                    "Brewing would overflow the pot.");
        }

        currentVolume += amount;
    }

    public void pour(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Cannot pour a negative amount.");
        }

        if (amount > currentVolume) {
            throw new IllegalStateException(
                    "Not enough coffee in the pot.");
        }

        currentVolume -= amount;
    }
}
