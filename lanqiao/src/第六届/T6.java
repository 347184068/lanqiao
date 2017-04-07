package 第六届;

import java.util.Scanner;

/**
 * 
 * 类描述： 移动距离
 * 
 * X星球居民小区的楼房全是一样的，并且按矩阵样式排列。其楼房的编号为1,2,3... 当排满一行时，从下一行相邻的楼往反方向排号。 比如：当小区排号宽度为6时，开始情形如下：
 * 
 * 1 2 3 4 5 6 12 11 10 9 8 7 13 14 15 .....
 * 
 * 我们的问题是：已知了两个楼号m和n，需要求出它们之间的最短移动距离（不能斜线方向移动）
 * 
 * 输入为3个整数w m n，空格分开，都在1到10000范围内 w为排号宽度，m,n为待计算的楼号。 要求输出一个整数，表示m n 两楼间最短移动距离。
 * 
 * 例如： 用户输入： 6 8 2 则，程序应该输出： 4
 * 
 * 再例如： 用户输入： 4 7 20 则，程序应该输出： 5
 * 
 * 资源约定： 峰值内存消耗 < 256M CPU消耗 < 1000ms
 *
 * @author: XuYunXuan
 * @date： 日期：2017年4月7日 时间：下午2:58:46
 *
 */
public class T6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[10002][10002];
		int w = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int count = 1;
		int i = 0;
		while(count<=10000&&i<10002){
			for(int j = 0 ; j < w ;j++){
				if(i%2==0){
					arr[i][j] = count++;
				}else{
					arr[i][w-j-1] = count++;
				}
			}
			i++;
		}
		int mx = 0,my = 0;
		int nx = 0,ny = 0;
		for(int t = 0 ; t <= i ;t++){
			for(int j = 0 ; j < w ;j++){
				if(arr[t][j]==m){
					mx = t;
					my = j;
				}
				if(arr[t][j]==n){
					nx = t;
					ny = j;
				}
			}
		}
		System.out.println(Math.abs(ny-my)+Math.abs(nx-mx));
	}
}
