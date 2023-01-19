// Dnyandev Nagre 

//WAP to show priority of a thread

package Question5;

public class ThreadPriority extends Thread
{
	public void run()
	{
		System.out.println("Inside the run() method");
	}
	public static void main(String argvs[])
	{
		Thread.currentThread().setPriority(7); 
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority()); 
		ThreadPriority th1 = new ThreadPriority();
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
	}
}
