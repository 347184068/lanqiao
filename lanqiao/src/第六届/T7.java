package 第六届;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 
 *类描述：
		标题：表格计算
		
		某次无聊中， atm 发现了一个很老的程序。这个程序的功能类似于 Excel ，它对一个表格进行操作。
		不妨设表格有 n 行，每行有 m 个格子。
		每个格子的内容可以是一个正整数，也可以是一个公式。
		公式包括三种：
		1. SUM(x1,y1:x2,y2) 表示求左上角是第 x1 行第 y1 个格子，右下角是第 x2 行第 y2 个格子这个矩形内所有格子的值的和。
		2. AVG(x1,y1:x2,y2) 表示求左上角是第 x1 行第 y1 个格子，右下角是第 x2 行第 y2 个格子这个矩形内所有格子的值的平均数。
		3. STD(x1,y1:x2,y2) 表示求左上角是第 x1 行第 y1 个格子，右下角是第 x2 行第 y2 个格子这个矩形内所有格子的值的标准差。
		
		标准差即为方差的平方根。
		方差就是：每个数据与平均值的差的平方的平均值，用来衡量单个数据离开平均数的程度。
		
		公式都不会出现嵌套。
		
		如果这个格子内是一个数，则这个格子的值等于这个数，否则这个格子的值等于格子公式求值结果。
		
		输入这个表格后，程序会输出每个格子的值。atm 觉得这个程序很好玩，他也想实现一下这个程序。
		
		「输入格式」
		第一行两个数 n, m 。
		接下来 n 行输入一个表格。每行 m 个由空格隔开的字符串，分别表示对应格子的内容。
		输入保证不会出现循环依赖的情况，即不会出现两个格子 a 和 b 使得 a 的值依赖 b 的值且 b 的值依赖 a 的值。
		
		「输出格式」
		输出一个表格，共 n 行，每行 m 个保留两位小数的实数。
		数据保证不会有格子的值超过 1e6 。
		
		「样例输入」
		3 2
		1 SUM(2,1:3,1)
		2 AVG(1,1:1,2)
		SUM(1,1:2,1) STD(1,1:2,2)
		
		「样例输出」
		1.00 5.00
		2.00 3.00
		3.00 1.48
		
		「数据范围」
		对于 30% 的数据，满足： n, m <= 5
		对于 100% 的数据，满足： n, m <= 50
		
		
		资源约定：
		峰值内存消耗（含虚拟机） < 512M
		CPU消耗  < 2000ms
		
		
		请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
		
		所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
		注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
		注意：主类的名字必须是：Main，否则按无效代码处理。
 *@author: XuYunXuan
 *@date： 日期：2017年5月14日 时间：下午5:11:23
 *
 */
public class T7 {

	static int n;
	static int m;
	static String[][] string;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		string = new String[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				string[i][j] = in.next();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(calc(string[i][j]) + " ");
			}
			System.out.println();
		}

	}

	private static Double calc(String s) {
		// TODO Auto-generated method stub
		if (!isNumber(s)) {
			String temp = s.substring(4, s.length() - 1);
			temp = temp.replace(":", ",");
			String[] split = temp.split(",");
			int x1 = Integer.parseInt(split[0]) - 1;
			int y1 = Integer.parseInt(split[1]) - 1;
			int x2 = Integer.parseInt(split[2]) - 1;
			int y2 = Integer.parseInt(split[3]) - 1;
			if (s.startsWith("SUM")) {
				double t = 0;
				for (int i = x1; i <= x2; i++) {
					for (int j = y1; j <= y2; j++) {
						t += Double.parseDouble(calc(string[i][j]) + "");
					}
				}
				return format(t);
			} else if (s.startsWith("AVG")) {
				double t = 0;
				int count = 0;
				for (int i = x1; i <= x2; i++) {
					for (int j = y1; j <= y2; j++) {
						t += Double.parseDouble(calc(string[i][j]) + "");
						count++;
					}
				}
				return format(t / count);
			} else {
				double t = 0;
				int count = 0;
				for (int i = x1; i <= x2; i++) {
					for (int j = y1; j <= y2; j++) {
						t += Double.parseDouble(calc(string[i][j]) + "");
						count++;
					}
				}
				double avg = t / count;
				t = 0;
				for (int i = x1; i <= x2; i++) {
					for (int j = y1; j <= y2; j++) {
						t += (Double.parseDouble(calc(string[i][j]) + "") - avg) * (Double.parseDouble(calc(string[i][j]) + "") - avg);
					}
				}
				return format(Math.sqrt(t / count));
			}
		} else {
			double f = Double.parseDouble(s);
			double f1 = format(f);
			return f1;
		}
	}

	private static double format(double f) {
		BigDecimal b = new BigDecimal(f);
		double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return f1;
	}

	public static boolean isNumber(String s) {
		if (s.contains("SUM") || s.contains("AVG") || s.contains("STD")) {
			return false;
		} else {
			return true;
		}
	}

}
