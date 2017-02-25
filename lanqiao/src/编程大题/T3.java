package 编程大题;

import java.util.Scanner;

/**
 * 泊松是法国数学家、物理学家和力学家。他一生致力科学事业，成果颇多。有许多著名的公式定理以他的名字命名，比如概率论中著名的泊松分布。
 * 
 * 有一次闲暇时，他提出过一个有趣的问题，后称为：“泊松分酒”。在我国古代也提出过类似问题，遗憾的是没有进行彻底探索，其中流传较多是：“韩信走马分油”问题。
 * 
 * 有3个容器，容量分别为12升，8升，5升。其中12升中装满油，另外两个空着。要求你只用3个容器操作，最后使得某个容器中正好有6升油。
 * 
 * 下面的列表是可能的操作状态记录： 12,0,0 4,8,0 4,3,5 9,3,0 9,0,3 1,8,3 1,6,5
 * 
 * 每行3个数据，分别表示12，8，6升容器中的油量
 * 
 * 第一行表示初始状态，第二行表示把12升倒入8升容器后的状态，第三行是8升倒入5升，...
 * 
 * 当然，同一个题目可能有多种不同的正确操作步骤。
 * 
 * 本题目的要求是，请你编写程序，由用户输入：各个容器的容量，开始的状态，和要求的目标油量，程序则通过计算输出一种实现的步骤（不需要找到所有可能的方法）。如果没有可能实现，则输出：“不可能”。
 * 
 * 例如，用户输入： 12,8,5,12,0,0,6
 * 
 * 用户输入的前三个数是容器容量（由大到小），接下来三个数是三个容器开始时的油量配置，最后一个数是要求得到的油量（放在哪个容器里得到都可以）
 * 
 * 则程序可以输出（答案不唯一，只验证操作可行性）： 12,0,0 4,8,0 4,3,5 9,3,0 9,0,3 1,8,3 1,6,5
 * 
 * 每一行表示一个操作过程中的油量状态。
 * 
 * @author Lenovo
 *
 */
public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String[] array = st.split(",");
		int A, B, C, a, b, c, t;
		A = Integer.parseInt(array[0]);
		B = Integer.parseInt(array[1]);
		C = Integer.parseInt(array[2]);
		a = Integer.parseInt(array[3]);
		b = Integer.parseInt(array[4]);
		c = Integer.parseInt(array[5]);
		t = Integer.parseInt(array[6]);
		Wine w = new Wine(A,B,C,t);
		w.Backtrack(a, b, c);
	}

}

class Wine {

	int b1 = 12;
	int b2 = 8;
	int b3 = 5;

	int m = 6;// 目标酒量

	public Wine() {

	}

	public Wine(int b1, int b2, int b3,int m) {
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.m = m;
	}

	public void Backtrack(int cur1, int cur2, int cur3) {
		System.out.println(cur1 + " " + cur2 + " " + cur3);
		if (cur1 == m || cur2 == m || cur3 == m) {
			return;
		}

		if (cur2 != 0 && cur3 != b3) { // 瓶子2有酒并且瓶子三不满
			if (cur2 + cur3 <= b3)
				Backtrack(cur1, 0, cur2 + cur3);
			else
				Backtrack(cur1, cur2 - (b3 - cur3), b3);

		}

		else if (cur3 == b3) { // 瓶子3满的，这时就要把就倒入到瓶子1中
			if (cur3 + cur1 <= b1)
				Backtrack(cur1 + cur3, cur2, 0);
			else
				Backtrack(b1, cur2, cur3 - (b1 - cur1));

		}

		else if (cur2 == 0) { // 当瓶子2是空的时候从瓶子1倒入酒
			if (cur1 >= b2)
				Backtrack(cur1 - b2, b2, cur3);
			else
				Backtrack(0, cur1, cur3);
		}

	}

}
