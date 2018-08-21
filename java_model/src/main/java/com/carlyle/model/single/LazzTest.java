package com.carlyle.model.single;

public class LazzTest implements Runnable{

	
	public static void main(String[] args) {
		
		LazzTest test = new LazzTest();
		
		for(int i = 0 ; i < 10 ; i ++){
			Thread t = new Thread (test);
			t.start();
		}
	}
	@Override
	public void run() {
		System.out.println(LazzSingleton.getInstance().hashCode());
		System.out.println(System.currentTimeMillis());
		
	}

}
