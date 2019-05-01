/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zackary.pilossoph
 */
public class SimpleMethod {
    public static void main(String[] args) {
        int selector;
        System.out.println("*****switches and methods*****");
        System.out.println("Options: ");
        System.out.println("1 - Print a special");
        System.out.println("2 - Generate a random big number");
        System.out.println("3 - Do nothing");
        System.out.println("Enter an int and press enter: ");
        Scanner keyboardScanner = new Scanner(System.in);
        
        selector = keyboardScanner.nextInt();
        
        switch(selector){
            case 1:
                printStatement();
                break;
            case 2:
                generateBigNumber();
                break;
            case 3:
                break;
            default:
                System.out.println("Default Case");
        } // close switch

        
    } // close method main
    
    // illustration method that takes no parameters and returns nothing to the caller
    public static void printStatement(){
        System.out.println("*******INSIDE printStatement********");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("**********************************************");
    } // close method printSpecialStatement
    public static void generateBigNumber(){
        System.out.println("***********INSIDE printStatement***************");
        Random r = new Random();
        BigInteger bigInt = new BigInteger(150, r);
        System.out.println(bigInt);
        System.out.println("**********************************************");
    } // close method generateBigNumber
    
} // close class
