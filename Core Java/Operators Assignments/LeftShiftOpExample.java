/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class LeftShiftOpExample {
    
    public static void main(String args[]){
      System.out.println(" << opeartor");
      
//      13 in binary is : 00000000000000000000000000001101 

//        shift left 2 positions and fill right bits with 0,s 
//
//        you obtain : 00000000000000000000000000110100 
//
//        this is 1*2^5+1*2^4+0*2^3+1*2^2+0*2^1+0*2^0 = 52 


// shift all the bits to the left by 2 
int y = 13<<2;      
System.out.println("13<<2 = "+y);
    }

    
}
