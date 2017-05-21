package 第五届;

import java.util.Scanner;

/**
 * 
 * 类描述： 标题：Log大侠
 * 
 * atm参加了速算训练班，经过刻苦修炼，对以2为底的对数算得飞快，人称Log大侠。
 * 
 * 一天，Log大侠的好友 drd 有一些整数序列需要变换，Log大侠正好施展法力...
 * 
 * 变换的规则是： 对其某个子序列的每个整数变为: [log_2 (x) + 1] 其中 [] 表示向下取整， 
 * 就是对每个数字求以2为底的对数，然后取下整。 例如对序列 3 4 2 操作一次后，这个序列会变成 2 3 2。
 * 
 * drd需要知道，每次这样操作后，序列的和是多少。
 * 
 * 【输入格式】 第一行两个正整数 n m 。 第二行 n 个数，表示整数序列，都是正数。 接下来 m 行，每行两个数 L R 表示 atm 这次操作的是区间 [L, R]，数列序号从1开始。
 * 
 * 【输出格式】 输出 m 行，依次表示 atm 每做完一个操作后，整个序列的和。
 *
 * @author: XuYunXuan
 * @date： 日期：2017年5月21日 时间：下午7:29:50
 *
 */
public class T4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int arr[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			int L = in.nextInt();
			int R = in.nextInt();
			int sum = 0;
			sum = calcSum(arr, L, R, sum);
			System.out.println(sum);
		}
	}

	private static int calcSum(int[] arr, int L, int R, int sum) {
		for (int j = L; j <= R; j++) {
			sum+=trans(arr[j]);
		}
		return sum;
	}

	public static double trans(int i) {
		return (int) Math.floor((Math.log(i) / Math.log(2))+1);
	}
}
