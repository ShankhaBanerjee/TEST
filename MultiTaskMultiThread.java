package demo.test;

class Multi1 extends Thread
{  
	 public void run()
	 {  
	   System.out.println("1st Task");  
	 }  
	}  
	  
	class Multi2 extends Thread
	{  
	 public void run()
	 {  
	   System.out.println("2nd Task");  
	 }  
	}  
	  
	 class MultiTaskMultiThread
	 {  
	 public static void main(String args[])
	 {  
	  Multi1 t1=new Multi1();  
	  Multi2 t2=new Multi2();  
	  
	  t1.start();  
	  t2.start();  
	 }  
} 
