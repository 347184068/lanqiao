package 结果填空题;

/**
 * 9. 奇怪的比赛
 * 
 * 某电视台举办了低碳生活大奖赛。题目的计分规则相当奇怪：
 *  每位选手需要回答10个问题（其编号为1到10），越后面越有难度。
 *  答对的，当前分数翻倍；答错了则扣掉与题号相同的分数（选手必须回答问题，不回答按错误处理）。 
 *  每位选手都有一个起步的分数为10分。 
 *  某获胜选手最终得分刚好是100分，如果不让你看比赛过程，你能推断出他（她）哪个题目答对了，哪个题目答错了吗？ 
 *  如果把答对的记为1，答错的记为0，则10个题目的回答情况可以用仅含有1和0的串来表示。
 *  例如：0010110011 就是可能的情况。 
 *  你的任务是算出所有可能情况。每个答案占一行。 多个答案顺序不重要。
 * 
 * 答案写在“解答.txt”中，不要写在这里！
 * 
 * @author Lenovo
 *
 */
public class T9 {
	static int a[] = new int[10];
	static int getSum(int[] a) {
	    int sum = 10;
	    for (int i = 0; i < 10; i++) {
	        if (a[i] > 0) {
	            sum *= 2;
	        } else {
	            sum -= (i+1);
	        }
	    }
	    return sum;
	}
	static void dfs(int n) {
	    if (n >= 10) {
	        if (getSum(a) == 100) {
	            for (int i = 0; i < 10; i++) {
	                System.out.print(a[i]);
	            }
	            System.out.println();
	        }
	        return;
	    }
	    for (int i = 0; i <= 1; i++) {
	        a[n] = i;
	        dfs(n+1);
	    }
	}
	public static void main(String[] args) {
		dfs(0);
	}
}
