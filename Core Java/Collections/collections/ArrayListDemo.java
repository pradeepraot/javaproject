package collections;
import java.util.*;  

public class ArrayListDemo { 
	 public static void main(String args[]){  
	   
	  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
	  al.add("Ravi");//adding object in arraylist  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay"); 
	  
	  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Ravi");  
	  al2.add("Hanumat");  
	    
	// al.addAll(al2); 
	    al.removeAll(al2);  
	 // al.retainAll(al2); 
	  
	  
//	 Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
//	  while(itr.hasNext()){  
//	   System.out.println(itr.next());  
//	  }  
	  
	  for(String s:al)
	  {
		  System.out.println(s);
	  }
	  
	 }  
	}
