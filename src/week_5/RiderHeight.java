/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_5;

import java.util.Scanner;

/**
 *
 * @author zackary.pilossoph
 */
public class RiderHeight {

    public static void main(String[] args) {
        final int MIN_HEIGHT_CM = 137;
        int riderHeight1;
        int riderHeight2;
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Welcome to the Phantom ride! Enter your height in CM");
        riderHeight1 = userInputScanner.nextInt();
        riderHeight2 = userInputScanner.nextInt();

        if (riderHeight1 > MIN_HEIGHT_CM && riderHeight2 > MIN_HEIGHT_CM) {
            System.out.println("Congrats! You are both tall enough for the ride");
        } else {
            System.out.println("Sorry, you are both too short for this ride");
        } // Close if/else chain
    } // Close main method
} // Close class
