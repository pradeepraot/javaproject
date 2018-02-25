/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OtherModiferMem;

class Native {

    /*
     * The static block ensures that the native method library
     * is loaded before the native method is called.
     */
    static {
        System.loadLibrary("NativeMethodLib");  // (1) Load native library.
    }
   
    native void nativeMethod();                 // (2) Native method prototype.
    // ...
   
}

class Client {
    //...
    public static void main(String[] args) {
        Native aNative = new Native();
        aNative.nativeMethod();                 // (3) Native method call.
    }
    //...
}
