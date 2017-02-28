package 编程大题;

import java.util.Scanner;

/**
 * 
 当你输入信用卡号码的时候，有没有担心输错了而造成损失呢？其实可以不必这么担心，因为并不是一个随便的信用卡号码都是合法的，它必须通过Luhn算法来验证通过。
 * 
 * 该校验的过程：
 *  1、从卡号最后一位数字开始，逆向将奇数位(1、3、5等等)相加。 
 *  2、从卡号最后一位数字开始，逆向将偶数位数字，先乘以2（如果乘积为两位数，则将其减去9），再求和。 
 *  3、将奇数位总和加上偶数位总和，结果应该可以被10整除。
 * 
 * 例如，卡号是：5432123456788881
 * 
 * 
 * 逆向奇数位为 4 2 2 4 6 8 8 1 和 = 35 
 * 逆向偶数位乘以2（有些要减去9）的结果：1 6 2 6 1 5 7 7，求和 = 35。
 *  最后 35 + 35 = 70 可以被10整除，认定校验通过。
 * 
 * 请编写一个程序，从标准输入获得卡号，然后判断是否校验通过。 通过显示：“成功”，否则显示“失败”。
 * 
 * 比如， 输入：356827027232780 程序输出：成功
 * 
 * @author Lenovo
 *
 */
public class T15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(val(s));
	}
	
	private static String val(String s) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
		int sum1= 0,sum2=0;
		for(int i = charArray.length-1 ; i >=0 ;i-=2){
			sum1+=(int)(charArray[i]-'0');
		}
		for(int i = charArray.length-2 ; i >=0 ;i-=2){
			int temp =(int)(charArray[i]-'0')*2;
			if(count(temp)==2){
				temp-=9;
			}
			sum2+=temp;
		}
		return (sum1+sum2)%10==0?"成功":"失败";
	}

	private static int count(int i){
		int res = 0;
		while(i!=0){
			i/=10;
			res++;
		}
		return res;
	}

}
