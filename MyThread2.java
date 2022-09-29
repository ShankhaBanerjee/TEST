package demo.test;

public class MyThread2 implements Runnable
{
	public void run()
	{
		System.out.println("Run() --> The thread is runing...");
	}
	
	public static void main (String args[]) 
	{
		//creating obj of class main
		Runnable r1 = new MyThread();
		
		//creating an object of class thread using Thread(Runnable r, String Name)
		Thread th1 = new Thread(r1, "My new Thread");
		
		
		th1.start(); //moves the thread to active state
		String str = th1.getName();
		System.out.println(str);
	}
}

/* My new Thread
Run --> theread is runing
bcz th1 will execute 1st as per thread scheduler and the it will print other
*/