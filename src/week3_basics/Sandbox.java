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
public class Sandbox {
    public static void main(String[] args){
        int age;
        Scanner keyboardScanner = new Scanner(System.in);
        // ask the user for an integer, store = it in variable age
        System.out.println("Enter your age: ")
        age = keyboardScanner.nextint();
        System.out.println("you entered age of: " + age );
    }
}
