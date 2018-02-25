package innerClass;

class OuterInstances{  
	 private  int data=30;  
	 
	  class  Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 } 

	 public static void main(String args[]){  
	//	 OuterInstances.Inner a=new OuterInstances.Inner(); 
		 
	  OuterInstances obj=new OuterInstances();  
	  OuterInstances.Inner in=obj.new Inner();  
	  in.msg();  
	 }  
}
