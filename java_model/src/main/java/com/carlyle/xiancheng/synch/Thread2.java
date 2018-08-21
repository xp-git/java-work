package com.carlyle.xiancheng.synch;

public class Thread2 {

	
	public void syctest(){
		synchronized(this){
			
			for(int i = 0 ; i < 5 ; i++){
				
				System.out.println(Thread.currentThread().getName()+"===="+i);
				
			}
		}
	}
	
	public void test(){
		
		for(int i =0 ; i < 5 ; i++){
			System.out.println(Thread.currentThread().getName()+"====="+i);
		}
	}
	
	public void syctest2(){
		
		synchronized(this){
			for(int i =0 ; i < 5 ; i++){
				System.out.println(Thread.currentThread().getName()+"====="+i);
			}
		}
	}
	public synchronized void synctest3(){
		for(int i =0 ; i < 5 ; i++){
			System.out.println(Thread.currentThread().getName()+"====="+i);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Thread2 o = new Thread2();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				o.syctest();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				o.test();
				o.syctest2();
				//o.synctest3();
			}
		});
		t1.start();
		t2.start();
		
	}
}
