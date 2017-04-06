package 编程大题;

import java.util.Arrays;

public class T27 {
	/**
	 * 
	 *方法描述：
	 *@author: XuYunXuan
	 *@date： 日期：2017年4月5日 时间：下午6:40:33
	 *
	 */
	
	public static void main(String[] args) {
		for(int i = 100 ; i<=999;i++){
			for(int j = 100 ; j<=999;j++){
				int num1=i*(j%10);
				int num2=i*((j/10)%10);
				int num3=i*(j/100);
				int num4 = i*j;
				if(check(num1)==3&&check(num2)==3&&check(num3)==3&&check(num4)==5){
					int[] num = new int[10];
					String s = i+""+j+""+num1+""+num2+""+num3+""+num4;
					char[] array = s.toCharArray();
					for(char c : array){
						num[c-'0']++;
					}
					if(check2(num)){
						System.out.println(num4);
					}
				}
			}
		}
	}
	
	private static boolean check2(int[] num) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < num.length ;i++){
			if(num[i]!=2){
				return false;
			}
		}
		return true;
	}


	public static int check(int num){
		int count = 0;
		while(num!=0){
			num/=10;
			count++;
		}
		return count;
	}
}
