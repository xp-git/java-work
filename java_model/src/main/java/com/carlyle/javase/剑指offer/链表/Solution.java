package com.carlyle.javase.剑指offer.链表;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	
	public  ArrayList<Integer> printListFromTailToHead(ListNode  listNode) {
		
		Stack<Integer> stack1 = new Stack<Integer>();
		if(listNode != null ){
			while(listNode != null){
				
				stack1.push(listNode.val);
				listNode = listNode.next;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("ceshi "+stack1);
		while(!stack1.isEmpty()){
			list.add(stack1.pop());
		}
		return list;
	}
	public static void main(String[] args) {
		ListNode node = new ListNode(11);
		 node.next  = new ListNode(12);
		 node.next.next = new ListNode(13);
//		 node.next.next.next = new ListNode(14);
		 Solution  a = new Solution();
		System.out.println(a.printListFromTailToHead(node));
	}
}

class ListNode2 {
	
	int val ;
	ListNode2 next = null ;
	
	ListNode2 (int val ){
		this.val = val;
	}
}
