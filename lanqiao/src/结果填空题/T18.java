package 结果填空题;

import java.util.Calendar;

/**
 * 18. 国庆星期日
 * 
 * 1949年的国庆节（10月1日）是星期六。 今年（2012）的国庆节是星期一。
 *  那么，从建国到现在，有几次国庆节正好是星期日呢？ 
 *  只要答案，不限手段！ 可以用windows日历，windows计算器，Excel公式，。。。。。
 *   当然，也可以编程！ 不要求写出具体是哪些年，只要一个数目！
 * 
 * @author Lenovo
 *
 */
public class T18 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int count = 0;
		for(int i = 1950 ; i <= 2012 ;i++){
			c.set(i, 9, 1);
			if(c.get(Calendar.DAY_OF_WEEK)-1==0){
				count++;
			}
		}
		System.out.println(count);
	}
}
