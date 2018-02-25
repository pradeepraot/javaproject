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
public class BreakExp {
    
      public static void main(String[] args) {
          
          System.out.println(1.0%3.0);

        for (int i = 1; i <= 5; ++i) {
            if (i == 4) break;         // (1) Terminate loop. Control to (2).
            // Rest of loop body skipped when i gets the value 4.
            System.out.println(i + "\t" + Math.sqrt(i));
        } // end for
        // (2) Continue here.

        int n = 2;
        switch (n) {
            case 1: System.out.println(n); break;
            case 2: System.out.println("Inner for loop: ");
                    for (int j = 0; j < n; j++)
                        if (j == 2)
                            break;   // (3) Terminate loop. Control to (4).
                        else
                            System.out.println(j);
            //default: System.out.println("default: " + n); // (4) Continue here.
        }
    }
    
}
