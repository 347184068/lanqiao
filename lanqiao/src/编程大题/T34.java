package 编程大题;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 *类描述：
 *在X星系的广袤空间中漂浮着许多X星人造“炸弹”，用来作为宇宙中的路标。
 * 每个炸弹都可以设定多少天之后爆炸。 比如：阿尔法炸弹2015年1月1日放置，定时为15天，则它在2015年1月16日爆炸。
 *  有一个贝塔炸弹，2014年11月9日放置，定时为1000天，请你计算它爆炸的准确日期。  
请填写该日期，格式为 yyyy-mm-dd  即4位年份2位月份2位日期。比如：2015-02-19 请严格按照格式书写。不能出现其它文字或符号
 *@author: XuYunXuan
 *@date： 日期：2017年4月6日 时间：下午8:16:24
 *
 */
public class T34 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//2014/11/9
		calendar.set(Calendar.DAY_OF_MONTH, 9);  //设置日期  
        calendar.set(Calendar.MONTH, 10 );  
        calendar.set(Calendar.YEAR, 2014);          
		System.out.println(calendar.getTime().toLocaleString());
		calendar.add(Calendar.DATE, 1000);
		System.out.println(calendar.getTime().toLocaleString());
	}
}
