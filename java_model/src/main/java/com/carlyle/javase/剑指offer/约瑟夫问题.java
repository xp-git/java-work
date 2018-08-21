package com.carlyle.javase.剑指offer;

/**
 * @author Carlyle
 * @Date 2018年6月15日 上午11:00:13
 * @Description: 问题开始：
 *               罗马人攻占了乔塔帕特，41个人藏在一个山洞躲过了这场浩劫。这41个人中，包括历史学家Josephus（约瑟夫）和特的一个朋友
 *               。剩余的39个人为了表示不向罗马人屈服
 *               ，决定集体自杀。大家决定了一个自杀方案，所有这41个人围成一个圆圈，由第一个人开始顺时针报数
 *               ，每报数为3的人就立刻自杀，然再由下一个重新开始报数，仍然是每报数为3的人立刻就自杀，。。。。，直到所有的人都自杀身亡位置。
 *               约瑟夫和他的朋友并不想自杀
 *               ，于是约瑟夫想到一个计策，他们两个同样参与到自杀的方案中，但是最后却躲过了自杀。请问，他们是怎么做到的？
 *               先分析一下约瑟夫和他朋友想要躲过自杀，那么自杀到嘴壶一轮剩下三个人，且约瑟夫和他的朋友应该位于1和2的位置，这样就能躲过自杀，
 *               首先将41个人排成一个环，内圈按顺时针的最初编号，外圈为每个人数到3的顺序，就是约瑟夫环号，如下图
 */
public class 约瑟夫问题 {
	static final int Num = 41;
	static final int KillMan = 3;

	static void josephus(int alive) {
		// alive为要存活的人的个数
		int man[] = new int[Num]; // 声明一个数组
		int pose = -1; // 指针
		int i = 0;
		int count = 1;
		while (count <= Num) {
			do {
				pose = (pose + 1) % Num;
				if (man[pose] == 0) { // 等于0没有自杀
					i++;
					if (i == KillMan) { // 数到3的人自杀
						i = 0;
						break;
					}
				}
			} while (true);
			man[pose] = count;
			System.out.printf("第%2d个自杀的人约瑟夫环号为:%2d", man[pose], pose + 1);
			if (count % 2 == 1) {
				System.out.printf("->");
			} else {
				System.out.printf("->\n"); // 控制输出格式
			}
			count++; // 自杀人加1
		}
		System.out.println("/n");
		System.out.printf("这%d需要存活的人的初始序号应排列在以下序号:\n", alive);
		alive = Num - alive;
		for (i = 0; i < Num; i++) {
			if (man[i] > alive) { // 最后两个自杀的人存活
				System.out.printf("初始编号为：%d", i + 1);
			}
		}
		System.out.printf("\n");
	}

	public static void main(String args[]) {
		josephus(2); // 演示
	}
}