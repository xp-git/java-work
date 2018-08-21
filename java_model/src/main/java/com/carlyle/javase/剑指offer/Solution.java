package com.carlyle.javase.剑指offer;
	
//最佳答案：没有之一。思路：首先我们选择从左下角开始搜寻，(为什么不从左上角开始搜寻
//，左上角向右和向下都是递增，那么对于一个点，对于向右和向下会产生一个岔路；如果我们
//选择从左下脚开始搜寻的话，如果大于就向右，如果小于就向下)。
/**
 * 
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
 * 
 * */
public class Solution {
	
	public boolean Find(int[][] array, int target) {
		
		int len = array.length - 1;
		int i = 0;
		
		while ((len >= 0) && (i < array[0].length)) {
			if (array[len][i] > target) {
				len--;
			} else if (array[len][i] < target) {
				i++;
			} else {
				return true;
			}
		}
		
		return false;
	}
}
