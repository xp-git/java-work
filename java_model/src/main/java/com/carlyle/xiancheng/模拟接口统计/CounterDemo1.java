package com.carlyle.xiancheng.模拟接口统计;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLongArray;

public class CounterDemo1 {

	private final Map<String, Long> urlCounter = new ConcurrentHashMap<>();

	//需要引入Google Guava项目的jar包，maven地址为：
//	<dependency>
//    <groupId>com.google.guava</groupId>
//    <artifactId>guava</artifactId>
//    <version>25.1-jre</version>
//</dependency>
//	private AtomicLongMap<String> urlCounter3 = AtomicLongMap.create();
//	public long increase3(String url) {
//	    long newValue = urlCounter.in
//	    return newValue;
//	}
//	 
//	 
//	public Long getCount3(String url) {
//	    return urlCounter3.get(url);
//	}
	// 接口调用次数+1 这里可以使用synchronized 加锁来实现计数的正确性，但是效率要低很多、
	public   long  increase(String url) {
		Long oldValue = urlCounter.get(url);
		Long newValue = (oldValue == null) ? 1L : oldValue + 1;
		urlCounter.put(url, newValue);
		return newValue;
	}

	// 获取调用次数
	public Long getCount(String url) {
		return urlCounter.get(url);
	}

	public long increase2(String url) {
		Long oldValue, newValue;
		while (true) {
			oldValue = urlCounter.get(url);
			if (oldValue == null) {
				newValue = 1l;
				// 初始化成功，退出循环
				if (urlCounter.putIfAbsent(url, 1l) == null)
					break;
				// 如果初始化失败，说明其他线程已经初始化过了
			} else {
				newValue = oldValue + 1;
				// +1成功，退出循环
				if (urlCounter.replace(url, oldValue, newValue))
					break;
				// 如果+1失败，说明其他线程已经修改过了旧值
			}
			System.out.println("测试：");
		}
		return newValue;
	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		final CounterDemo1 counterDemo = new CounterDemo1();
		int callTime = 10;
		final String url = "http://localhost:8080/hello";
		CountDownLatch countDownLatch = new CountDownLatch(callTime);
		// 模拟并发情况下的接口调用统计
		for (int i = 0; i < callTime; i++) {
			executor.execute(new Runnable() {
				@Override
				public void run() {
					counterDemo.increase(url);
//					counterDemo.increase2(url);
					countDownLatch.countDown();
//					System.out.println("计数："+countDownLatch.getCount());
					
				}
			});
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//关闭所有的线程
		executor.shutdown();
		// 等待所有线程统计完成后输出调用次数
		System.out.println("调用次数：" + counterDemo.getCount(url));
		
		Map<String,Object> map = new Hashtable<String, Object>();
		map.put("test", 1);
		map.put("test", 11);
		for(Map.Entry<String, Object> temp : map.entrySet() ){
			
			System.out.println(temp.getKey()+"==="+temp.getValue());
		}
		
	}
	
	
}
