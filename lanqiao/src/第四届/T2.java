package 第四届;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 类描述：
 *
 * 标题：连续奇数和
 * 
 * 小明看到一本书上写着：任何数字的立方都可以表示为连续奇数的和。
 * 
 * 比如：
 * 
 * 2^3 = 8 = 3 + 5 3^3 = 27 = 7 + 9 + 11 4^3 = 64 = 1 + 3 + ... + 15
 * 
 * 虽然他没有想出怎么证明，但他想通过计算机进行验证。
 * 
 * 请你帮助小明写出 111 的立方之连续奇数和表示法的起始数字。如果有多个表示方案，选择起始数字小的方案。
 * 
 * 请严格按照要求，通过浏览器提交答案。 注意：只提交一个整数，不要写其它附加内容，比如：说明性的文字。
 *
 * @author: XuYunXuan
 * @date： 日期：2017年5月20日 时间：上午9:18:15
 *
 */
public class T2 {
	//奇数等差数列
	//an = 2*n-1 ;  sn = n^2;
	public static void main(String[] args) {
		int num = 111;
		for (int i = 1; i <= 2000; i++) {
			for (int j = i; j <= 2000; j++) {
				if (j * j - (i - 1) * (i - 1) == 111 * 111 * 111) {
					System.out.println(2*i-1);
				}
			}
		}

	}
}
