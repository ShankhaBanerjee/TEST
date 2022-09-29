package demo.test;
  
class ThreadJoin extends Thread  
{  
	public void run()  
	{  
		for (int i = 1; i < 5; i++)  
		{  
			try  
			{  
				Thread.sleep(300);  
				System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			}  
			catch(Exception e)  
			{  
				System.out.println("The exception has been caught: " + e);  
			}  
			//System.out.println( i );  
		}  
	}  

  
public static void main (String argvs[])  
	{  
		// creating 3 threads  
		ThreadJoin th1 = new ThreadJoin();  
		ThreadJoin th2 = new ThreadJoin();  
		ThreadJoin th3 = new ThreadJoin();  
  
 
		th1.start();  
  
		try  
		{  
			System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
  			th1.join();  
		}  
  
		catch(Exception e)  
		{  
			System.out.println("The exception has been caught " + e);  
		}  
  
		th2.start();  
  
// starting the th3 thread after when the thread th2 has ended or died.  
		try  
		{  
			System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			th2.join();  
		}  
  
		catch(Exception e)  
		{  
			System.out.println("The exception has been caught " + e);  
		}  
  
		// thread th3 starts  
		th3.start();  
	}  
}  