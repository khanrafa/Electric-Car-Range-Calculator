/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rafae
 */
public class Car {
   
    private String make;
    private static final int MAX_RANGE = 400;
    public static int getMAX_RANGE() {
        return MAX_RANGE;
    }
   
    
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCurrentRange(int currentRange) {
        this.currentRange = currentRange;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentRange() {
        return currentRange;
    }
    
     public void displayDetails() {
        System.out.println("Vehicle make: " + make);
        System.out.println("Vehicle model: " + model);
        System.out.printf("Current driving range: %d%n", currentRange);
    }
     
    private String model;
    private int currentRange;
}
