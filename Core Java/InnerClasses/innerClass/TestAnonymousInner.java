package innerClass;

abstract class Person{  
	  abstract void eat();  
	}  
class TestAnonymousInner{  
	 public static void main(String args[]){  
	  Person p=new Person(){  
	  void eat(){System.out.println("nice fruits");}  
	  };  
	  p.eat();
	  
	  Person p1=new Person(){  
		  void eat(){System.out.println("good fruits");}  
		  };   
		  p1.eat();
	  
	 }  
	} 