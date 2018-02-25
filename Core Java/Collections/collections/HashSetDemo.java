package collections;
import java.util.*;  

public class HashSetDemo { 
	 public static void main(String args[]){  
	   
	  Set<String> al=new HashSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  boolean a=al.add("Ravi");  
	  al.add("Ajay");
//	  al.addAll(null);
//	  al.remove("Ravi");
//	  al.contains("a");
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	  
//	  for(String s:al)
//	  {
//		  System.out.println(s);
//	  }
	 }  
	} 
