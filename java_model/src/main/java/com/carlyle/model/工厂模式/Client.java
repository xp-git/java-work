package com.carlyle.model.工厂模式;

public class Client {
	
	public static void main(String[] args) {
		
		//客户端测试
		Product p =  SimpleFactory.createProduct(1);
		
		ProductA pa = (ProductA) SimpleFactory.createProduct(1);
		System.out.println(p +"===="+pa);
	}

}
