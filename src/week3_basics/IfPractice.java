/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_basics;

import java.util.Scanner;

/**
 *
 * @author zackary.pilossoph
 */
public class IfPractice {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        int i = inputReader.nextInt();
        int c = inputReader.nextInt();
        boolean check = i > c;
        if(check){
           System.out.println("True:" + i + " is greater than " + c );
        } else { 
           System.out.println("False:" + i + " is less than " + c );
        } // close if
    } // close main method
} // close class IfPractice
