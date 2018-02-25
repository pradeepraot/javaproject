package String;

public class StringBufferDemo {
	
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");    //103
		sb.insert(1,"Java");//now original string is changed  
		sb.append("Java");//now original string is changed  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints Hello Java  
		
		StringBuffer sb1=new StringBuffer();  
		System.out.println(sb1.capacity());//default 16  
		sb1.append("Hello");  
		System.out.println(sb1.capacity());//now 16  
		sb1.append("java is my favourite language");  
		System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		}  

}
