/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;

import java.util.Scanner;

/**
 * Illustrates the flow of values into methods and their returned type-specified
 * values to the calling method.
 *
 * @author zackary.pilossoph
 */
public class GeometricShapes {

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        
        
        System.out.println("Enter the side length of the cube to calculate its volume:");
        double userSideLength = keyboardScanner.nextDouble();

        // call calc volume of cube here
        double returnedVolume = calcVolumeOfCube(userSideLength);
        
        System.out.println("Volume of cube with side length: " + userSideLength + "is" + returnedVolume);
        System.out.println("-------------------------------------------------------");
    } // close main

    public static double calcVolumeOfCube(double sideLength) {
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    } // close method
}
