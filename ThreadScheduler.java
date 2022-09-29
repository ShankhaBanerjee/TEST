package demo.test;
//Example of running multiple threads

public class ThreadScheduler extends Thread 
{
	public void run() 
	{
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is runing");
			//for exception test
			//int a = 8;
			//int b = a/0;
						
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}




	public static void main (String args[])
	{
		int n = 10;
		for (int i = 0; i<=n; i++)
		{
		ThreadScheduler obj1 = new ThreadScheduler();
		obj1.start();
		}
	}
	
}