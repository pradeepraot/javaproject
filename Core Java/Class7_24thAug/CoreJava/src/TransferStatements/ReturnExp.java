/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TransferStatements;

/**
 *
 * @author PRADEEP
 */
public class ReturnExp {
    
    public static void main (String[] args) { // (1) void method can use return.
        
        System.out.println(2.25%4.25);
        
        
       // output(checkValue(2));
    }

    static void output(int value) { // (2) void method need not use return.
        System.out.println(value);
        return;
        //return e;                 // Not OK. Cannot return a value.
    }

    static int checkValue(int i) {  // (3) non-void method must return a value.
        if (i > 3)
           return i;                // OK.
        else
            return 3;
          // return 2.0;              // Not OK. double not assignable to int.
    }

    
}
