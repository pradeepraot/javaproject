package innerClass;

public class localInner1{  
	
	 int data=30;//instance variable  
	 
	 void add()
	 {
		 System.out.println("localInner1 add"); 
	 }
	
	void display(){  
		
		int data=40;
		
	  class Local{ 
		  int i=10;
	   void msg(){System.out.println(this.i);
	   this.add();
	   }  
	   void add(){System.out.println("test add");}
	  }  
	  Local l=new Local();  
	  l.msg();
   	 }
	
	 public static void main(String args[]){  
	  localInner1 obj=new localInner1();  
	  obj.display();  
	
	  
	 }  
	} 
