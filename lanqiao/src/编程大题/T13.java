package 编程大题;

import java.util.Scanner;

/**
 * 
 30年的改革开放，给中国带来了翻天覆地的变化。2011全年中国手机产量约为11.72亿部。手机已经成为百姓的基本日用品！
 * 
 * 给手机选个好听又好记的号码可能是许多人的心愿。但号源有限，只能辅以有偿选号的方法了。
 * 
 * 这个程序的目的就是：根据给定的手机尾号（4位），按照一定的规则来打分。其规则如下：
 * 
 * 1. 如果出现连号，不管升序还是降序，都加5分。例如：5678,4321都满足加分标准。
 * 
 * 2. 前三个数字相同，或后三个数字相同，都加3分。例如：4888,6665,7777都满足加分的标准。注意：7777因为满足这条标准两次，所以这条规则给它加了6分。
 * 
 * 3. 符合AABB或者ABAB模式的加1分。例如：2255,3939,7777都符合这个模式，所以都被加分。注意：7777因为满足这条标准两次，所以这条标准给它加了2分。
 * 
 * 4. 含有：6，8，9中任何一个数字，每出现一次加1分。例如4326,6875,9918都符合加分标准。其中，6875被加2分；9918被加3分。
 * 
 * 尾号最终得分就是每条标准的加分总和！
 * 
 * 要求程序从标准输入接收数据，在标准输出上输出结果。
 * 
 * 输入格式为：第一行是一个整数n（<100），表示下边有多少输入行，接下来是n行4位一组的数据，就是等待计算加分的手机尾号。 输出格式为：n行整数。
 * 
 * 例如，
 * 输入： 14 3045 0211 2345 6543 7777 8888 7878 7788 6688 2424 2244 9918 6789 8866 
 * 则输出： 0 0 5 6 8 12 3 3 5 1 1 3 8 5
 * 
 * 注意：
 * 
 * 请仔细调试！您的程序只有能运行出正确结果的时候才有机会得分！
 * 
 * @author Lenovo
 *
 */
public class T13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n--!=0){
			String num = in.next();
			int score = calc(num);
			System.out.println(score);
		}
	}

	private static int calc(String num) {
		// TODO Auto-generated method stub
		int res = 0;
		char[] array = num.toCharArray();
		if(array[0]+1==array[1]&&array[1]+1==array[2]&&array[2]+1==array[3]){
			res+=5;
		}
		if(array[0]-1==array[1]&&array[1]-1==array[2]&&array[2]-1==array[3]){
			res+=5;
		}
		if(array[0]==array[1]&&array[0]==array[2]&&array[1]==array[2]){
			res+=3;
		}
		if(array[1]==array[2]&&array[1]==array[3]&&array[2]==array[3]){
			res+=3;
		}
		if(array[0]==array[1]&&array[2]==array[3]){
			res+=1;
		}
		if(array[0]==array[2]&&array[1]==array[3]){
			res+=1;
		}
		int c = 0;
		for(int i = 0 ; i < array.length ;i++){
			if(array[i]=='6'||array[i]=='8'||array[i]=='9'){
				c++;
			}
		}
		res+=c;
		return res;
	}
}
