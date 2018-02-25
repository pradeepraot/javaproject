/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
public class PostPreExample {
    
    public static void main(String args[])
    {
        // (1) Prefix order: increment operand before use.
            int i = 10;
            int k = ++i + --i;  // ((++i) + (--i)). k gets the value 21 and i becomes 10.
            --i;                // Only side effect utilized. i is 9. (expression statement)
            
            System.out.println(i);
            System.out.println(k);
         //   System.out.println(--10);

// (2) Postfix order: increment operand after use.
        long j = 10;
        long d = j++ + j--;  // ((i++) + (i--)). k gets the value 21L and i becomes 10L.
        j++;                // Only side effect utilized. i is 11L. (expression statement)

        System.out.println(j);
        System.out.println(d);
        
    }
    
}
