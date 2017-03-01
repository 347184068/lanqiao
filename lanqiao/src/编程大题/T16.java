package 编程大题;

import java.util.Scanner;

/**
 * 四平方和定理
 * @author Lenovo
 *
 */
public class T16 {
	public static int f(int n, int a[], int idx) {
		if (n==a[0]*a[0]+a[1]*a[1]+a[2]*a[2]+a[3]*a[3])
			return 1; // 填空1
		if (idx == 4)
			return 0;

		for (int i = (int) Math.sqrt(n); i >= 1; i--) {
			a[idx] = i;

			if (f(n,a,idx+1)==1)
				return 1; // 填空2
		}

		return 0;
	}

	public static void main(String args[]) {
		for (;;) {
			Scanner in = new Scanner(System.in);
			
			int number = in.nextInt();

			int a[] = { 0, 0, 0, 0 };

			int r = f(number, a, 0);

			System.out.printf("%d: %d %d %d %d\n", r, a[0], a[1], a[2], a[3]);

		}

	}
}
