package 编程大题;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 串的处理 在实际的开发工作中，对字符串的处理是最常见的编程任务。本题目即是要求程序对用户输入的串进行处理。具体规则如下：
 *  1. 把每个单词的首字母变为大写。
 *  2. 把数字与字母之间用下划线字符（_）分开，使得更清晰
 *  3. 把单词中间有多个空格的调整为1个空格。
 * 
 * 例如： 用户输入： you and me what cpp2005program 则程序输出： You And Me What Cpp_2005_program
 * 
 * 用户输入： this is a 99cat 则程序输出： This Is A 99_cat
 * 
 * @author Lenovo
 *
 */
public class T5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String s = trans(str);
		String s2 = changeBigWrite(s);
		String s3 = add(s2);
		System.out.println(s3);
	}

	private static String add(String s2) {
		// TODO Auto-generated method stub
		char[] array = s2.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < array.length ; i++){
			if((array[i]>='a'&&array[i]<='z')||(array[i]>='A'&&array[i]<='Z')){
				if(i+1<array.length&&array[i+1]>='0'&&array[i+1]<='9'){
					sb.append(array[i]+"_");
				}else{
					sb.append(array[i]);
				}
			}else{
				if(array[i]==' '){
					sb.append(" ");
				}else{
					if(i+1<array.length&&(array[i+1]>='a'&&array[i+1]<='z')||(array[i+1]>='A'&&array[i+1]<='Z')){
						sb.append(array[i]+"_");
					}else{
						sb.append(array[i]);
					}
				}
			}
		}
		return sb.toString().trim();
	}

	private static String changeBigWrite(String s) {
		// TODO Auto-generated method stub
		String[] split = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String t :split){
			char fir = t.charAt(0);
			if(fir>='a'&&fir<='z'){
				fir = (char) (fir-32);
			}
			sb.append(fir+t.substring(1)+" ");
		}
		return sb.toString().trim();
	}

	private static String trans(String str) {
		// TODO Auto-generated method stub
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String t : split){
			if(t!=""){
				sb.append(t+" ");
			}
		}
		return sb.toString().trim();
	}
}
