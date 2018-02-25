/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class RihgtSignShiftOpExample {
    
    public static void main(String args[])
    {
        System.out.println(" >> opeartor");
//        Explanation of 20>>2 = 5 
//        20 in binary is: 00000000000000000000000000010100 
//
//        shift all bits 2 positions to right 00000000000000000000000000000101 
//
//        This is 5 (2*2^2+0*2^1+1*2^0) in binary form 
// shift all the bits in 20 (in binary form) to the right by 2 
      System.out.println(20>>2);
      
      
//        Explanations of -1>>2 = -1 
//        -1 in binary is: 11111111111111111111111111111111 
//
//        shift all bits 2 positions to the right AND insert 1's to left you obtain 
//
//        11111111111111111111111111111111 
//
//        This is -1 in binary form 

      // shift all the bits in -1 (in binary form) to the right by 2 
      System.out.println("-1>>2 = "+(-1>>2));
      


        
    }
    
}
