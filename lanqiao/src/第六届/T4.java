package 第六届;

import java.util.Scanner;

/**
 * 标题：穿越雷区
 * 
 * X星的坦克战车很奇怪，它必须交替地穿越正能量辐射区和负能量辐射区才能保持正常运转，否则将报废。 某坦克需要从A区到B区去（A，B区本身是安全区，没有正能量或负能量特征），怎样走才能路径最短？ 已知的地图是一个方阵，上面用字母标出了A，B区，其它区都标了正号或负号分别表示正负能量辐射区。 例如： A + - + - - + - - + - + + + - + - + - + B + - + - 坦克车只能水平或垂直方向上移动到相邻的区。 数据格式要求： 输入第一行是一个整数n，表示方阵的大小， 4<=n<100 接下来是n行，每行有n个数据，可能是A，B，+，-中的某一个，中间用空格分开。 A，B都只出现一次。 要求输出一个整数，表示坦克从A区到B区的最少移动步数。 如果没有方案，则输出-1 例如： 用户输入： 5 A + - + - - + - - + - + + + - + - + - + B + - + -
 * 
 * 则程序应该输出： 10
 * 
 * @author Lenovo
 *
 */
public class T4 {
	static String[][] map = new String[100][100];
	static boolean[][] book = new boolean[100][100];
	static boolean[][] isMap = new boolean[100][100];
	static int dir[][] = { { -1, 1, 0, 0 }, { 0, 0, -1, 1 } };
	static int n;
	static int count = 999999;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = in.next();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				isMap[i][j] = true;
			}
		}
		// System.out.println(map[4][0]);
		book[0][0] = true;
		dfs(0, 0, 0);
		System.out.println(count);
	}

	public static void dfs(int x, int y, int step) {
		if (map[x][y].equals("B")) {
			if (count > step) {
				count = step;
			}
			return;
		}

		for (int i = 0; i < 4; i++) {
			int dx = x + dir[0][i];
			int dy = y + dir[1][i];
			if (checkPos(x, y, dx, dy)) {
				book[dx][dy] = true;
				dfs(dx, dy, step + 1);
				book[dx][dy] = false;
			}
		}
	}

	public static boolean checkPos(int x, int y, int dx, int dy) {
		if (dx < 0 || dy < 0 || dx >= n || dy >= n)
			return false;
		else {
			if (isMap[dx][dy] == true && !map[x][y].equals(map[dx][dy]) && !book[dx][dy]) {
				return true;
			} else {
				return false;
			}
		}
	}
}
