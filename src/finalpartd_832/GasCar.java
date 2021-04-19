package finalpartd_832;

/**
 * A simple class to simulate an Gas Car
 * Inspired by work of Dr. Ali Hassan
 *
 * @author Paul Bonenfant, April 2021
 *
 */
public class GasCar {

    private String make;
    private String model;
    private int currentRange;

    private static final int MAX_RANGE = 600;

    /**
     * Constructor to create a current Car.
     *
     * @param make The make of the car
     * @param model The model
     * @param range The current driving currentRange (how far you can go)
     */
    public GasCar(String make, String model, int range) {
        this.make = make;
        this.model = model;
        this.currentRange = range;
    }

    /**
     * This method adds gas for additional range. Note it will not add gas if the currentRange 
     * is already at the maximum
     *
     * @param gasAmount
     */
    public void putGas(int gasAmount) {
        if (currentRange < MAX_RANGE) {
            currentRange = (gasAmount * 10 + currentRange <= MAX_RANGE) ? (gasAmount * 10 + currentRange) : MAX_RANGE;
            System.out.printf("%s %d%n", "New range is now", currentRange);
        } else {
            System.out.println("Can't add more gas, already at maximum range!");
        }
    }

    /**
     * This method simulates driving the car.
     *
     * @param distance is how far to drive the car.
     * @return the updated currentRange after driving.
     */
    public int drive(int distance) {
        if (distance > currentRange) {
            System.out.println("Not enough range left to drive that far");
        } else { // let's go!
            System.out.println("We're going for a drive!");
            currentRange -= distance;
        }
        return currentRange;
    }

    /**
     * This method displays the car's information.
     */
    public void displayDetails() {
        System.out.println("Vehicle make: " + make);
        System.out.println("Vehicle model: " + model);
        System.out.printf("Current driving range: %d%n", currentRange);
    }
}
