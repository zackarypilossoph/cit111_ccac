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
public class ModelLand {
    
    public static void main(String[] args){
        
        Car deLorean = new ModelCar();
        deLorean.year = 1983;
        deLorea.makeModel = "DeLorean DMC-12";
        
        displayCarStats(deLorean);
        
        deLorean.startEngine();
        deLorean.accelerate(88);
        deLorean.decelerate(12);
        
        displayCarStats(deLorean);
        deLorean.stopEngine();
        displayCarStats(deLorean);
    
        }
    
    public static void displayCarStats(Car anyCarObject){
        System.out.println("********STATS*********");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        System.our.println("*******************");
       
    }
}
