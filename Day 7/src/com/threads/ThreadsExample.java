package com.threads;

public class ThreadsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mt=new Mythread();
		Mythread2 mt1=new Mythread2();
		mt.start();
		mt1.start();
		RunnableThread rt=new RunnableThread();
		Thread t=new Thread(rt);
		t.start();
		RunnableThread1 rt1=new RunnableThread1();
		Thread t1=new Thread(rt1);
		t1.start();
	}

}
