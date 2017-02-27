package 编程大题;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 在某些应用中，为了支持灵活性，往往用到自定义的公式。
 * 
 * 比如，有如下的原始公式集合：
 * 
 * int add(int x, int y): 返回x与y的和
 * 
 * int add(int x, int y, int z): 返回x,y,z三个数的和
 * 
 * int min(int x, int y): 返回x,y中较小的值
 * 
 * int max(int x, int y): 返回x,y中较大的值
 * 
 * int doubleMe(int x): 返回 x 的2倍
 * 
 * 给出一个自定义公式串
 * 
 * add(min(5,3),max(2,8),add(1,doubleMe(1)))
 * 
 * 通过手工计算可以得出结果为：14
 * 
 * 本题的任务是：编写一个解析程序，能够对由上述原始公式任意组合出来的公式计算其结果。也就是输入一个自定义公式串，输出它的计算结果（可以不考虑输入公式本身有语法错误的情况）。
 * 
 * 输入的公式串中可以含有多余的空格，类似：
 * 
 * add( min(5, 3) , max(2 , 8) ) 也是合法的公式。
 * 
 * @author Lenovo
 *
 */
public class T8 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String method = in.nextLine();
		clac(method);
	}
	
	private static void clac(String method) {
		// TODO Auto-generated method stub
		String op = method.substring(0,method.indexOf("("));
		String param = method.substring(method.indexOf("(")+1,method.lastIndexOf(")"));
		
		
	}

	public static int add(int x, int y){
		return x+y;
	}
	public static int add(int x, int y, int z){
		return x+y+z;
	}
	public static int min(int x, int y){
		return x>y ? y : x;
	}
	public static int max(int x, int y){
		return x>y ? x :y;
	}
	public static int doubleMe(int x){
		return x*2;
	}

}
