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
public class ContinueExp {
    
     public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            if (i == 4) continue;             // (1) Control to (2).
            // Rest of loop body skipped when i has the value 4.
            System.out.println(i + "\t" + Math.sqrt(i));
            // (2). Continue with increment expression.
        } // end for
    }

    
}
