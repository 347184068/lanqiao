package 第四届;

import java.util.Arrays;

public class T3 {
	public static void main(String[] args) {
		int x[] = new int[]{3,5,6,4,8,9,16,6,1,2};
		f(x,0,x.length-1);
		System.out.println(Arrays.toString(x));
	}

	static void f(int[] x, int left, int right) {
		if (left >= right)
			return;

		int key = x[(left + right) / 2];

		int li = left;
		int ri = right;
		while (li <= ri) {
			while (x[ri] > key)
				ri--;
			while (x[li] < key)
				li++;

			if (x[ri]<=x[li]) { // 填空位置
				int t = x[li];
				x[li] = x[ri];
				x[ri] = t;
				li++;
				ri--;
			}
		}

		if (li < right)
			f(x, li, right);
		if (ri > left)
			f(x, left, ri);
	}
}
