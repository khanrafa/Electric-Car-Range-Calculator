package model;

/**
 * A simple class to simulate an Electric Car
 * Inspired by work of Dr. Ali Hassan
 * @author Rafae, April 2021
 * 
 */
public class ElectricCar extends Car{

    private String make;
    private String model;
    private int currentRange;

    private static final int MAX_RANGE = 400;
    
    /**
     * Constructor to create a current car.
     *
     * @param make The make of the car
     * @param model The model
     * @param range The current driving currentRange (how far you can go)
     */
    public ElectricCar(String make, String model, int range) {
        super.setMake(make); 
        super.setModel(model);
        super.setCurrentRange(range);
    }

    /**
     * This method charges the battery for additional range. Note it will not charge if the currentRange 
     * is already at the maximum
     *
     * @param chargeTime
     */
    public void chargeBattery(int chargeTime) {
        if (currentRange < MAX_RANGE) {
            currentRange = (chargeTime * 7 + currentRange <= MAX_RANGE) ? (chargeTime * 7 + currentRange) : MAX_RANGE;
            System.out.printf("%s %d%n", "New range is now", currentRange);
        } else {
            System.out.println("Can't charge more, already at maximum range!");
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
            System.out.println("Not enough range to drive that far");
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
