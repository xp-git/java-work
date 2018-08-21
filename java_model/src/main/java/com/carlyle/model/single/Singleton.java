package com.carlyle.model.single;

/**
 * @author 80992225
 * 单列模式，饿汉式
 * 是否 Lazy 初始化：否
	是否多线程安全：是
	实现难度：易
	描述：这种方式比较常用，但容易产生垃圾对象。
	优点：没有加锁，执行效率会提高。
	缺点：类加载时就初始化，浪费内存。
 */
public class Singleton {
	
	private static Singleton single = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance (){
		
		return single;
	}
	
	public static void main(String[] args) {
		InnerSingle single = InnerSingle.testSingle();
		single.test();
//		System.out.print();
	}
	
}
