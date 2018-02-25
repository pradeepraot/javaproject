/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */


class DefaultParamConstructor {
    
    public static void main(String args[])
    {
    // ...
        // Light moreLight  = new Light(100, true, "Greenhouse");
    Light1 oneLight = new Light1();     // (1) Call of implicit default constructor.
    System.out.println("noOfWatts  "+oneLight.noOfWatts);
    System.out.println("indicator "+oneLight.indicator);
    System.out.println("location "+oneLight.location);
    }
}

class Light1 {
    // Fields
    int     noOfWatts;       // wattage
    boolean indicator;       // on or off
    String  location;        // placement

    // No constructors
    //...
    
    // Explicit Default Constructor
    Light1() {                        // (1)
        this(100,true,"Greenhouse");
        noOfWatts = 50;
        indicator = true;
        location  = "X";
        
    }
    
     Light1(int noOfWatts, boolean indicator, String location) {          // (1)
         
        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        this.location  = location;
    }


}
