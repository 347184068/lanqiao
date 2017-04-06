package 编程大题;

/***
 * 
 *类描述：分块乘法
 *@author: XuYunXuan
 *@date： 日期：2017年4月6日 时间：下午5:31:18
 *
 */
public class T30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 0, 0, 0, 0 };

		bigmul(87654321, 12345678, x);

		System.out.println(x[0] + "" + x[1] + "" + x[2] + "" + x[3]);
	}

	public static void bigmul(int x, int y, int r[]) {
		int base = 10000;
		int x2 = x / base;
		int x1 = x % base;
		int y2 = y / base;
		int y1 = y % base;

		int n1 = x1 * y1;
		int n2 = x1 * y2;
		int n3 = x2 * y1;
		int n4 = x2 * y2;

		r[3] = n1 % base;
		r[2] = n1 / base + n2 % base + n3 % base;
		r[1] = n2 / base + n3 / base + n4 % base; // 填空
		r[0] = n4 / base;

		r[1] += r[2]/base; // 填空
		r[2] = r[2] % base;
		r[0] += r[1] / base;
		r[1] = r[1] % base;
	}

}
