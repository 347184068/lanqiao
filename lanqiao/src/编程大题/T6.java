package 编程大题;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *从标准输入读入一个由字母构成的串（不大于30个字符）。
 * 
 * 从该串中取出3个不重复的字符，求所有的取法。
 * 
 * 取出的字符，要求按字母升序排列成一个串。
 * 
 * 不同的取法输出顺序可以不考虑。
 * 
 * @author Lenovo
 *
 */
public class T6 {
	
	static char a[] = new char[4];
	static int book[] = new int[4];
	static Set<Character> set  = new HashSet<Character>();
	static Object[] o=null;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] array = str.toCharArray();
		for(char c : array){
			set.add(c);
		}
		o = set.toArray();
		Arrays.sort(o);
		dfs(1);
	}
	private static void dfs(int step) {
		// TODO Auto-generated method stub
		if(step==4){
			if(a[1]!=a[2]&&a[2]!=a[3]&&a[1]!=a[3]){
				if(a[1]<a[2]&&a[2]<a[3]){
					System.out.println(""+a[1]+a[2]+a[3]);
				}
			}
			return;
		}
		for(int i = 0 ;i < o.length ;i++){
			if(book[step]==0){
				book[step] = 1;
				a[step] = (char) o[i];
				dfs(step+1);
				book[step] = 0;
			}
		}
		
		return ;
	}
}
