package collections;

import java.util.*;  
public class ListIteratorDemo { 
	
	public static void main(String args[]){  
		
		ListIteratorDemo a=new ListIteratorDemo();
	  
	ArrayList<String> al=new ArrayList<String>();  
	al.add("Amit");  
	al.add("Vijay");  
	al.add("Kumar");  
	al.add(1,"Sachin");  
	
	Integer i=10;
	
	int j=i;
	
	
    a.add(j);
	
	
	  
	//System.out.println("element at 2nd position: "+al.get(2));  
	  
	ListIterator<String> itr=al.listIterator(3);  
	  
//	System.out.println("traversing elements in forward direction...");  
//	while(itr.hasNext()){  
//	System.out.println(itr.next());  
//	 }  
	  
	  
	System.out.println("traversing elements in backward direction...");  
	while(itr.hasPrevious()){  
	System.out.println(itr.previous());  
	 }  
	}  
	
	public void add(Integer k)
	{
		
		
	}
	}  