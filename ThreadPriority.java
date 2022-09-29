package demo.test;
 
public class ThreadPriority extends Thread   
{  

public void run()  
{  

System.out.println("Inside the run() method");  
}  


public static void main(String argvs[])  
{  

ThreadPriority th1 = new ThreadPriority();  
ThreadPriority th2 = new ThreadPriority();  
ThreadPriority th3 = new ThreadPriority();  

System.out.println("Priority of the thread th1 is : " + th1.getPriority());  

System.out.println("Priority of the thread th2 is : " + th2.getPriority());  

System.out.println("Priority of the thread th3 is : " + th2.getPriority());  

//Setting priorities of above threads by passing integer arguments  
th1.setPriority(6);  
th2.setPriority(3);  
th3.setPriority(9);  


System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
 
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  

System.out.println("Priority of the thread th3 is : " + th3.getPriority());  

//Main thread  

  
System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  

System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  

Thread.currentThread().setPriority(10);  

System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
}  
}  
