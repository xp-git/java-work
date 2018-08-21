package com.carlyle.javase.剑指offer.代码完整性;

/**
 * 
 * 
 * 求一个数的n次方
 * 
 * */
public class ShuFang {

	public static double doubleInt(double base, int exponent) {
		double result = 1.0;

		for (int i = 0; i < Math.abs(exponent); i++) {
			result *= base;
		}
		if (exponent < 0) {
			result = 1 / result;
		}
		return result;
	}

	public static double test(double base, int exponent) {
		int n = Math.abs(exponent);
		if (n == 0)
			return 1;
		if (n == 1)
			return base;
		double result = test(base, n >> 1);
		result *= result;
		if ((n & 1) == 1)
			result *= base;
		if (exponent < 0)
			result = 1 / result;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("测试;" + doubleInt(2.0, 0));
		System.out.println("测试;" + test(2.0, 3));
		System.out.println("测试;" + (0-(-9)));
	}
}
