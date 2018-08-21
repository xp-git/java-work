package com.carlyle.model.single;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingle3 implements Callable<Integer> {

	
	public static void main(String[] args) throws Exception {
		
		TestSingle3 t = new TestSingle3();
		
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();
		System.out.println(exec.submit(t));
		results.add(exec.submit(t));
		results.add(exec.submit(t));
		for(Future<Integer> f : results){
			
			System.out.println("返回值"+f.get().toString());
		}
		
		new TestSingle3().call();
	}
	
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"===="+Singleton.getInstance().hashCode());
		return 23;
	}

}
