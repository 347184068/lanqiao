package 编程大题;

/**
 * 看下面的算式：
 * 
 * □□ x □□ = □□ x □□□
 * 
 * 它表示：两个两位数相乘等于一个两位数乘以一个三位数。
 * 
 * 如果没有限定条件，这样的例子很多。
 * 
 * 但目前的限定是：这9个方块，表示1~9的9个数字，不包含0。 该算式中1至9的每个数字出现且只出现一次！
 * 
 * 比如： 46 x 79 = 23 x 158 54 x 69 = 27 x 138 54 x 93 = 27 x 186 .....
 * 
 * 请编程，输出所有可能的情况！
 * 
 * 注意： 左边的两个乘数交换算同一方案，不要重复输出！ 不同方案的输出顺序不重要
 * 
 * @author Lenovo
 *
 */
public class T4 {

	static int a[] = new int[10];
	static int book[] = new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(1);
	}
	private static void dfs(int step) {
		// TODO Auto-generated method stub
		if(step==10){
			if((a[1]*10+a[2])<(a[3]*10+a[4])){
				if((a[1]*10+a[2])*(a[3]*10+a[4])==(a[5]*10+a[6])*(a[7]*100+a[8]*10+a[9])){
					System.out.println((a[1]*10+a[2])+"*"+(a[3]*10+a[4])+"="+(a[5]*10+a[6])+"*"+(a[7]*100+a[8]*10+a[9]));
				}
			}
			return;
		}
		
		for(int i = 1 ; i <= 9;i++){
			if(book[i]==0){
				book[i] = 1;
				a[step] = i;
				dfs(step+1);
				book[i] = 0;
			}
		}
		return;
	}
	
	

}
