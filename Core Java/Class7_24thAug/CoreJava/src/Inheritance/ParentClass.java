/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;

/**
 *
 * @author PRADEEP
 */
  
 public class ParentClass {
  private int x;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }
}

class SubClass extends ParentClass {
  private int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setXofParent(int x) {
    setX(x); 
  }
}

class Main {
  public static void main(String[] args) {
    SubClass s = new SubClass();
    s.setX(10);
    s.setY(12);
    System.out.println("X is :"+s.getX());
    System.out.println("Y is :"+s.getY());
    s.setXofParent(13);
    System.out.println("Now X is :"+s.getX());
  }
}
