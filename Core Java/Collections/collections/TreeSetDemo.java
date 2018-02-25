package collections;
import java.util.*;  

public class TreeSetDemo { 
	
	static int  i=10;
	
	
	 public static void main(String args[]){ 
		 
		 TreeSetDemo a=new TreeSetDemo();
		 TreeSetDemo a3=new TreeSetDemo();
		
		 a.i=20;
		 
		 System.out.println(a.i);
		 System.out.println(a3.i);
	   
	  TreeSet<String> al=new TreeSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}
