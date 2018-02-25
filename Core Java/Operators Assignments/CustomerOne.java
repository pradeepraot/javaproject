/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class CustomerOne {
    public static void main (String[] args) {
        PizzaFactory pizzaHouse = new PizzaFactory();
        int pricePrPizza = 15;
        double totPrice = pizzaHouse.calcPrice(4, pricePrPizza);      // (1)
       System.out.println("Value of pricePrPizza: " + pricePrPizza); // Unchanged.
    }
}

class PizzaFactory {
    public double calcPrice(int numberOfPizzas, double pizzaPrice) {  // (2)
        pizzaPrice = pizzaPrice/2.0; // Change price.
        System.out.println("priceofPizza in PizzaFacotory"+pizzaPrice);
        return numberOfPizzas * pizzaPrice;
    }
}
