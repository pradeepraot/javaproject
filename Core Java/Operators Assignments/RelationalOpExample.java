/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class RelationalOpExample {
    
    public static void main(String args[])
    {
        
        double  hours = 45.5;
boolean overtime = hours >= 35.0;    // true.
boolean order = 'A' < 'a';           // true. Binary numeric promotion applied.

        
        System.out.println(overtime);
        System.out.println(order);
        
        int a = 1, b = 7, c = 10;
//boolean valid1 = a <= b <= c;             // (1) Illegal.
boolean valid2 = a <= b && b <= c;        // (2) OK
    }
    
}
