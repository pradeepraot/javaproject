/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Constructor;

class GrandParent {
  int a;
 
  GrandParent(int a) {
    this.a = a;
  }
}
 
class Parent extends GrandParent {
  int b;
 
  Parent(int a, int b) {
    super(a);
    this.b = b;
  }
 
  void show() {
    System.out.println("GrandParent's a = " + a);
    System.out.println("Parent's b      = " + b);
  }
}
 
class Child {
  public static void main(String[] args) {
    Parent object = new Parent(8, 9);
    object.show();
  }
}
