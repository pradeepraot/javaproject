package collections;
import java.io.*;  
	public class SerializeDemo { 
	 public static void main(String args[])throws Exception{  
	  Student1 s1 =new Student1(211,"ravi",22);//creating object  
	  //writing object into file  
	  FileOutputStream f=new FileOutputStream("f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(f);  
	  out.writeObject(s1);  
	  out.flush();  
	  
	  out.close();  
	  f.close();  
	  System.out.println("success");  
	 }  
	}  
