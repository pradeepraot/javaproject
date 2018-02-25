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
import java.util.Scanner;
public class AssertExample2 {
    
 
 public static void main( String args[] ){

  Scanner scanner = new Scanner( System.in );
  System.out.print("Enter ur age ");
  
  int value = scanner.nextInt();
   assert( value >= 0 && value <= 20 ) :
   "Invalid number: " + value;
 

  System.out.println("value is "+value);
 } 
}

    

    
