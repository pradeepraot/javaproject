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
public class LabeledContinueExp {
    
     public static void main(String[] args) {
        
         outer:
         for (int i = 1; i <= 3; ++i) {
            
             for (int j = 1; j <= 3; ++j) {
            if (j >= 2) continue outer;             
            
            System.out.println(j + "\t J  value" );
             }
             
             System.out.println(i + "\t I  value" );
           
        } 
    }
    
}
