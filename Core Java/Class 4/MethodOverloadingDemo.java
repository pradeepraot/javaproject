import java.util.Date;  
  
public class MethodOverloadingDemo {  
   
 /* 
  * Method Overloading occurs when methods are having same name, but a 
  * difference in the number of their parameters or type of their parameters 
  * or both. 
  */ 
    int i=10;
    MethodOverloadingDemo()
    {
    }
    
    MethodOverloadingDemo(int i)
    {
        System.out.println(i);
    }
    
  void sum(int a,int b){System.out.println(a+b);}  
  //1.By changing number of arguments
  void sum(int a,int b,int c){System.out.println(a+b+c);} 
 
 //By changing the data type
 void sum(double a,double b){System.out.println(a+b);}
 public String sum(double a,float b){
     
      System.out.println(a+b); 
      
      return null;
 
 }
 void sum(double a,int b){System.out.println(a+b);}
 //Can we overload main() method?
 public static void main(int i ){    System.out.println(i);  
  }

  
 public static void main(String args[]){  
  MethodOverloadingDemo obj=new MethodOverloadingDemo();  
  obj.sum(10,10,10);  
  obj.sum(20,20);
  float f=10.0f;
  
  
  obj.sum(10.5,10.5f);  
obj.sum(20,20);  

System.out.println("main() method invoked");  
 main(10);  

  }  

} 