package com.carlyle.xiancheng.mianshi;

public class TestSync2 implements Runnable {
	   int b = 1001;          

	   synchronized void m1() throws InterruptedException {
	       b = 1000;
//	       Thread.sleep(500); //6
	       System.out.println("b=" + b);
	   }

	   synchronized void m2() throws InterruptedException {
	       Thread.sleep(250); //5
	       b = 2000;
	   }

	   public static void main(String[] args) throws InterruptedException {
	      
	       for(int i = 0 ; i < 5;i++){
	    	   TestSync2 tt = new TestSync2();
		       Thread t = new Thread(tt);  //1
		       t.start(); //2

		       tt.m2(); //3
		       System.out.println("main thread b=" + tt.b); //4
	       }
	   }

	   @Override
	   public void run() {
	       try {
	           m1();
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
	   }

	}