/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class MultidimensionalExp {
    
    public static void main(String args[])
    {
        int[][] a=new int[2][2];
        a[0][0]=00;
        a[0][1]=01;
        //a[0][2]=01;
        
        a[1][0]=10;
        a[1][1]=11;
       
        int rows=2;
        int columns=2;
        int i,j;
        
        for (i=0;i<rows;i++)
        {
            for (j=0;j<columns;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
    }
    
}
