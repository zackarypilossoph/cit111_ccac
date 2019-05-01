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
public class ModelCar {
    
    // define member variables
    // every instance of ModelCar
    // will have its own set of these variables
    String color;
    String bodyStyle;
    String manufacturerLocation;
    String safetyRating;
    String numPassengers;
    
    public int year;
    public String makeModel;
    
    private boolean isEngineRunning;
    private double speed;
    
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("....crank....crank...vroom!");
    }
    
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("....grbllll....shldunk");
    }
    
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }
    
    
    public double getCurrentSpeed(){
        return speed;
    }
    
    public double acclerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    }
    
    public double decelerate(int mphDecrease){
        speed = speed - mphDecrease;
        return speed;
    }
    
}
