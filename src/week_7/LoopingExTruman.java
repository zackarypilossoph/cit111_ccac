/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_7;

import java.util.Scanner;

/**
 *
 * @author zackary.pilossoph
 */
public class LoopingExTruman {
    
    public static void main(String[] args) {
        String lady = "Lady";
        String flowers = "Bicycle";
        String beetle = "Beetle";
        
        Scanner scanner = new Scanner(System.in);
        int ctl = scanner.nextInt();
        int stepSize = scanner.nextInt();
        int max = scanner.nextInt();
        
        System.out.println(lady);
        do {
            if(ctl % 2 > 0){
                System.out.println(flowers.toUpperCase());
            }
            ctl = ctl + stepSize;
        } while (ctl <= max);
        System.out.println(beetle);
    }// close method
}// close class
