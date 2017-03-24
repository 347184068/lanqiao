package 编程大题;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 *类描述：牛牛有N个字符串，他想将这些字符串分类，他认为两个字符串A和B属于同一类需要满足以下条件：
		A中交换任意位置的两个字符，最终可以得到B，交换的次数不限。比如：abc与bca就是同一类字符串。
		现在牛牛想知道这N个字符串可以分成几类。
 *@author: XuYunXuan
 *@date： 日期：2017年3月24日 时间：下午5:14:16
 *
 */
public class T21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashSet<String> hs = new HashSet<String>();
		for(int i = 0 ; i < n ;i++){
			String t = in.next();
			char[] array = t.toCharArray();
			Arrays.sort(array);
			StringBuilder sb = new StringBuilder();
			for(char c :array){
				sb.append(c);
			}
			hs.add(sb.toString());
		}
		System.out.println();
	}
	

}
