/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;

/**
 *
 * @author zackary.pilossoph
 */
public class ArrayPractice {

    public static void main(String[] args) {
        String[] cars = new String[7];
        cars[0] = "Mazda 3";
        cars[1] = null;
        cars[2] = "Toyota Corolla";
        cars[3] = null;
        cars[4] = null;
        cars[5] = "Toyota Jeep";
        cars[6] = "Dodge Ram 1500";
        userInteraction(cars);

        int counter = 0;
        while (counter < cars.length) {
//            System.out.println("Value at bin index " + counter + " is " + cars[counter]);
            counter = counter + 1;
        } // end while

        // loop over array with for loop
        // for (initialize ; boolean check ; increment  )
        // for (runs once at start ; checked each time ; run after each loop)
        for (int i = 0; i < cars.length; i = i + 1) {
//            System.out.println("Value at bin index " + i + " is " + cars[i]);
        } // close for

    } // close main

    // a method that takes in a String[] and allows user to populate values
    public static void userInteraction(String[] paramarray) {
        // display the size of the array to the user
        int arraySize = paramarray.length;
        System.out.println("The size of your array is: " + arraySize);
        // ask user which bin they want to access
        System.out.println("Which array would you like to use: ");
        // make a Scanner object
        Scanner scan = new Scanner(System.in);
        // read in an int with scan.nextInt()
        int user = scan.nextInt();
        // modify user input to work with 0-indexed arrays (subtract 1)
        user = user - 1;
        // look up value in array
        System.out.println("Value at bin index " + user + " is " + paramarray[user]);
        // display to user
    }

}
