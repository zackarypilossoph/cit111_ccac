/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * "Blueprint" class that models
 * a real-world donut; no main method 
 * @author zackary.pilossoph
 */
public class Donut {
    //Member variables
    //Each instance of a Donut class
    //will recieve a 
    String name;
    int percRemaining;
    String size;
    String flavor;
    
    public void eatDonut(int percentEaten) {
        percRemaining = percRemaining - percentEaten;
    }
    
    /**
     * Accessor method for the retrieving the value
     * of the member variable: percRemaining;
     * @return the percent remaining
     */
    public int getPercentRemaining(){
        return percRemaining;
    }
}
