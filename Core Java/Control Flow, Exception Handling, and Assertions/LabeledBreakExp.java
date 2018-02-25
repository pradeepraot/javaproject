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
public class LabeledBreakExp {
    

    public static void main(String[] args) {
        
        
                                                         
        for (int i = 0; i < 2; i++){  
            
            outer:{
            System.out.println("i VALUE inside outer block"+i);
            
            if(i>=1) break  outer;
            
            System.out.println("i VALUE inside after break  statement"+i);
                    
            }
            
            System.out.println("i VALUE outside  of  the outer block"+i);
           
        }
    }


    
}
