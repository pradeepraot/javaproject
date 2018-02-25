/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TransferStatements;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRADEEP
 */
public class CheckedException {
    public static void main(String[] args) {
    
    
    
     FileReader file;        
        try {
            file = new FileReader("C:\\test\\a.txt");
        
     BufferedReader fileInput = new BufferedReader(file);                
     // Print first 3 lines of file "C:\test\a.txt"       
     for (int counter = 0; counter < 3; counter++)           
         System.out.println(fileInput.readLine());                 
     fileInput.close();
     } catch (FileNotFoundException ex) {
            Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
