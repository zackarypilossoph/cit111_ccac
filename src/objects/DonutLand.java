/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Client class of our Donut class We make instances of Donut objects and
 * populate their member variables
 *
 * @author zackary.pilossoph
 */
public class DonutLand {

    public static void main(String[] args) {
        // make (i.e. "instantiate") a Donut
        // and store a reference to that Object
        // in variable called firstDonut
        // of type Donut
        Donut firstDonut = new Donut();
        firstDonut.flavor = "Chocolate frosted";
        firstDonut.name = "Tom";
        firstDonut.size = "Sphere";
        firstDonut.percRemaining = 100;
        firstDonut.eatDonut(10);
        printDonutStats(firstDonut);
        
        // firstDonut should have 90% left
        int remainingDonut = firstDonut.getPercentRemaining();
        System.out.println("Perc remaining of "
                + firstDonut.name + " is " + remainingDonut + "%");

        Donut secondDonut = new Donut();
        secondDonut.flavor = "Chocolate Sprinkles";
        secondDonut.name = "John";
        secondDonut.size = "Sphere";
        secondDonut.percRemaining = 100;
        secondDonut.eatDonut(33);
        printDonutStats(secondDonut);

        // instantiate your second Donut
        // populate its member variables
        // with proper values
    } // close main

    public static void printDonutStats(Donut d) {
        System.out.println("Perc remaining of "
                + d.name + " is " + d.getPercentRemaining() + "%");
    }
}
