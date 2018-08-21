package com.carlyle.javase.剑指offer.链表;

import java.util.ArrayList;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。 还是用java的栈来做。看了大神们的递归觉得厉害，就是有点不太懂。 附上测试代码
 * **/
public class 链表打印 {

	ArrayList<Integer> arrayList = new ArrayList<Integer>();

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		int i = 0;
		if (listNode != null) {

			System.out.println("==222222222==" + listNode.val);
			printListFromTailToHead(listNode.next);
			System.out.println("====" + listNode.val);
			arrayList.add(listNode.val);
		}
		return arrayList;

	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		链表打印 a = new 链表打印();
		System.out.println(a.printListFromTailToHead(node));
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}