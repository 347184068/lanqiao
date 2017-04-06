package 编程大题;

import java.util.Arrays;
import java.util.Scanner;

public class T25 {

	/**
	 * 
	 * 方法描述： 【题目描述 - Problem Description】
	 * 
	 * 有N个瓶子，编号 1 ~ N，放在架子上。
	 * 
	 * 比如有5个瓶子：
	 * 
	 * 2 1 3 5 4
	 * 要求每次拿起2个瓶子，交换它们的位置。
	 * 
	 * 经过若干次后，使得瓶子的序号为：
	 * 
	 * 1 2 3 4 5
	 * 对于这么简单的情况，显然，至少需要交换2次就可以复位。
	 * 
	 * 如果瓶子更多呢？你可以通过编程来解决。
	 * 输入格式为两行：
	 * 
	 * 第一行: 一个正整数N（N<10000）, 表示瓶子的数目
	 * 
	 * 第二行：N个正整数，用空格分开，表示瓶子目前的排列情况。
	 * 
	 * 输出数据为一行一个正整数，表示至少交换多少次，才能完成排序。
	 *
	 * @author: XuYunXuan
	 * @date： 日期：2017年4月5日 时间：上午8:57:34
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < arr.length ;i++){
			arr[i] = in.nextInt();
		}
		int count = 0;
		for(int i = 0 ; i < arr.length - 1 ;i++){
			int index = i;
			for(int j = i+1 ;j < arr.length ;j++){
				if(arr[index]>arr[j]){
					index = j;
				}
			}
			if(i!=index){
				swap(arr,index,i);
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
	
	
	public static void swap(int []a ,int i ,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
