package 代码填空;

/**
 * 以下程序打印出0~9的数字，请补充缺少的代码。
 * @author Lenovo
 *
 */
public class T6 {

	public static void main(String[] args) {
		f(0, 9);
	}

	public static void f(int begin, int end) {
		if(begin>end) return;
		System.out.println(begin);
		f(begin + 1, end);
	}
}
