package com.carlyle.model.single;

public class LazzSingleton {

	private static LazzSingleton lazz = null;

	private LazzSingleton() {

	}

	public static LazzSingleton getInstance() {
		// 使用同步代码块，可以解决线程安全的问题
		synchronized (LazzSingleton.class) {
			if (lazz == null) {
				lazz = new LazzSingleton();
			}
			return lazz;
		}
	}

}
