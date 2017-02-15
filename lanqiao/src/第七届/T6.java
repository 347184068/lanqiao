package 第七届;

/**
 * 方格填数
	如下的10个格子
	   +--+--+--+
	   |  |  |  |
	+--+--+--+--+
	|  |  |  |  |
	+--+--+--+--+
	|  |  |  |
	+--+--+--+
	（如果显示有问题，也可以参看【图1.jpg】）
	填入0~9的数字。要求：连续的两个数字不能相邻。
	（左右、上下、对角都算相邻）
	一共有多少种可能的填数方案？
	请填写表示方案数目的整数。
	注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
 * @author Lenovo
 *
 */
public class T6 {
	static int arr[][] = new int[3][4];
	static boolean num[] = new boolean[11];
	static boolean check[][] = new boolean[3][4];
	static boolean isMap[][] = new boolean[3][4];
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < isMap.length ;i++){
			for(int j = 0 ; j<isMap[i].length;j++){
				isMap[i][j]=true;
			}
		}
		isMap[0][0] = false;
		isMap[2][3] = false;
		dfs(0, 1);
		System.out.println(count);
	}

	public static boolean checkPos(int x, int y, int num) {
		//左
		if(y-1>=0&&isMap[x][y-1]==true){
			if(Math.abs(num-arr[x][y-1])<=1){
				return false;
			}
		}
		//上
		if(x-1>=0&&isMap[x-1][y]==true){
			if(Math.abs(num-arr[x-1][y])<=1){
				return false;
			}
		}
		if(y-1>=0&&x-1>=0&&isMap[x-1][y-1]==true){
			if(Math.abs(num-arr[x-1][y-1])<=1){
				return false;
			}
		}
		if(y+1<=3&&x-1>=0&&isMap[x-1][y+1]==true){
			if(Math.abs(num-arr[x-1][y+1])<=1){
				return false;
			}
		}
		return true;
	}

	public static void dfs(int x, int y) {
		if (x == 2 && y == 3) {
			count++;
			return;
		}

		for (int k = 0; k <= 9; k++) {
			if (!num[k] && checkPos(x, y, k)) {
				num[k] = true;
				arr[x][y] = k;
				if(y==3){
					dfs(x+1, 0);
				}else{
					dfs(x,y+1);
				}
				num[k] = false;
			}
		}
		
		

	}
}
