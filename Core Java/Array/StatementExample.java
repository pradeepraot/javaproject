/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class StatementExample {
    
    int i; //Declaration Template 
   
      {   //Block statemnts
        
    if(true)  //Control flow  statement
    {
       System.out.println("if method");
    }else
    {
      System.out.println("else method");  
    }
    i=10; //Assignment Statement
    i=i++; //Increment Statment
    test();  //method calls
    StatementExample a=new StatementExample();  //Object Cration Statment
    
    Search : System.out.println("Hi");  //Label Statement
    
    }
    
    public void test()
    {
        
    }
    
}
