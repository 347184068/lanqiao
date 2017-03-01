package 代码填空;

/**
 * 代码的目标：判断一个串是否为某个基本串的简单复制构成的。
 * 
 * 例如： abcabcabc， 它由“abc”复制3次构成， 则程序输出：abc aa 由“a”复制两次构成， 则程序输出：a axa 不是简单复制构成，则不输出任何信息 aaxx 也不是仅仅由简单复制构成，不输出信息。
 * 
 * 请阅读下面的代码，填写缺失的部分（下划线部分）
 * 
 * @author Lenovo
 *
 */
public class T7 {
	public static void findRepeat(String x) {
		for (int i = 1; i <= x.length() / 2; i++) {
			String base = x.substring(0, i);
			int p = i;
			for (;;) {
				if (p + i > x.length())
					break;
				if (x.substring(p, p + i).equals(base) == false)
					break;
				p += i; // 填空1
			}

			if (p == x.length()) // 填空2
			{
				System.out.println(base);
				break;
			}
		}
	}

	public static void main(String[] args) {
		findRepeat("IhaveagoodideaIhaveagoodideaIhaveagoodidea");
	}
}
