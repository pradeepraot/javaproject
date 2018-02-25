/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OtherModiferMem;

class Light {
    // Fields
    int     noOfWatts;      // wattage
    boolean indicator;      // on or off
    String  location;       // placement

    // Static variable
    static int counter;     // No. of Light objects created.         (1)

    // Explicit Default Constructor
    Light() {
        noOfWatts = 50;
        indicator = true;
        location  = "X";
        ++counter;          // Increment counter.
    }

    // Static method
    public static void writeCount() {
         System.out.println("Number of lights: " + counter);      // (2)
         // Compile error. Field noOfWatts is not accessible:
         // System.out.println("Number of Watts: " + noOfWatts);  // (3)
    }
}
public class Warehouse {
    public static void main(String[] args) {                      // (4)

        Light.writeCount();                       // Invoked using class name
        Light aLight = new Light();               // Create an object
        System.out.println(
            "Value of counter: " + Light.counter  // Accessed via class name
        );
        Light bLight = new Light();               // Create another object
        bLight.writeCount();                      // Invoked using reference
        Light cLight = new Light();               // Create another object
        System.out.println(
            "Value of counter: " + cLight.counter // Accessed via reference
        );
    }
}

