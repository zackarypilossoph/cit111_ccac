/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author zackary.pilossoph
 */
public class Club {
    
    String model;
    String club;
    String ShaftStyle;
    
    // Distance in yards
    // Distance in feet
    int remainingDistance;
    int year;
    int avgDistance;
    
    public void calculateDistanceToHole(String avgDistance) {
        avgDistance = avgDistance - remainingDistance;
    }
    
    public int calculateDistanceToHole() {
        return avgDistance;
    }
}
