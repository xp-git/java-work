package com.carlyle.model.single;

import com.carlyle.model.single.枚举.SingletonEnum;

public class InnerSingle {

	private InnerSingle(){}
	
	
	private static  class SingleTest{
		
		private static InnerSingle single = new InnerSingle();
	}
	
	public static InnerSingle testSingle(){
		
		return InnerSingle.SingleTest.single;
	}
	
	void test(){
		System.out.println("测试的");
	}
	
	public static void main(String[] args) {
		
		SingletonEnum en = SingletonEnum.instence1;
		
		en.test();
	}
}


