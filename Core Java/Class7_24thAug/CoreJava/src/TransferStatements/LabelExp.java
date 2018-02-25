/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TransferStatements;

public class LabelExp {
	

	public static void main(String[] str){
		
		int i=2;
		
		L1: while (i > 0) {
		    //L1: System.out.println(i);  // (1) Not OK. Label redeclared.
			System.out.println("I value"+i);
			i--;
			continue L1;
		}

		L1: while (i < 0) {              // (2) OK.
		    L2: System.out.println(i);
		}

		L1: {                           // (3) OK. Labeled block.
		    int j = 10;
		    System.out.println(j);
		}

		L1: try {                       // (4) OK. Labeled try-catch-finally block.
		    int j = 10, k = 0;
		    L2: System.out.println(j/k);
		} catch (ArithmeticException ae) {
		    L3: ae.printStackTrace();
		} finally {
		    L4: System.out.println("Finally done.");
		}

		
		
		
	
	}
	
	
}
