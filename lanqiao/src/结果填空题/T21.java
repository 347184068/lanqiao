package 结果填空题;

/**
 * 21. 取字母组成串 A B C D中取5次，每个字母都可以重复取出，形成一个串。 
 * 现在要求，串中A出现的次数必须为偶数（0次也算偶数）。 
 * 求可以形成多少种可能的串。
 * 
 * @author Lenovo
 *
 */
public class T21 {
	//位置用没用过
	static int[] num = new int[6];
	static int[] book = new int[6];
	static int[] a = new int[5];
	static int n = 0;
	public static void main(String[] args) {
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;
		dfs(1);
		
		System.out.println(n);
	}
	private static void dfs(int step) {
		// TODO Auto-generated method stub
		if(step==6){
			int count = 0;
			for(int i =1 ; i <=5;i++){
				if(num[i]==1){
					count++;
				}
			}
			if(count%2==0){
				n++;
			}
			return;
		}
		
		for(int i = 1; i <=4 ;i++){
			if(book[step]==0){
				book[step] = 1;
				num[step] = a[i];
				dfs(step+1);
				book[step] = 0;
			}
		}
		return;
	}
}
