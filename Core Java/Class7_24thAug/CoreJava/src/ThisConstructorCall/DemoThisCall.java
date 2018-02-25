/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ThisConstructorCall;

class Test {
    // Fields
    private int     noOfWatts;
    private boolean indicator;
    private String  location;

    // Constructors
  Test() {                              // (1) Explicit default constructor
        this(0, false);
        System.out.println("Returning from default constructor no. 1.");
    }
    Test(int watt, boolean ind) {         // (2) Non-default
        this(watt, ind, "X");
        System.out.println("Returning from non-default constructor no. 2.");
    }
    Test(int noOfWatts, boolean indicator, String location) {   // (3) Non-default
        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        this.location  = location;
        System.out.println("Returning from non-default constructor no. 3.");
    }
}

public class DemoThisCall {
    public static void main(String[] args) {                     // (4)
        System.out.println("Creating Test object no. 1.");
        Test Test1 = new Test();                              // (5)
        System.out.println("Creating Test object no. 2.");
        Test Test2 = new Test(250, true);                     // (6)
        System.out.println("Creating Test object no. 3.");
        Test Test3 = new Test(250, true, "attic");            // (7)
    }
}

