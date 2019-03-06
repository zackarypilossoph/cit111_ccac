package week6_loops;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zackary.pilossoph
 */
public class Authentication {
    private final static String PASSWORD = "p@ssword";
    private final static String SECRET = "The meaning of life is (100 % 2) * 9 + 1";
    private final static int NUM_ATTEMPTS = 3;
    public static void main(String[] args){
        String enteredPasswd;
        
        // build scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        
        
        System.out.println("Enter your password followed by enter:");
        enteredPasswd = userInputScanner.next();
        
        if(enteredPasswd.equals(PASSWORD)){
            System.out.println("Authentication Successful! You have logged into nothing!");
        } else {
            System.out.println("Failure to authenticate! This attempt will not be recorded");
            
        }
        
    }
} // close class
