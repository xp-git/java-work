package com.carlyle.javase.剑指offer.递归;

public class TestDemo {  
	  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {          
            System.out.println(sum(3));  
    }  
    /** 
     * @param 求和方法 
     */  
    public static int sum(int num){  
        if(num == 1){  
            return 1;  
        }  
        System.out.println("只："+num);
        return num + sum(num-1);  
          
    }  
  
} 