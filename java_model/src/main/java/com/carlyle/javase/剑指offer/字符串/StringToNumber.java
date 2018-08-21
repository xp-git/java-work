package com.carlyle.javase.剑指offer.字符串;

/**
 * 
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 
 * 
 * */
public class StringToNumber {

	public static int strToNum(String str) {

		for (int i = 0; i < str.length(); i++) {

			System.out.println(str.charAt(i) == 1);
		}

		return 0;
	}

	public static int StrToInt(String str) {

		if (str == null || str.length() == 0)
			return 0;
		char[] c = str.toCharArray();
		int fuhao = 0;// 0代表第一位不没有符号，1代表第一位为+，-1代表第一位为-
		int i = 0;
		if (c[0] == '+') {
			fuhao = 1;
			i = 1;
		} else if (c[0] == '-') {
			fuhao = -1;
			i = 1;
		}
		int sum = 0;
		for (; i < c.length; i++) {
			if (c[i] < 48 || c[i] > 57)
				return 0;
			sum = sum * 10 + c[i] - 48;
		}
		if (fuhao == -1)
			sum = 0 - sum;
		return sum;
	}

	public static void main(String[] args) {

		strToNum("123344");
		String str = "123654";
		System.out.println(StrToInt(str));
	}

}
