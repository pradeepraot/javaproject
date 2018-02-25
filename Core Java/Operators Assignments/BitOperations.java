/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class BitOperations {
    public static void main(String[] args) {
        int v1 = 2;                      // Unicode value 41
        int v2 = 3;
        printIntToStr("v1:", v1);           // 41
        printIntToStr("v2:", v2);           // 13
        printIntToStr("~v1:", ~v1);         // -42
        printIntToStr("v1 & v2:", v1 & v2); // 9
        printIntToStr("v1 | v2:", v1 | v2); // 45
        printIntToStr("v1 ^ v2:", v1 ^ v2); // 36
    }
    
    
        public static void printIntToStr(String label, int result) {
        System.out.println(label);
        System.out.println(result);
        System.out.println("    Binary:  " + Integer.toBinaryString(result));
        System.out.println("    Hex:     " + Integer.toHexString(result));
        System.out.println("    Decimal: " + result);
    }
}
