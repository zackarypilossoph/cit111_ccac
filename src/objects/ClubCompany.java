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
public class ClubCompany {
    
    public static void main(String[] args) {
        Club firstClub = new Club();
        firstClub.ShaftStyle = "Stiff";
        firstClub.avgDistance = 130;
        firstClub.club = "Pitching Wedge";
        firstClub.model = "Taylormade";
        firstClub.remainingDistance = 20;
        firstClub.year = 2019;
        
        
        Club[] setOfClubs = new Club[8];
        
        setOfClubs[0]=firstClub;
    }
}
