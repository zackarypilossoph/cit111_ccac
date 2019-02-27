/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package week3_basics;

import java.util.Scanner;

/**
 * Class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatability
 *
 * @author delores the javabot
 */
public class FriendsLogicOnly {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        int response = 1;
        // compatability score: this variable will be adjusted based on
        // the user's response to questions
        int compScore = 0;

        System.out.println("Do you enjoy hockey? (0 = no, 1 = yes)");
        response = keyScan.nextInt();

        // TODO: wire up actual user input when logic works
        // once we have the response saved, implement our decision logic
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("Great! How 'bout those Pens?");
        } else {
            compScore = compScore - 10;
            System.out.println("...you must like it if you tried!");
        } // end if/else blocks

        // lots more questions
        System.out.println("Do you have an Xbox?");
        response = keyScan.nextInt();
        if (response == 1) {
            compScore = compScore + 20;
        } else {
            compScore = compScore - 10;
            System.out.println("Do you have a job?");
            response = keyScan.nextInt();
            if (response == 1) {
                compScore = compScore + 10;
                System.out.println("Are you a doctor?");
                response = keyScan.nextInt();
                if (response == 1){
                    compScore = compScore + 50;
                }// close of Doctor if
            } // end of do you have a job block
        }// end of Xbox if/else blocks
        
        // final check of compatibility score
        if (compScore > 20) {
            // final check of compatibility scor
            System.out.println("Great, we might be friends!");
        } else {
            System.out.println("Yikes, according to my decision tree, "
                    + "we probably wouldn't make good friends.");
        } // end of if/else blocks
    } // close main
} //close class
