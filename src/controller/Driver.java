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
public class Driver {
      public int drive(Car car) {
        int i = car.getCurrentRange();
        int k = car.getMAX_RANGE();
        int j = 0;
        System.out.println("please enter distance."); 
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        if (l > i) {
            System.out.println("Not enough range left to drive that far");
        } else { // let's go!
            System.out.println("We're going for a drive!");
            i -= l;
        }
        return i;
    }
}
