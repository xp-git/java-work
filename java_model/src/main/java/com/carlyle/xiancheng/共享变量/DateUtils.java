package com.carlyle.xiancheng.共享变量;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	 private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
	        @Override
	        protected DateFormat initialValue() {
	            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        }
	    };

	    public static Date parse(String dateStr) throws ParseException {
	        return threadLocal.get().parse(dateStr);
	    }

	    public static String format(Date date) {
	        return threadLocal.get().format(date);
	    }
	    public static void main(String[] args) throws Exception {
			System.out.println(parse("2018-06-11 11:00:23"));
			for(int i = 0 ;  i< 10 ; i++){
				
				new Thread() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try {
							System.out.println(parse("2018-06-11 11:00:23"));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}.start();
			}
		}
}
