package 代码填空;

import java.util.Scanner;

/**
 * 猜数字
 * 
 * 很多人都玩过这个游戏：甲在心中想好一个数字，乙来猜。
 * 每猜一个数字，甲必须告诉他是猜大了，猜小了，还是刚好猜中了。
 * 下列的代码模拟了这个过程。 其中用户充当甲的角色，计算机充当乙的角色。为了能更快地猜中，计算机使用了二分法。 阅读分析代码，填写缺失的部分。
 * 
 * @author Lenovo
 *
 */
public class T3 {
	public static void main(String[] args) {
		System.out.println("请在心中想好一个数字（1~100），我来猜");
		System.out.println("我每猜一个数字，你要告诉我是“猜大了”，“猜小了”，还是“猜中”");
		Scanner scan = new Scanner(System.in);
		int v1 = 1;
		int v2 = 100;
		for (;;) {
			int m = (v1 + v2) / 2;
			System.out.println("我猜是：" + m);
			System.out.println("1.猜得太大了");
			System.out.println("2.猜得太小了");
			System.out.println("3.猜中！");
			System.out.print("请选择：");
			int user = Integer.parseInt(scan.nextLine());
			if (user == 3)
				break;
			if (user == 1)
				v2 = m - 1;
			if (user == 2)
				v1 = m + 1;
		}
	}
}
