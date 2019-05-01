/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods;

/**
 *
 * @author zackary.pilossoph
 */
public class BasicSwitch {
    public static void main(String[] args){
        final int SELECTOR = 23;
        
        if(SELECTOR == 1){
            System.out.println("First case selected");
        } else if(SELECTOR == 2){
            System.out.println("Second case selected");
        } else if(SELECTOR == 56){
            System.out.println("Third Case Selected");
        } else {
            System.out.println("Default case");
        }// close if/else chain
    }// close main
}// close class
