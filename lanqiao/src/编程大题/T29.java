package 编程大题;

import java.util.Arrays;

public class T29 {
	public static void main(String[] args) {
		int arr[] = new int[16];
		invKT(arr,15,1);
		System.out.println(Arrays.toString(arr));
	}

	private static void kT() {
		long sum = 0;
		String s = "bckfqlajhemgiodnp";

		for (int i = 0; i < s.length(); i++) {
			long count = 0;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) < s.charAt(i))
					count++;
			}
			sum = sum + count * fact(s.length() - 1 - i);// 康托展开式公式
		}
		System.out.println(sum);
	}

	static long fact(long n) {
		long i, s = 1;
		for (i = 2; i <= n; i++)
			s *= i;
		return s;
	}
	
	// n为lsit大小，k为全排列的编码
	public static void invKT(int list[], int n, int k) {
		boolean vis[] = new boolean[18];
		int i, j, t;
		k--;// 全排列序号从1开始
		for (i = 0; i < n; i++) {
			t = (int) (k / fact(n - 1 - i));
			for (j = 1; j <= n; j++) {
				if (!vis[j]) {
					if (t == 0)
						break;
					t--;
				}
			}
			list[i] = j;
			vis[j] = true;
			k %= fact(n - 1 - i);
		}
	}
}
