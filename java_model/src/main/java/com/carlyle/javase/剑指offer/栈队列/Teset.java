package com.carlyle.javase.剑指offer.栈队列;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，
 * 如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。

 * **/
public class Teset {

	public static ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (size > num.length || size == 0)
			return list;
		for (int i = 0; i <= num.length - size; i++) {
			int max = num[i];
			for (int j = i + 1; j < i + size; j++) {
				if (num[j] > max) {
					max = num[j];
				}
			}
			list.add(max);
		}
		return list;
	}

	public static ArrayList<Integer> maxInWindowsList(int[] num, int size) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		// 考虑超过。或size为零的情况
		if (size > num.length || size == 0)
			return list;
		// 外循环，循环到num - size的位置，内循环，每次都循环一个滑动窗口的位置
		for (int i = 0; i <= num.length - size; i++) {
			int max = num[i];
			for (int j = i + 1; j < i + size; j++) {
				if (num[j] > max) {
					max = num[j];
				}
			}
			list.add(max);

		}
		return list;
	}

	public static ArrayList<Integer> maxInWindowsList2(int[] num, int size) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		// 考虑超过。或size为零的情况
		if (size > num.length || size == 0)
			return list;
		for (int i = 0; i <= num.length - size; i++) {

		}
		return list;
	}

	public static void main(String[] args) {

		int[] num = { 1, 3, 4, 67, 7 };
		int[] num2 = new int[9];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = i;
		}

		System.out.println(num2.length + "==" + Arrays.toString(num2) + "="
				+ maxInWindowsList(num2, 4));

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {
				int temp = num[i];
				if (num[j] < num[i]) {

					num[i] = num[j];
					num[j] = temp;
				}

			}
		}
		System.out.println(num2.length + "==" + Arrays.toString(num));
		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {
				int temp = num[i];

				if (num[j] > num[i]) {
					num[i] = num[j];
					num[j] = temp;
				}

			}
		}
		System.out.println(num2.length + "==" + Arrays.toString(num));
		int[] num3 = { 11, 3, 4, 67, 7 };
		System.out.println(maxInWindows3(num3, 3) + "==" + Arrays.toString(num3));
	}

	public static ArrayList<Integer> maxInWindows3(int[] num, int size) {

		ArrayList<Integer> res = new ArrayList<Integer>();

		if (size == 0)
			return res;

		int begin;

		ArrayDeque<Integer> q = new ArrayDeque<>();
		/**
		 * q.peekFirst() 获取，但不移除此双端队列的第一个元素；如果此双端队列为空，则返回 null。
		 * q.peekLast()  获取，但不移除此双端队列的最后一个元素；如果此双端队列为空，则返回 null。 
		 * q.pollFirst(); 获取并移除此双端队列的第一个元素；如果此双端队列为空，则返回 null。
		 * pollLast()   获取并移除此双端队列的最后一个元素；如果此双端队列为空，则返回 null。
		 * 
		 * */

		for (int i = 0; i < num.length; i++) {

			begin = i - size + 1;
			System.out.println("===" + begin);
			if (q.isEmpty())
				q.add(i);
			else if (begin > q.peekFirst())

				q.pollFirst();

			while ((!q.isEmpty()) && num[q.peekLast()] <= num[i])

				q.pollLast();

			q.add(i);

			if (begin >= 0)
				// System.out.println("等等："+q.peekFirst());
				res.add(num[q.peekFirst()]);

		}
		System.out.println(q);
		return res;

	}

}
