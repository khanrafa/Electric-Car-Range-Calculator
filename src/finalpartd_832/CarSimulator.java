package finalpartd_832;

/**
 * A simple class to simulate Cars. 
 *
 * @author Ali Hassan
 * @Author Paul Bonenfant, April 2021
 */
public class CarSimulator {

    public static void main(String[] args) {
        CarSimulator cars = new CarSimulator();
        cars.run();
    }

    private void run() {
        
        // Create an Electric car with initial range of 150.
        ElectricCar car1 = new ElectricCar("Tesla", "Model 3", 150);
        car1.chargeBattery(24); // add some range
        car1.drive(300);
        car1.displayDetails();
        
        System.out.println("----");
        
        // Create an Gas car with initial range of 150.
        GasCar car2 = new GasCar("Ford", "Mustang", 150);
        car2.putGas(20); // add some range
        car2.drive(300);
        car2.displayDetails();
        

    }
}
