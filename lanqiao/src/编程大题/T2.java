package 编程大题;

import java.util.Scanner;

/**
 * Excel是最常用的办公软件。每个单元格都有唯一的地址表示。比如：第12行第4列表示为：“D12”，第5行第255列表示为“IU5”。
 * 
 * 事实上，Excel提供了两种地址表示方法，还有一种表示法叫做RC格式地址。 第12行第4列表示为：“R12C4”，第5行第255列表示为“R5C255”。
 * 
 * 你的任务是：编写程序，实现从RC地址格式到常规地址格式的转换。
 * 
 * 【输入、输出格式要求】
 * 
 * 用户先输入一个整数n（n<100），表示接下来有n行输入数据。
 * 
 * 接着输入的n行数据是RC格式的Excel单元格地址表示法。
 * 
 * 程序则输出n行数据，每行是转换后的常规地址表示法。
 * 
 * 例如：用户输入： 2 R12C4 R5C255
 * 
 * 则程序应该输出： D12 IU5
 * 
 * @author Lenovo
 *
 */
public class T2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n--!=0){
			String rc = in.next();
			System.out.println(convert(rc));
		}
	}

	private static String convert(String rc) {
		// TODO Auto-generated method stub
		String row = rc.substring(1, rc.indexOf("C"));
		String col = rc.substring(rc.indexOf("C")+1);
		String normal = trans(col)+row;
		return normal;
	}

	private static String trans(String col) {
		// TODO Auto-generated method stub
		String res = "";
		int column = Integer.parseInt(col);
		while(column>26){
			res+=(char)('A'+(column%26-1));
			column/=26;
		}
		res+=(char)('A'+(column-1));
		StringBuilder sb = new StringBuilder(res);
		res = sb.reverse().toString();
		return res;
	}
}
