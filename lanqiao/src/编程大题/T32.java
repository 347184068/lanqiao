package 编程大题;

import java.util.Scanner;

/**
 * 
 * 类描述： 小明正在玩一个“翻硬币”的游戏。 桌上放着排成一排的若干硬币。
 * 我们用 * 表示正面，用 o 表示反面（是小写字母，不是零）。 
 * 比如，可能情形是：**oo***oooo 如果同时翻转左边的两个硬币，
 * 则变为：oooo***oooo 
 * 现在小明的问题是：如果已知了初始状态和要达到的目标状态，每次只能同时翻转相邻的两个硬币,那么对特定的局面，最少要翻动多少次呢？ 
 * 我们约定：把翻动相邻的两个硬币叫做一步操作，
 * 那么要求： 程序输入： 两行等长的字符串，分别表示初始状态和要达到的目标状态。
 * 每行的长度<1000 
 * 程序输出： 一个整数，表示最小操作步数 
 * 例如： 用户输入：
 *  *********
 * o****o**** 
 * 程序应该输出： 5 
 * 再例如： 
 * 用户输入： 
 * o**o***o*** 
 * o***o**o*** 
 * 程序应该输出： 1
 * 
 * @author: XuYunXuan
 * @date： 日期：2017年4月6日 时间：下午7:50:15
 *
 */
public class T32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ss1 = in.next();
		String ss2 = in.next();
		char[] s1 = ss1.toCharArray();
		char[] s2 = ss2.toCharArray();
		int count  = 0;
		for(int i = 0 ; i < s1.length-1 ;i++){
			if(s1[i]!=s2[i]){
				count++;
				if(s1[i]=='o'){
					s1[i] = '*';
				}else{
					s1[i] = 'o';
				}
				if(s1[i+1]=='o'){
					s1[i+1] = '*';
				}else{
					s1[i+1] = 'o';
				}
			}
		}
		
		System.out.println(count);
	}
}
