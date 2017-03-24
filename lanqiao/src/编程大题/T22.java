package 编程大题;

import java.util.Scanner;
/**
 * 
 *类描述：牛牛有两个字符串（可能包含空格）,牛牛想找出其中最长的公共连续子串,希望你能帮助他,并输出其长度。
 *@author: XuYunXuan
 *@date： 日期：2017年3月24日 时间：下午5:14:46
 *
 */
public class T22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		int sum = 0;
		for(int i = 0 ; i < a.length() ;i++){
			for(int j = 1 ; i+j <= a.length() ;j++){
				String t = a.substring(i,i+j);
				if(b.contains(t)){
					if(j>sum){
						sum = j;
					}
				}
			}
		}
		
		System.out.println(sum);
	}
}
