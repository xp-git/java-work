package com.carlyle.xiancheng.读写锁;

/**
 * @author Carlyle
 * @Date 2018年6月29日 下午3:32:59
 * @Description: 可见性的demo
 */
public class VisibilityDemo	 {

	public static void main(String[] args) throws InterruptedException {

		CountingThread backgroundThread = new CountingThread();

		backgroundThread.start();

		Thread.sleep(1000);

		backgroundThread.cancel();

		backgroundThread.join();

		System.out.printf("count:%s", backgroundThread.count);

	}

}

class CountingThread extends Thread {

	// 线程停止标志

	private volatile boolean ready = false;
//	private  boolean ready = false;

	public int count = 0;

	@Override
	public void run() {

		while (!ready) {

			count++;
			System.out.println("===="+count);
		}

	}

	public void cancel() {

		ready = true;

	}

}