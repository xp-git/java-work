package com.carlyle.javase.剑指offer.递归;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * 
 * f(n-1) =f(0)+f(1) + f(2) + f(3)+f(4)...+f(n-1-2)+f(n-1-1)\
 * 		= f(0)+f(1) + f(2) + f(3)+f(4)...+f(n-3)+f(n-2)
 * 	f(n) =f(0)+f(1) + f(2) + f(3)+f(4)...+f(n-2)+   f(n-1)
 * 		 = f(n-1)+f(n-1) = 2 * f(n-1)
 * */
public class BTTiaoTaiJie {

	
	public static int btJumpTai(int n ){
		
		if( n <= 0 ){
			return 0;
		}
		if(n ==1 ){
			return 1;
		}
		int sum = 1 ;
		int a = 1;
		for(int i = 1 ; i < n ; i++ ){
			
			sum =  a*2;
			a = sum;
			
		}
		return sum;
//		return 1<<(n-1);
	}
	public static int diGui(int n ){
		if( n <= 0 ){
			return 0;
		}
		if(n ==1 ){
			return 1;
		}
		return 2*diGui(n-1);
	}
	public static void main(String[] args) {
		
		System.out.println(btJumpTai(15));
		System.out.println(diGui(15));
	}
}
