package 第七届决赛;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T4 {

	static int n;
	static int map[][];
	static boolean book[][];
	static int col[];
	static int row[];
	static int dir[][] = { { -1, 1, 0, 0 }, { 0, 0, -1, 1 } };
	static int colTemp[];
	static int rowTemp[];
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		map = new int[n][n];
		book = new boolean[n][n];
		col = new int[n];
		row = new int[n];
		colTemp = new int[n];
		rowTemp = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = count++;
			}
		}
		for (int i = 0; i < n; i++) {
			col[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			row[i] = in.nextInt();
		}
		colTemp[0]++;
		rowTemp[0]++;
		book[0][0] = true;
		list.add(map[0][0]);
		dfs(0, 0);
	}

	public static void dfs(int x, int y) {
		if (x == n - 1 && y == n - 1) {
			if(checkIsTrue()){
				System.out.println(list);
			}
			return;
		}

		for (int i = 0; i < 4; i++) {
			int dx = x + dir[0][i];
			int dy = y + dir[1][i];
			if (checkPos(dx, dy)&&!book[dx][dy]) {
				colTemp[dy]++;
				rowTemp[dx]++;
				book[dx][dy] = true;
				list.add(map[dx][dy]);
				dfs(dx,dy);
				book[dx][dy] = false;
				list.remove(list.size()-1);
				colTemp[dy]--;
				rowTemp[dx]--;
			}
		}

	}

	private static void cleanArray() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < n ;i++){
			colTemp[i] = 0;
			rowTemp[i] = 0;
		}
	}

	private static boolean checkIsTrue() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < n ;i++){
			if(col[i]!=colTemp[i]){
				return false;
			}
		}
		for(int i = 0 ; i < n ;i++){
			if(row[i]!=rowTemp[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean checkPos(int dx, int dy) {
		if (dx < 0 || dy < 0 || dx >= n || dy >= n) {
			return false;
		} else {
			return true;
		}
	}

}
