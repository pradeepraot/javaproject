package String;

public class StringDemo {

	public static void main(String args[])
	{
		String s="Pradeep";
		String s1="Pradeep";
		
		s="Pradeep rao";
		
		
		
		
		
		String s2=new String("Pradeep");
		
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		 String s3="Sachin";  
		   s3=s3.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s3);//will print Sachin because strings are immutable objects  
		   
		   String s4="Sachin";  
		   String s5="Sachin";  
		   String s6="Ratan";  
		   System.out.println(s4.compareTo(s5));//0  
		   System.out.println(s4.compareTo(s6));//1(because s1>s3)  
		   System.out.println(s6.compareTo(s4));//-1(because s3 < s1 )  
		   
		   String s7="Sachin Tendulkar";  
		   System.out.println(s7.substring(6));//Tendulkar  
		   System.out.println(s7.substring(0,6));//Sachin  
		   
		   String s8=new String("Sachin"); 
		   String s10=new String("Sachin"); 
		   String s9=s8.intern();  
		   System.out.println(s8==s9);//Sachin 
		   System.out.println(s8==s10);//Sachin 
		   System.out.println(s8);
		   System.out.println(s9);
		   System.out.println(s8.equals(s9)+"233");//Sachin 
	}
	
}
