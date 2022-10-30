package view;

import controller.CarController;
import model.GasCar;
import model.ElectricCar;

/**
 * A simple class to simulate Cars. 
 *
 * @author Rafae
 * @Author Paul Bonenfant, April 2021
 */
public class CarSimulator {

    public static void main(String[] args) {
        CarController cars = new CarController();
        cars.run();
    }

    
}
