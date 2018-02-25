/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
class BitwiseOR {
  public static void main(String args[]){

 //    Num1 : 00101010   42 is represented in Binary format as -> 00101010
//    Num2 : 00001111   15 is represented in Binary format as -> 00001111
//    ======================
//    OR   : 00101111   •According to above rule. we get 00101111 as final structure.
      
  int num1 = 42;
  int num2 = 15;

  System.out.println("OR Result =" +(num1 | num2));

//    Step 1: Converting Hex to Decimal
//
//    Num2  : F  (Hex)
//          : 15 (Decimal Equivalent)Step 2: Converting Decimal to Binary
//
//    Num1  : 00101010   42
//    Num2  : 00001111   15
//    ======================
//    OR    : 00101111   47
  
  
  int num3 = 0xF;

  System.out.println("OR Result =" +(num1 | num3));


  }
}
