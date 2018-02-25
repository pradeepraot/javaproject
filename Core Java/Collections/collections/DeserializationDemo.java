package collections;

import java.io.*;  
class DeserializationDemo{  
 public static void main(String args[])throws Exception{  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student1 s=(Student1)in.readObject();  
  System.out.println(s.id+" "+s.name+" "+s.age);  
  in.close();  
 }  
} 