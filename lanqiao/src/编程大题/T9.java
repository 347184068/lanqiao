package 编程大题;

import java.util.Scanner;

/**
 * 你听说过角谷猜想吗？ 任意的正整数，比如 5， 我们从它开始，如下规则计算： 如果是偶数，则除以2，如果是奇数，则乘以3再加1. 如此循环，最终必会得到“1” !
 * 
 * 比如 5 的处理过程是： 5 16 8 4 2 1
 * 
 * 一个正整数经过多少步才能变成1， 称为角谷步数。 对于5而言，步数也是5 对于1，步数为0
 * 
 * 本题的要求是，从标准输入给定一个整数n（1<n<300）表示角谷步数 求满足这个角谷步数的最小的正整数
 * 
 * 例如：
 * 
 * 输入： 3 则输出： 8
 * 
 * 输入： 4 则输出： 16
 * 
 * 输入： 7 则输出： 3
 * 
 * @author Lenovo
 *
 */
public class T9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(calc(n));
	}
	
	public static int calc(int n){
		for(int i = 1 ;; i++){
			if(n==c(i)){
				return i;
			}
		}
	}
	
	
	public static int c(int i){
		int count = 0 ;
		while(i!=1){
			if(i%2==0){
				i/=2;
			}else{
				i=i*3+1;
			}
			count++;
		}
		
		return count;
	}
}
