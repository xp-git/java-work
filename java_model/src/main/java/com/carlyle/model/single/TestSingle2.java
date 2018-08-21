package com.carlyle.model.single;

public class TestSingle2 extends Thread {

	
	public static void main(String[] args) {
		
		TestSingle2[] t = new TestSingle2[10];
		for(int i = 0 ; i < t.length ; i ++){
			t[i]  = new TestSingle2();
		}
		for(int j = 0 ; j < t.length ; j ++){
			
			t[j].start();
		}
	}
	
	public int run3(){
		System.out.println(Singleton.getInstance().hashCode());
		return 1;
	}
	public void run(){
		System.out.println(Singleton.getInstance().hashCode());
	}
}
