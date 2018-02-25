/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class BitwiseAND{
  public static void main(String args[]){

  int num1 = 42;
  int num2 = 15;
  


  System.out.println("AND Result =" +(num1&num2));
  
//  Num1 : 00101010   42    is represented in Binary format as -> 00101010
//  Num2 : 00001111   15    is represented in Binary format as -> 00001111
//======================
//  AND  : 00001010   10
  
    int num3= 0XF;
  
    System.out.println("AND Result Hex =" +(num1&num3));
    
//    Step 1: Converting Hex to Decimal
//
//    Num2  : F  (Hex)
//          : 15 (Decimal Equivalent)
//    Step 2: Converting Decimal to Binary
//
//    Num1  : 00101010   42
//    Num2  : 00001111   15
//    ======================
//    AND   : 00001010   10


  }
}
