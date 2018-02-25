/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class ConstructorExample {
    
    private ConstructorExample()
    {
        int i;  //local variable declarations
        class test  //nested local class
        {
            
        }
        
        System.out.println("constructor");
        
    }
    
    public void ConstructorExample()
    {
        System.out.println("Method");
    }
    
    public static void main(String args[])
    {
        ConstructorExample c=new ConstructorExample();
        c.ConstructorExample();
        
    }
    
}
