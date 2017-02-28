package 编程大题;

import java.util.Scanner;

/**
 * 方阵的主对角线之上称为“上三角”。 请你设计一个用于填充n阶方阵的上三角区域的程序。 填充的规则是：使用1，2，3….的自然数列，从左上角开始，按照顺时针方向螺旋填充。 例如： 当n=3时，输出： 1 2 3 6 4 5 当n=4时，输出： 1 2 3 4 9 10 5 8 6 7 当n=5时，输出： 1 2 3 4 5 12 13 14 6 11 15 7 10 8 9
 * 
 * 程序运行时，从标准输入获得整数n（3~20） 程序输出：方阵的上三角部分。 要求格式：每个数据宽度为4，右对齐。
 * 
 * @author Lenovo
 *
 */
public class T11 {

	static int num = 1;
	static int n;
	static int map[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		map = new int[n + 1][n + 1];
		fill(1);
		show();
	}

	private static void show() {
		// TODO Auto-generated method stub
		for (int[] i : map) {
			for (int t : i) {
				if(t!=0){
					System.out.print(t + " ");
				}
			}
			System.out.println();
		}
	}

	private static void fill(int step) {
		// TODO Auto-generated method stub
		if (num > n * (n + 1) / 2) {
			return;
		}
		for (int i = step, j = step; j <= n - (step - 1) * 2; j++)
			// 横向向右赋值
			map[i][j] = num++;
		for (int i = step + 1, j = n - (step - 1) * 2 - 1; i <= n - (step - 1) * 2 && j >= step; i++, j--)
			// 对角线左下向赋值
			map[i][j] = num++;
		for (int i = n - (step - 1) * 2 - 1, j = step; i >= step + 1; i--)
			// 竖向向上赋值
			map[i][j] = num++;
		fill(step + 1);
		return;

	}
}
