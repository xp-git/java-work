package com.carlyle.model.single;

public class TestSingle implements Runnable {
	public static void main(String[] args) {
		
		TestSingle t = new TestSingle();
		Thread thread = new Thread(t);
		thread.start();
		//TestSingle t1 = new TestSingle();
		Thread thread1 = new Thread(t);
		thread1.start();
		for(int i= 0 ; i <100 ; i++){
			Thread thread2 = new Thread(t);
			thread2.start();
		}
	
		
	}

	@Override
	public void run() {
		
		System.out.println("-====="+Singleton.getInstance().hashCode());
	}
}
