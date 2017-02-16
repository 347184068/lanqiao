package 结果填空题;

import java.util.Scanner;

/**
 * 10. 土地测量
 * 
 * 造成高房价的原因有许多，比如土地出让价格。既然地价高，
 * 土地的面积必须仔细计算。遗憾的是，有些地块的形状不规则， 
 * 比如是如图【1.jpg】中所示的五边形。 
 * 一般需要把它划分为多个三角形来计算。 已知三边求三角形的面积需要用海伦定理， 
 * 参见【2.jpg】 各条边长数据如下： 
 * AB = 52.1 BC = 57.2 CD = 43.5 DE = 51.9 EA = 33.4 EB = 68.2 EC = 71.9 
 * 根据这些数据求五边形地块的面积。四舍五入到小数后两位。只写结果，不要源代码！
 * 
 * @author Lenovo
 *
 */
public class T10 {
	public static void main(String[] args) {
		double a,b,c,s,area=0;
		Scanner in = new Scanner(System.in);
	    int n=3;  
	    while(n--!=0)  
	    {  
	        a = in.nextDouble();
	        b = in.nextDouble();
	        c = in.nextDouble();
	        s=(a+b+c)/2;  
	        area+=Math.sqrt(s*(s-a)*(s-b)*(s-c));  
	    }  
	    System.out.println(area); 
	}
}
