package 编程大题;

import java.util.Scanner;

/**
 * 牛牛想在[a, b]区间内找到一些数满足可以被一个整数c整除,现在你需要帮助牛牛统计区间内一共有多少个这样的数满足条件？
 */
public class T19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int count = 0;
		int t = 0;
		for(int i = a ; i <= b ;i++){
			if(i%c==0){
				t = i;
				break;
			}
		}
		for(int i = t ; i <= b ;i+=c){
			count++;
		}
		System.out.println(count);
	}

}
