package 编程大题;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 *类描述：牛牛在二维坐标系中画了N个点，且都是整点。现在牛牛想画出一个矩形，使得这N个点都在矩形内或者在矩形上。
		矩形的边均平行于坐标轴。牛牛希望矩形的面积最小。请你帮助牛牛计算下最小矩形的面积。
 *@author: XuYunXuan
 *@date： 日期：2017年3月24日 时间：下午5:14:57
 *
 */
public class T23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int xMax = Integer.MIN_VALUE;
		int yMax = Integer.MIN_VALUE;
		int xMin = Integer.MAX_VALUE;
		int yMin = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ;i++){
			int x = in.nextInt();
			int y = in.nextInt();
			yMax = y>yMax?y:yMax;
			yMin = y<yMin?y:yMin;
			xMax = x>xMax?x:xMax;
			xMin = x<xMin?x:xMin;
		}
		System.out.println((xMax-xMin)*(yMax-yMin));
	}
}


