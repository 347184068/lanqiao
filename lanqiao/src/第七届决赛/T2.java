package 第七届决赛;

/**
 * 
 * 类描述： 反幻方
 * 
 * 我国古籍很早就记载着
 * 
 * arr[0] arr[1] arr[2]
 * arr[3] arr[4] arr[5]
 * arr[6] arr[7] arr[8]
 * 
 * 2 9 4 
 * 7 5 3 
 * 6 1 8
 * 
 * 这是一个三阶幻方。每行每列以及对角线上的数字相加都相等。
 * 
 * 下面考虑一个相反的问题。 可不可以用 1~9 的数字填入九宫格。 使得：每行每列每个对角线上的数字和都互不相等呢？
 *
 * @author: XuYunXuan
 * @date： 日期：2017年4月18日 时间：下午4:52:21
 *
 */
public class T2 {
	static int n = 0;
	static int []book = new int[10];
	static int []arr = new int[10];
	public static void main(String[] args) {
		dfs(0);
		System.out.println(n/8);
	}
	private static void dfs(int step) {
		// TODO Auto-generated method stub
		if(step==9){
			if(check()){
				n++;
			}
			return;
		}
		
		for(int i = 1 ; i <= 9 ;i++){
			if(book[i]==0){
				book[i] = 1;
				arr[step] = i;
				dfs(step+1);
				book[i] = 0;
			}
		}
		return ;
	}
//	arr[0] arr[1] arr[2]
//	arr[3] arr[4] arr[5]
//	arr[6] arr[7] arr[8]
	private static boolean check() {
		// TODO Auto-generated method stub
		int num1 = arr[0]+arr[1]+arr[2];
		int num2 = arr[3]+arr[4]+arr[5];
		int num3 = arr[6]+arr[7]+arr[8];
		int num4 = arr[0]+arr[3]+arr[6];
		int num5 = arr[1]+arr[4]+arr[7];
		int num6 = arr[2]+arr[5]+arr[8];
		int num7 = arr[0]+arr[4]+arr[8];
		int num8 = arr[2]+arr[4]+arr[6];
		if(num1!=num2&&num1!=num3&&num1!=num4&&num1!=num5&&num1!=num6&&num1!=num7&&num1!=num8&&
				num2!=num3&&num2!=num4&&num2!=num5&&num2!=num6&&num2!=num7&&num2!=num8&&
				num3!=num4&&num3!=num5&&num3!=num6&&num3!=num7&&num3!=num8&&
				num4!=num5&&num4!=num6&&num4!=num7&&num4!=num8&&
				num5!=num6&&num5!=num7&&num5!=num8&&
				num6!=num7&&num6!=num8&&
				num7!=num8){
			return true;
		}else{
			return false;
		}
	}
}
