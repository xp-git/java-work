package com.carlyle.javase.剑指offer.递归;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * 
 * 
 * */
public class TiaoTaijie {

	//第一种方法使用递归
	public static int fangfa(int n ){
		if(n <= 0 ){
			return 0;
		}
		if(n ==1 ){
			return n;
		}
		if(n == 2 ){
			return n;
		}else{
			return fangfa(n-1)+fangfa(n-2);
		}
	}
	
	/**
	 * 第二种方法使用循环，前两次单独考虑，
	 * 比如有3个台阶，三个台阶的跳发总数   =  三个台阶减少一个的跳发数     +  三个台阶减少两个的跳发数。
	 *  n  =  n-1 台的方法  +  n-2 台的方法
	 * 
	 * */
	public static int jumpSun(int n ){
		if( n <=0 ){
			return 0;
		}
		if(n ==1 ){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		int sum = 0 ;
		int oneStep = 1;
		int twoStep = 2;
		for(int i = 3 ; i <= n ; i++){
			sum = oneStep + twoStep;
			oneStep = twoStep;
			twoStep = sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(jumpSun(6));
		System.out.println(fangfa(6));
	}
	
}
