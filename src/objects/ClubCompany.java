/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;

/**
 *
 * @author zackary.pilossoph
 */
public class ClubCompany {
    
    public static void main(String[] args) {
        Club firstClub = new Club();
        firstClub.ShaftStyle = "Stiff";
        firstClub.avgDistance = 130;
        firstClub.club = "Pitching Wedge";
        firstClub.model = "Taylormade";
        firstClub.remainingDistance = 15;
        firstClub.year = 2019;
        printClubStats(firstClub);
        
        Club secondClub = new Club();
        secondClub.ShaftStyle = "Stiff";
        secondClub.avgDistance = 140;
        secondClub.club = "9 Iron";
        secondClub.model = "Taylormade";
        secondClub.remainingDistance = 20;
        secondClub.year = 2019;
        printClubStats(secondClub);
        
        Club thirdClub = new Club();
        thirdClub.ShaftStyle = "Stiff";
        thirdClub.avgDistance = 155;
        thirdClub.club = "8 Iron";
        thirdClub.model = "Taylormade";
        thirdClub.remainingDistance = 25;
        thirdClub.year = 2019;
        printClubStats(thirdClub);
        
        Club fourthClub = new Club();
        fourthClub.ShaftStyle = "Stiff";
        fourthClub.avgDistance = 170;
        fourthClub.club = "7 Iron";
        fourthClub.model = "Taylormade";
        fourthClub.remainingDistance = 30;
        fourthClub.year = 2019;
        printClubStats(fourthClub);
        
        Club[] setOfClubs = new Club[4];
        
        setOfClubs[0]=firstClub;
        setOfClubs[1]=secondClub;
        setOfClubs[2]=thirdClub;
        setOfClubs[3]=fourthClub;
        
        System.out.println("Here are the clubs in your bag: ");
        
        int userChoice = 0;
        Scanner keyScan = new Scanner(System.in);
        userChoice = keyScan.nextInt();
        //make scanner object
        //ask the user which of the four clubs they want
        //use next.int method to get number they want
        Club chosenClub = setOfClubs[userChoice - 1];
        System.out.println("You have chosen this club: ");
        printClubStats(chosenClub);
    }
    
    public static void printClubStats(Club c){
        System.out.println("Club Selection: " + c.club);
        System.out.println("Distance Traveled: " + c.avgDistance);
    }
}
