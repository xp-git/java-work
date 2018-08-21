package com.carlyle.xiancheng.synch;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 80992225
 * 线程同步，只有当当前的线程执行完毕以后才可以指向其他的线程98-90-96-AC-7B-4E
 */
public class Thread1 extends Thread{

	@Override
	public void run() {
		
		super.run();
		
		synchronized(this){
			for(int i = 0 ; i < 5 ; i++){
				
				System.out.println("当前的线程： "+Thread.currentThread().getName() + "==="+i );
			}
		}
	}
	
	public static void main(String[] args) {
		
		ThreadPoolExecutor pool = null;
		Thread1 t = new Thread1();
		Thread t1 = new Thread(t, "A");
		Thread t2 = new Thread(t,"B");
		
		t.start();
		t1.start();
		t2.start();
		
		for (;;) {
			System.out.println("这个是");
		}
	}
}
