package 第六届;

/**
 * 标题：分机号
	X老板脾气古怪，他们公司的电话分机号都是3位数，老板规定，所有号码必须是降序排列，且不能有重复的数位。比如：	
	751,520,321 都满足要求，而，
	766,918,201 就不符合要求。	
	现在请你计算一下，按照这样的规定，一共有多少个可用的3位分机号码？
	请直接提交该数字，不要填写任何多余的内容。
	120
 * @author Lenovo
 *
 */
public class T1 {
	public static void main(String[] args) {
		int count = 0;
		for(int a = 1 ; a <=9 ;a++){
			for(int b=0;b<=9;b++){
				for(int c=0;c<=9;c++){
					if(a>=b&&b>=c){
						if(a!=b&&b!=c&&a!=c){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
