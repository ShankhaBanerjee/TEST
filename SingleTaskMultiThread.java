package demo.test;
//performing single task by multiple threads

class SingleTaskMultiThread extends Thread
{  
		 public void run()
		 {  
		   System.out.println("Thread Running........");  
		 }  

		 public static void main(String args[])
		 {  
			 SingleTaskMultiThread t1=new SingleTaskMultiThread();  
			 SingleTaskMultiThread t2=new SingleTaskMultiThread();  
			 SingleTaskMultiThread t3=new SingleTaskMultiThread();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
		 }  
}  

