package com.carlyle.javase.剑指offer.字符串;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。 
 * 
 * Hello world
 * 
 * 
 * 5
 * 
 * */
public class StrLastWordLength {

	
	
	
	public static void main(String[] args) {
		 System.out.println( Math.max(4, 6)+"字符："+lengthOfLongestSubstring("abcdefacd"));
		
		String str = "   333 hello world  ";
		System.out.println("==="+str.trim().substring(str.trim().lastIndexOf(" ")).length());
		System.out.println("==="+lengthOfLongestSubstring("oworld"));
		
		System.out.println("abs绝对值==="+Math.abs(11));
		System.out.println("abs==="+(2<<1));
		
		Scanner input = new Scanner(System.in);
        String s="";
        while(input.hasNextLine()){
            s=input.nextLine();
            System.out.println(s.length()-1-s.lastIndexOf(" "));
        }    
       
	}
	
	public static int lengthOfLongestSubstring(String s) {  
	    if(s.equals("")){  
	        return 0;  
	    }  
	    int maxLength = 1;//排除了空串的情况下，最小长度就为1  
	    int i = 0;  
	    int j = 0;  
	    boolean[] map = new boolean[300];//标记数组  
	    char[] charArray = s.toCharArray();//转换为字符数组  
	    map[charArray[0]] = true;//第一个先设为有  
	    while(j < s.length() - 1){  
	        j++;  
	        while (map[charArray[j]]){//当j遇到某个之前已经出现过的字符，则i++只到跳过那个字符  
	            map[charArray[i]] = false;  
	            i++;  
	        }  
	        map[charArray[j]] = true;//子序列中新增一个字符  
	        maxLength = Math.max(maxLength, j - i + 1);//维护maxLength  
	    }  
	    return maxLength;  
	}  

}
