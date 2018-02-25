package thread;

public class RunnableExample implements Runnable {
	
	public void run(){  
		System.out.println("thread is running runnable interface...");  
		}  
		  
		public static void main(String args[]){  
			RunnableExample m1=new RunnableExample();  
		Thread t1 =new Thread(m1,"Name1"); 
		
		t1.start();  
		//t1.setDaemon(true);
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		
		 }  

}
