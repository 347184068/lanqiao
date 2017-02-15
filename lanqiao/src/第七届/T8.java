package 第七届;

import java.util.Scanner;

/**
 * 四平方和
	四平方和定理，又称为拉格朗日定理：
	每个正整数都可以表示为至多4个正整数的平方和。
	如果把0包括进去，就正好可以表示为4个数的平方和。
	比如：
	5 = 0^2 + 0^2 + 1^2 + 2^2
	7 = 1^2 + 1^2 + 1^2 + 2^2（^符号表示乘方的意思）
	对于一个给定的正整数，可能存在多种平方和的表示法。
	要求你对4个数排序：
	0 <= a <= b <= c <= d
	并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法
 * @author Lenovo
 *
 */
public class T8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int a = 0; a < Math.sqrt(n);a++){
			for(int b = 0; b < Math.sqrt(n);b++){
				for(int c = 0; c < Math.sqrt(n);c++){
					for(int d = 0; d < Math.sqrt(n);d++){
						if(a<=b&&b<=c&&c<=d){
							if((a*a+b*b+c*c+d*d)==n){
								System.out.println(a+" "+b+" "+c+" "+d);
								return;
							}
						}
					}
				}
			}
		}
	}
}
