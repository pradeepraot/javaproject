package collections;
import java.util.*;  

public class HashMapDemo { 
	 public static void main(String args[]){  
	   
	  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
	  
	  hm.put(102,"Amit");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Amit"); 
	  
	  Set s= hm.keySet();
	  
	  System.out.println(hm.containsValue("Amit"));
	  
	  System.out.println(s);
	  
	  Collection c=hm.values();
	  
	  System.out.println(c);
	  
	  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
	}  
