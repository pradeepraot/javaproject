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
public class AnonArray {
    
    public static void main(String[] args) {
        System.out.println("Minume value:"+findMinimum(new int[]{3,5,2,8,6}));
    }
    
    public static int findMinimum(int dataSeq[])
    {
        int min=dataSeq[0];
        for (int index=1;index<dataSeq.length;++index)
        {
            if(dataSeq[index]<min)
                min=dataSeq[index];
           
        }
       return min; 
    }
    
}
