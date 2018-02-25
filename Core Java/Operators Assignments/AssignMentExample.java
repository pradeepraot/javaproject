/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class AssignMentExample  {
    
    
    
    public static void main(String args[])
    {
        int j, k;
        double d;
        j = 10;           // j gets the value 10.
        j = 5;            // j gets the value 5. Previous value is overwritten.
        k = j;            // k gets the value 5.
        //f=k;       //  i not declared
       // j=d;         // d (double is not compatible for j int
        
        
       int i;
       i = 5;            // i gets the value 5.
       i = i + 1;        // i gets the value 6. + has higher precedence than =.
       i = 20 - i * 2;   // i gets the value 8: (20 - (i * 2))
 
       Pizza pizza1 = new Pizza("Hot&Spicy");
       Pizza pizza2 = new Pizza("Sweet&Sour");
       
       System.out.println(pizza1);
       System.out.println(pizza2);

        pizza2 = pizza1;
        
       System.out.println(pizza1);
       System.out.println(pizza2);
       //Multiple assignments 
       k = j = 10;
       Pizza pizzaOne, pizzaTwo;
       pizzaOne = pizzaTwo = new Pizza("Supreme"); // Aliases.
       
       int[] a = {10, 20, 30, 40, 50}; // an array of int
      // int index = 4;
       //a[index] = index = 2;
       
       for(int count:a)
       {
       System.out.println(count);
       }

       

        
        
    }
    
}
