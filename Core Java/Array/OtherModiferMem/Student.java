package OtherModiferMem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRADEEP
 */
import java.io.Serializable;
public class Student implements Serializable{
 transient int id;
 String name;
 public Student(int id, String name) {
  this.id = id;
  this.name = name;
 }
}

