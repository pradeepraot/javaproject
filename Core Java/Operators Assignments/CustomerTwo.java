/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */

public class CustomerTwo {
    public static void main (String[] args) {
        final Pizza2 favoritePizza = new Pizza2();          // (1)
       
        System.out.println("Meat on pizza before baking: " + favoritePizza.meat);
        bake(favoritePizza);                        // (2)
        System.out.println("Meat on pizza after baking: " + favoritePizza.meat);
    }
    public static void bake( Pizza2  pizzaToBeBaked) { // (3)
  //  System.out.println("Meat on pizza after baking: " + pizzaToBeBaked.meat);
        pizzaToBeBaked.meat = "chicken";  // Change the meat on the pizza.
       // pizzaToBeBaked = null;                      // (4)
    }
}

class Pizza2 {                                       // (5)
    String meat = "beef";
}

