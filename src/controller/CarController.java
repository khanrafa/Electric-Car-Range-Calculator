/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Car;
import model.ElectricCar;
import model.GasCar;

/**
 *
 * @author Rafae
 */
public class CarController {
   
    public void run() {
        
        // Create an Electric car with initial range of 150.
        Car car1 = new ElectricCar("Tesla", "Model 3", 150);
        Mechanic mech = new Mechanic();
        mech.chargeBattery(car1); // add some range
        Driver driver = new Driver();
        driver.drive(car1);
        car1.displayDetails();
       
        System.out.println("----");
        
        // Create an Gas car with initial range of 150.
        GasCar car2 = new GasCar("Ford", "Mustang", 150);
        car2.putGas(20); // add some range
        car2.drive(300);
        car2.displayDetails();
        

    }
}
