/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class EqualityExample {
    
    public static void main(String args[])
    {
        int year = 2002;
    boolean isEven  = year % 2 == 0;     // true.
    boolean compare = '1' == 1;          // false. Binary numeric promotion applied.
    boolean test    = compare == false;  // true.
    
   int a, b, c;
a = b = c = 5;
//boolean valid1 = a == b == c;               // (1) Illegal.
boolean valid2 = a == b && b == c;          // (2) Legal.
boolean valid3 = a == b == true;            // (3) Legal.

Pizza pizza_A = new Pizza("Sweet&Sour");      // new object
Pizza pizza_B = new Pizza("Sweet&Sour");      // new object
Pizza pizza_C = new Pizza("Hot&Spicy");       // new object

String banner = "Come and get it!";           // new object
// boolean test  = banner  == pizza_A;           // (1) Compile-time error.
boolean test1 = pizza_A == pizza_B;           // false
boolean test2 = pizza_A == pizza_C;           // false

pizza_A = pizza_B;                        // Denote the same object, are aliases.
boolean test3 = pizza_A == pizza_B;       // true


// Equality for String objects means same character sequence.
String movie1 = new String("The Revenge of the Exception Handler");
String movie2 = new String("High Noon at the Java Corral");
String movie3 = new String("The Revenge of the Exception Handler");
boolean test0 = movie1.equals(movie2);             // false
 test1 = movie1.equals(movie3);             // true

// Equality for Boolean objects means same primitive value
Boolean flag1 = new Boolean(true);
Boolean flag2 = new Boolean(true);
 test2 = flag1.equals(flag2);               // true

// Pizza class does not override the equals() method,
// can use either equals (inherited from Object) or ==.
Pizza pizza1 = new Pizza("VeggiesDelight");
Pizza pizza2 = new Pizza("VeggiesDelight");
Pizza pizza3 = new Pizza("CheeseDelight");
 test3 = pizza1.equals(pizza2);             // false
boolean test4 = pizza1.equals(pizza3);             // false
boolean test5 = pizza1 == pizza2;                  // false
pizza1 = pizza2;                                   // Aliases
boolean test7 = pizza1.equals(pizza2);             // true
boolean test6 = pizza1 == pizza2;                  // true




    }
    
}
