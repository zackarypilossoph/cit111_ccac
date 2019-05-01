/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10_methods;

import java.util.Random;

/**
 *
 * @author zackary.pilossoph
 */
public class KennywoodRideTracker {
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    final static int MINIMUM_THRILL_HEIGHT = 50;
    final static int MINIMUM_THEME_HEIGHT = 25;
    Random rand = new Random();
    int numSickRiders = rand.nextInt(riders)
    
    public static void main(String[] args){
        int riders = 5;
        int avgHeight = 30;
        rideBlackWidow(riders, avgHeight);

    }
    
    public static void rideBlackWidow (int riders, int avgHeight){
        if(avgHeight >= MINIMUM_THRILL_HEIGHT) {
            
            System.out.println("Riding Black Widow...");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else { 
            System.out.println(riders + "riders turned away sad: too short!");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        } // end if/else
            
        
    }
    
    public static void rideMerryGoRound (int riders, int avgHeight){
        int riders = 3;
        int avgHeight = 20;
        
    }
    
    public static void printRiderStats(){
        
    }
    private int riders;
}
