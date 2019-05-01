/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_methods;

/**
 *Demo of methods with return type
 * @author zackary.pilossoph
 */
public class MethodsWithReturn {
    
    public static void main(String[] args) {
        int initialNumber = 100;
        // calls doubleAValue and store the returned
        // integer in returnedValue
        System.out.println("Value returned: " + doubleAValue(initialNumber));
    } // close main
    
    // a method takes in an integer, doubles it, and returns result
    public static int doubleAValue(int value){
        int result = value * 2;
        
        // holding value
        return result;
    }
}
