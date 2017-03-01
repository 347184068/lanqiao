package 代码填空;

/**
 * 反转串
 * 
 * 我们把“cba”称为“abc”的反转串。 求一个串的反转串的方法很多。
 * 下面就是其中的一种方法，代码十分简洁（甚至有些神秘），请聪明的你通过给出的一点点线索补充缺少的代码。
 * 
 * @author Lenovo
 *
 */
public class T4 {
	public static void main(String[] args) {
		System.out.println(reverseString("abcd"));
	}
	
	public static String reverseString(String x)
	{
		if(x==null || x.length()<2) return x;
		return reverseString(x.substring(1))+x.charAt(0);
	}

}
