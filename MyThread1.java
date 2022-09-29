package demo.test;
//Here no thread is runing, we are just returning the value of the thread
public class MyThread1 {

	public static void main(String args[])
	{
		//using constructor Thread(String name)
		Thread t = new Thread("THIS IS A THREAD");
		t.start(); //moves the thread to runnable 
		String str = t.getName();
		System.out.println(str);
	}
	
}
