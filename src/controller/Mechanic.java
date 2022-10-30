/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Car;

/**
 *
 * @author Rafae
 */
public class Mechanic {
    
    public void chargeBattery(Car car) {
        int i = car.getCurrentRange();
        int k = car.getMAX_RANGE();
        int j = 0;
        if (i < k) {
        System.out.println("please enter charge time"); 
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int o = 0;
            o = (l * 7 + car.getCurrentRange() <= Car.getMAX_RANGE()) ? (l * 7 + car.getCurrentRange()) : car.getMAX_RANGE();
            car.setCurrentRange(o);
            System.out.printf("%s %d%n", "New range is now", o);
        } else {
            System.out.println("Can't charge more, already at maximum range!");
        }
    }
}
