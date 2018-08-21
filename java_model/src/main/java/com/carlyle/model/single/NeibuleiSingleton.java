package com.carlyle.model.single;

/**
 * 使用内部类来创建单列模式。
 * 这样可以保证线程的安全。
 * 
 * */
public class NeibuleiSingleton {
	
	
	private static class NblInstence{
		
		private static NeibuleiSingleton  instence = new NeibuleiSingleton();
	}

	
	public static NeibuleiSingleton publicInstence(){
		
		return NblInstence.instence;
	}
}
