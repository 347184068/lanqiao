package 编程大题;

import java.util.Scanner;
/**
 * 
 *类描述：牛牛手里有N根木棒,分别编号为1~N,现在他从N根里想取出三根木棒，使得三根木棒构成一个三角形,你能计算出牛牛有多少种取法吗?(考虑两种取法中使用的木棒编号有一个不一样就认为是不同的取法)。
 *@author: XuYunXuan
 *@date： 日期：2017年3月24日 时间：下午5:13:01
 *
 */
public class T20 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []arr = new int[n];
		int count=0;
		for(int i = 0 ; i < n ;i++){
			arr[i] = in.nextInt();
		}
		for(int i = 0 ; i < arr.length ;i++){
			for(int j = i+1 ; j < arr.length ;j++){
				for(int k = j+1 ; k < arr.length ;k++){
					if(check(arr[i],arr[j],arr[k])){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static boolean check(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j>k&&i+k>j&&j+k>i;
	}
	
	

}
