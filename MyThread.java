package demo.test;

// THREAD CREATION USING EXTENDS 
/*class MyThread extends Thread	//here thread is a class so we can make obj directly
{
	public void run() // running state
	{
		System.out.println("Run --> theread is runing");
	}
	
	public static void main(String args[])
	{
		MyThread t1 = new MyThread(); //t1 is object of class main but as it is extending it becomes a thread
		t1.start();	//moves to runnable state
		System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
	}
}
*/

// t1 is a object and also a thread
//===================================================================================================================================


//THREAD CREATION USING RUNABLE INTERFACE 
class MyThread implements Runnable
{
	public void run() 
	{
		System.out.println("Run --> theread is runing");
	}
	public static void main(String args[])
	{
		MyThread m1 = new MyThread(); //m1 is obj of class Mythread
		Thread t1 = new Thread(m1); //t1 is a thread, Using the constructor --> Thread(Runnable r)
		System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
		t1.start();
	}
	}


