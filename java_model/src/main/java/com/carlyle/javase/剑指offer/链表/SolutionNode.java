package com.carlyle.javase.剑指offer.链表;

/**
 * 有一个单向链表，长度未知，求倒数第M，N个位置的元素。
 * 
 * 先求出链表的长度。
 * 
 * **/
public class SolutionNode {

	public static ListNode FindKthToTail(ListNode node, int k) {

		System.out.println("===22=" + node);
		if (node != null) {
			int length = 0;
			ListNode head = node;
			int count = 0;
			while (head != null) {
				length++;
				head = head.next;
			}
			System.out.println("====" + head);
			// 首先求出链表的长度length
			ListNode list = node;
			for (int i = 0; i < length - k; i++) {
				list = list.next;
				System.out.println("值"+list.val);
			}
			return list;

		}
		return null;

	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(12);
		node.next.next = new ListNode(13);
		node.next.next.next = new ListNode(14);
		// System.out.println(FindKthToTail(node,2));
		ListNode list = FindKthToTail(node, 1);
		while (list != null) {
			System.out.println("1====="+list.val);
			list = list.next;

		}
		ListNode list1 = FindKthToTail2(node, 1);
		while (list1 != null) {
			System.out.println("2====="+list1.val);
			list1 = list1.next;
			
		}
		ListNode list2 = FindKthToTail3(node, 1);
		while (list2 != null) {
			System.out.println("==="+list2.val);
			list2 = list2.next;
			
		}
	}

	public static ListNode FindKthToTail2(ListNode head, int k) {
		ListNode pre = null, p = null;
		// 两个指针都指向头结点
		p = head;
		pre = head;
		// 记录k值
		int a = k;
		// 记录节点的个数
		int count = 0;
		// p指针先跑，并且记录节点数，当p指针跑了k-1个节点后，pre指针开始跑，
		// 当p指针跑到最后时，pre所指指针就是倒数第k个节点
		while (p != null) {
			p = p.next;
			count++;
			if (k < 1) {
				pre = pre.next;
			}
			k--;
		}
		// 如果节点个数小于所求的倒数第k个节点，则返回空
		if (count < a)
			return null;
		return pre;

	}

		public static ListNode FindKthToTail3(ListNode head,int k) {
		        if(head==null||k<=0){
		            return null;
		        }
		        ListNode pre=head;
		        ListNode last=head;       
		        for(int i=1;i<k;i++){
		            if(pre.next!=null){
		                pre=pre.next;
		            }else{
		                return null;
		            }
		        }
		        while(pre.next!=null){
		            pre = pre.next;
		            last=last.next;
		        }
		        return last;
		    }
}

// class ListNode {
// int val;
// ListNode next = null;
//
// ListNode(int val) {
// this.val = val;
// }
// }
