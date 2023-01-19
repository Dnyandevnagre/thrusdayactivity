package com.threadpractice;

public class DemonExample extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("this is a daemon thread");
        }
		else
		{
			System.out.println("this is a user thread");
		}
	}

	public static void main(String[] args) {
         DemonExample t1=new DemonExample();
         DemonExample t2=new DemonExample();
         DemonExample t3=new DemonExample();
         DemonExample t4=new DemonExample();
         
         t1.setDaemon(true);
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         

	}

}
