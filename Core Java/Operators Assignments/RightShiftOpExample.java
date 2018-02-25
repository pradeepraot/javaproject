/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class RightShiftOpExample {
    
    public static void main(String args[])
    {
        // shift all the bits in -1 (in binary form) to the right by 2 
// without sign extension using >>>

int y = -1>>>2;      
System.out.println("-1>>>2 = "+y);

// -1>>>2 in binary form
System.out.println("-1>>>2 in binary form is "+Integer.toBinaryString(y));

    }
    
}
