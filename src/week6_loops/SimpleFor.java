/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_loops;

import java.util.Scanner;

/**
 *
 * @author zackary.pilossoph
 */
public class SimpleFor {
    public static void main(String[] args){
        
        int userLoops = 0;
        String phrase;
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("How many loops shall I print");
        userLoops = userInputScanner.nextInt();
        System.out.println("enter phrase:");
        
        phrase = userInputScanner.next();
        
        
        for(int numLoops = 3; numLoops <= userLoops; numLoops = numLoops + 1){
            System.out.println(phrase+ " " + numLoops);
        } // close while
        
        
        System.out.println("...After the while loop");
    }
}
