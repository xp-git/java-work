package com.carlyle.javase.剑指offer.发散思维;
/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 
 * */
public class SumNum {

	 public static  int Sum_Solution(int n) {
	 
		 if(n <=0){
			 return 0;
		 }
		 if(n ==1){
			 return 1;
		 }
		 return Sum_Solution(n-1)+n;
	 }
	 public static  int Sum_Solution2(int n) {
		 
		 int sum = n;
		boolean flag = (n > 0) && ((sum+=Sum_Solution2(--n))>0 );
		System.out.println(flag+"==="+n);
		return sum;
	 }
	
	 public static void main(String[] args) {
		System.out.println(Sum_Solution(3));
		System.out.println(Sum_Solution2(3));
	}
}
