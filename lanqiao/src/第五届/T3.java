package 第五届;

import java.util.Scanner;

/**
 * 
 * 类描述： 标题：生物芯片
 * 
 * X博士正在研究一种生物芯片，其逻辑密集度、容量都远远高于普通的半导体芯片。
 * 
 * 博士在芯片中设计了 n 个微型光源，每个光源操作一次就会改变其状态，即：点亮转为关闭，或关闭转为点亮。
 * 
 * 这些光源的编号从 1 到 n，开始的时候所有光源都是关闭的。
 * 
 * 博士计划在芯片上执行如下动作：
 * 
 * 所有编号为2的倍数的光源操作一次，也就是把 2 4 6 8 ... 等序号光源打开
 * 
 * 所有编号为3的倍数的光源操作一次, 也就是对 3 6 9 ... 等序号光源操作，注意此时6号光源又关闭了。
 * 
 * 所有编号为4的倍数的光源操作一次。
 * 
 * .....
 * 
 * 直到编号为 n 的倍数的光源操作一次。
 * 
 * 
 * X博士想知道：经过这些操作后，某个区间中的哪些光源是点亮的。
 *
 * @author: XuYunXuan
 * @date： 日期：2017年5月21日 时间：下午7:19:47
 *
 */
public class T3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int L = in.nextInt();
		int R = in.nextInt();
		boolean light[] = new boolean[N+1];
		for (int i = 2; i <= N; i++) {
			for (int j = i; j <= N; j += i) {
				light[j] = !light[j];
			}
		}
		int count = 0;
		for (int i = L; i <= R; i++) {
			if(light[i]){
				count++;
			}
		}
		System.out.println(count);
	}
}
