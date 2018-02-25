package String;

public class StringBuilderDemo {
	
	public static void main(String args[]){  
		StringBuilder  sb=new StringBuilder ("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		sb.append("Java");//now original string is changed  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints Hello Java  
		
		StringBuilder  sb1=new StringBuilder ();  
		System.out.println(sb1.capacity());//default 16  
		sb1.append("Hello");  
		System.out.println(sb1.capacity());//now 16  
		sb1.append("java is my favourite language");  
		System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		}  

}
