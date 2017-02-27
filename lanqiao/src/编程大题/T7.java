package 编程大题;

import java.util.Scanner;

/**
 * 
 * 
 * 本题的任务就是从标准输入获得一个整数n(1<n<100) 程序则生成嵌套着的回字型星号方框。其最外层方框的边长为n
 * 
 * 例如： 输入： 5 程序输出：
 *	*****
 * 	*	*
 * 	* *	*
 * 	* 	*
 *	*****
 * 
 * @author Lenovo
 *
 */
public class T7 {
	
	static int n;
	static char[][] map;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		map = new char[n][n];
		fill(0);
		show();
	}
	private static void show() {
		// TODO Auto-generated method stub
		for(char[] c : map){
			for(char t : c){
				System.out.print(t);
			}
			System.out.println();
		}
	}
	private static void fill(int step) {
		// TODO Auto-generated method stub
		//横
		if(step>=n){
			return;
		}
		for(int i = step;i < n -step;i++){
			map[step][i] = '*';
			map[i][step] = '*';
			map[n-1-step][i] = '*';
			map[i][n-1-step] = '*';
		}
		
		fill(step+2);
		
		return;
	}

}
