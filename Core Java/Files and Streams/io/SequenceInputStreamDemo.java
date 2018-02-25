package io;
import java.io.*;  

public class SequenceInputStreamDemo {  
	  public static void main(String args[])throws Exception{  
	   FileInputStream fin1=new FileInputStream("abc.txt");  
	   FileInputStream fin2=new FileInputStream("abc.txt");  
	  
	   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
	   int i;  
	   while((i=sis.read())!=-1){  
	    System.out.print((char)i);  
	   }  
	   sis.close();  
	   fin1.close();  
	   fin2.close();  
	  }  
	}  
