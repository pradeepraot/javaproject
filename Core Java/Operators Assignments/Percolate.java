/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class Percolate {

    public static void main (String[] args) {
        int[] dataSeq = {6,4,8,2,1};   // Create and initialize an array.

        // Write array before percolation.
        for (int i = 0; i < dataSeq.length; ++i)
        {
//            System.out.print(" " + i);
            System.out.print(" " + dataSeq[i]);
        }
        System.out.println();

        // Percolate.
        for (int index = 1; index < dataSeq.length; ++index)
            if (dataSeq[index-1] > dataSeq[index])
                swap(dataSeq, index-1, index);                   // (1)

        // Write array after percolation.
        for (int i = 0; i < dataSeq.length; ++i)
            System.out.print(" " + dataSeq[i]);
        System.out.println();
    }

    public static void swap(int[] table, int i, int j) {          // (2)
        int tmp = table[i]; table[i] = table[j]; table[j] = tmp;
    }

    
}

