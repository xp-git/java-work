package com.carlyle.model.工厂模式;

public class SimpleFactory {


	public static Product createProduct(int type ){
		
		if(type == 1){
			return new ProductA();
		}else if(type == 2){
			return new ProductB();
			
		}
		return new ComonProduct();
	}
}
