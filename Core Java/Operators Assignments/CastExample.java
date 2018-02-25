/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class CastExample {
    
    public static void main(String args[])
    {
        
        
        // conditions fulfilled for implicit narrowing primitive conversions.
            short s1 = 10;          // int value in range.
            short s2 = 'a';         // char value in range.
            char c1 = 32;           // int value in range.
            char c2 = (byte)35;     // byte value in range. int value in range, without cast.
            byte b1 = 40;           // int value in range.
            byte b2 = (short)40;    // short value in range. int value in range, without cast.
            final int i1 = 20;
            byte b3 = i1;           // final value of i1 in range.

        // conditions not fulfilled for implicit narrowing primitive conversions.
        // Explicit cast required.
            int i2 = -20;
            final int i3 = i2;
            final int i4 = 200;
            short s3 = (short) i2;    // Not constant expression.
            char c3 = (char) i3;      // final value of i3 not determinable.
            char c4 = (char) i2;      // Not constant expression.
            byte b4 = (byte) 128;     // int value not in range.
            byte b5 = (byte) i4;      // final value of i4 not in range.
            
            // Explicit narrowing primitive conversions requiring cast.
                // The value is truncated to fit the size of the destination type.
                float huge   = (float) 1.7976931348623157d; // double to float.
                long  giant  = (long) 4415961481999.03D;    // (1) double to long.
                int   big    = (int) giant;                 // (2) long to int.
                short small  = (short) big;                 // (3) int to short.
                byte  minute = (byte) small;                // (4) short to byte.
                char  symbol = (char) 112.5F;               // (5) float to char.

         //  add(huge);  //Method invocation 
          //  int a=big*huge; // Arithmetic expression evaluation 
                
                

    }
    
    public static void add(int d)
    {
        System.out.println("add method");
    }
    
}
