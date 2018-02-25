/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydeclaration;

/**
 *
 * @author PRADEEP
 */
public class ArrayConstuctor {
    int[] a=new int[10];
      ArrayConstuctor obj4[]=new ArrayConstuctor[10];  
      ArrayConstuctor obj5[]={new ArrayConstuctor(),null};
    int[] b={1,2};
    
    int[] c={1,2, };
    int[] d=new int[]{1,2};
    static int k;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayConstuctor obj3=new ArrayConstuctor();
        //obj3.a[0]=10;
        
        System.out.println(2+2+"\ttest\t"+2+2);
       
               for(int k=0;k<obj3.obj4.length;k++)
               {
             System.out.println("Array Constuctor:int array value  "+(obj3.obj4[k]));
               }
       
       System.out.println("Array Constuctor:int array value  "+obj3.c.length);
       
    }
    
    
}
