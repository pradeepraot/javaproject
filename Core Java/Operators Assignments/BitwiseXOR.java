/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
class BitwiseXOR {
  public static void main(String args[]){
      
//        Num1 : 00101010   42 is represented in Binary format as -> 00101010
//        Num2 : 00001111   15 is represented in Binary format as -> 00001111
//        ======================
//        XOR  : 00100101   37 •According to above rule. we get 00100101 as final structure.

  int num1 = 42;
  int num2 = 15;

  System.out.println("XOR Result =" +(num1 ^ num2));
  
  int num3 = 017;

  System.out.println("XOR Result Oct =" +(num1 ^ num3));
  
  int num4 = 0xf;

  System.out.println("XOR Result Oct =" +(num1 ^ num4));


  }
}