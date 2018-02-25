package thread;


class Table1{  
	  
	 synchronized static  void printTable(int n){  
	   for(int i=1;i<=10;i++){ 
	
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  

class MyThread3 extends Thread{  
Table1 t;  
MyThread3(Table1 t){  
this.t=t;  
}  
public void run(){  
t.printTable(1);  
}  
  
}  
class MyThread4 extends Thread{  
Table1 t;  
MyThread4(Table1 t){  
this.t=t;  
}  
public void run(){  
t.printTable(10);  
}  
} 

class MyThread5 extends Thread{  
Table1 t;  
MyThread5(Table1 t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
  
}  
class MyThread6 extends Thread{  
Table1 t;  
MyThread6(Table1 t){  
this.t=t;  
}  
public void run(){  
t.printTable(1000);  
}  
} 
	
	  
public class TestSynchronizationStatic{  
	public static void main(String t[]){  
		Table1 obj1 = new Table1();//only one object 
		Table1 obj2 = new Table1();//only one object 
	MyThread3 t1=new MyThread3(obj1);  
	MyThread4 t2=new MyThread4(obj1);
	
    
	
	MyThread5 t3=new MyThread5(obj2);  
	MyThread6 t4=new MyThread6(obj2);
	t1.setPriority(10);
	System.out.println(" t2 priority" +t2.getPriority());
	t1.start();  
	t2.start();  
	t3.start();  
	t4.start();  
	}  
	}