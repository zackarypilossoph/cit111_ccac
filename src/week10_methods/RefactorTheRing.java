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
public class RefactorTheRing {
        static int numViewersSwallowedByRing = 0;

    // chop main up and call the new methods as needed
    public static void main(String[] args) {

        String viewer1 = "Katie";
        String viewer2 = "Josh";
        String viewer3 = "Rachel";
        String viewer4 = "Noah";
        String viewer5 = "Aiden";

        
        System.out.println(viewer2 + " watched the tape; 7 days to live");
        System.out.println(viewer3 + " watched the tape; 7 days to live");
        System.out.println(viewer4 + " watched the tape; 7 days to live");
        System.out.println(viewer5 + " watched the tape; 7 days to live");
        System.out.println("****************************************");
        
        watchFilm(viewer1);
        watchFilm(viewer2);
        
    } // close main

    // write and test your new methods here
    public static void watchFilm(String viewer) {

        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();
        System.out.println(viewer1 + " watched the tape; 7 days to live");

        System.out.print("Did Viewer named " + viewer + " make a copy? ");
        System.out.println(madeCopy);

        if (madeCopy) {
            System.out.println(viewer + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
    }

} // close class
