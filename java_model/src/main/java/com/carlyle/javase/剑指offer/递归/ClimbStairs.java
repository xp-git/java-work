package com.carlyle.javase.剑指offer.递归;


public class ClimbStairs {
//  **************************************************************
    public int climbStairs(int n) {
        int i=1;
         if(n<=0)
            return 0;
         if(n==1){
             return i;
         }
         if(n==2){
             i++;
             return i;
         }
         else
             return climbStairs(n-1)+climbStairs(n-2);
   }
//**************************************************************
     public static void main(String []args){
         ClimbStairs cs=new ClimbStairs();
         int a =cs.climbStairs(5);
         System.out.println(a);
     }

}