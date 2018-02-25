/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class StringExp {
    
    public static void main(String args[])
    {
        String theName = " Uranium";
        theName = " Pure" + theName;                  // " Pure Uranium"
        String trademark1 = 100 + "%" + theName;      // "100% Pure Uranium"      (1)
        
        System.out.println(trademark1);
        
        String trademark2 = 100 + '%' + theName;      // "137 Pure Uranium"
        
          System.out.println(trademark2);
          
          System.out.println("We put two and two together and get " + 2 + 2);
          System.out.println(2 + 2+"We put two and two together and get " );
          System.out.println("ddddd"+true );
          System.out.println("ddddd"+false );
          System.out.println("ddddd"+null);



    }
    
}
