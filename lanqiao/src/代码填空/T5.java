package 代码填空;

/**
 * 	以下的静态方法实现了：把串s中第一个出现的数字的值返回。 如果找不到数字，返回-1
 * 
 * 例如： 
 * s = "abc24us43" 则返回2 
 * s = "82445adb5" 则返回8 
 * s = "ab" 则返回-1
 * 
 * @author Lenovo
 *
 */
public class T5 {
	public static void main(String[] args) {
		System.out.println(getFirstNum("asdasdasdasa1"));
	}

	public static int getFirstNum(String s) {
		if (s == null || s.length() == 0)
			return -1;

		char c = s.charAt(0);
		if (c >= '0' && c <= '9')
			return c-'0'; // 填空

		return getFirstNum(s.substring(1)); // 填空
	}
}
