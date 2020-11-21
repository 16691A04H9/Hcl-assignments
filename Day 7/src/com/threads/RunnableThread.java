package com.threads;
class RunnableThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1000;i<1010;i++)
		{
			System.out.println(i+"runnable interface");
		}
	}

}
class RunnableThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=2000;i<2010;i++)
		{
			System.out.println(i+"runnable interface 2");
		}
	}

}