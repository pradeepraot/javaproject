package interfaceDemo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class MammalInt implements Animal{

	   public void eat(){
	      System.out.println("Mammal eats");
	   }

	   public void travel(){
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs(){
	      return 0;
	   }

	   public static void main(String args[]){
	      Animal m = new MammalInt();
	      
	      Object o=m;
	      
	      int[] i={1,2};
	      int[] j;
	      float[] f;
	      
	      o=i;
	      j=i;
	      
	      Animal0 a1=m;
	      
	      m.eat();
	      m.travel();
	      System.out.println(Animal.i);
	   }
	} 