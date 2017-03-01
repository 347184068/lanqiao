package 编程大题;

/**
 * 天干地支
 * @author Lenovo
 *
 */
public class T17 {
	public static void main(String[] args) {
		f(1911);
		f(1970);
		f(2012);
	}

	private static void f(int year) {
		// TODO Auto-generated method stub
		String x[] = {"甲","乙","丙","丁","戊","己","庚","辛","壬","癸"};
		String y[] = {"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};
		
		int n = year - 1984;
		
		while(n<0) n += 60;

		System.out.printf("%s%s\n", x[n%10], y[n%12]);
	}
}
