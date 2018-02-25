package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayDemo {

	   public static void main(String[] args) {
	      
	   // create an empty array list with an initial capacity
	   ArrayList<Integer> arrlist = new ArrayList<Integer>();

	   // use add() method to add values in the list
	   arrlist.add(10);
	   arrlist.add(12);
	   arrlist.add(31);
	   arrlist.add(49);
	  // arrlist.add("string");
	  
		
	   System.out.println("Printing elements of array1");

	   // let us print all the elements available in list
	   for (Integer number : arrlist) {
	   System.out.println("Number = " + number);
	   }  

	   // toArray copies content into other array
	   Integer list2[] = new Integer[2];
	   list2 = arrlist.toArray(list2);

	   System.out.println("Printing elements of array2");

	   // let us print all the elements available in list
	   for (Integer number : list2) {
	   System.out.println("Number = " + number);
	   }
	   
	   //Arrays to ArrayList 
	   
	   List<Integer> l= Arrays.asList(list2);
	   
	    System.out.println(l);
	    System.out.println();
	   
	   
	   }
	} 
