package com.carlyle.javase.剑指offer;

import java.util.Stack;

/**
 * 用两个栈模拟的队列 
     * 用两个栈实现一个队列。队列的声明如下，诸实现它的两个函数appendTail和deleteHead， 
     * 分别完成在队列尾部插入结点和在队列头部删除结点的功能。
 * */
public class Learn01<T> { 
	
	
	private Stack<T> stack1 = new Stack<>();
	private Stack<T> stack2 = new Stack<>();
	
	public void appendTail(T t ){
		if(stack1.isEmpty())
		stack1.add(t);
		
	}
	public T deleteHead(){
		if(stack2.isEmpty()){
			//一直添加栈1的元素到栈2中。
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new RuntimeException("stack2 is null ");
		}
		return stack2.pop();
	}
}
