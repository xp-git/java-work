package com.carlyle.javase.剑指offer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

public class Test {

	
	//定义两个栈
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	//进入队列的方法
	public void push(int node ){
		
//		stack1.add(Integer.valueOf(node));
		stack1.add(new Integer(node));
	}
	
	//出队列
	public Integer pop(){
		
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new RuntimeException("no  more node ");
		}
		return stack2.pop();
	}
	
	public static void chaRu(){
		int[] a = {9,3,1,5,6,8};
		
		for(int i = 1 ; i < a.length ; i++){
			
			int j ;
			int k = a[i];
			for( j = i ; j > 0 && k < a[j-1];j--){
				a[j] = a [j -1];
			}
			a[j] = k;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void xuanze(){
		
		int[] a = {9,3,1,5,6,4};
		//选择排序   
		for(int i = 0 ;i < a.length; i++){
			int min = i ;
			for(int k = i +1 ; k < a.length;k++){
				
				if(a[min]> a[k]){
					min = k ;
				}
			}
			if(a[i] >a[min]){
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			} 
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		xuanze();
	}
	
}
