package 编程大题;

public class T28 {
	/**
	 * 
	 * 方法描述：3.排列序数
	 * 
	 * X星系的某次考古活动发现了史前智能痕迹。 这是一些用来计数的符号，经过分析它的计数规律如下： （为了表示方便，我们把这些奇怪的符号用a~q代替）
	 * 
	 * abcdefghijklmnopq 表示0 
	 * abcdefghijklmnoqp 表示1 
	 * abcdefghijklmnpoq 表示2 
	 * abcdefghijklmnpqo 表示3 
	 * abcdefghijklmnqop 表示4 
	 * abcdefghijklmnqpo 表示5 
	 * abcdefghijklmonpq 表示6 
	 * abcdefghijklmonqp 表示7 .....
	 * 
	 * 在一处石头上刻的符号是： bckfqlajhemgiodnp
	 * 
	 * 请你计算出它表示的数字是多少？
	 *
	 * @author: XuYunXuan
	 * @date： 日期：2017年4月5日 时间：下午7:14:57
	 *
	 */
	static char[] c;
	static int[] book;
	static long count = 0;
	public static void main(String[] args) {
		c = new char[17];
		book = new int[17];
		dfs(0);
	}
	private static void dfs(int step) {
		// TODO Auto-generated method stub
		if(step==17){
			String s = "";
			for(char cha : c){
				s+=cha;
			}
			if(s.equals("bckfqlajhemgiodnp")){
				System.out.println(count);
			}
			count++;
			return;
		}
		
		
		for(char ch = 'a' ;  ch<='q' ;ch++){
			if(book[ch-'a']==0){
				book[ch-'a'] = 1;
				c[step] = ch;
				dfs(step+1);
				book[ch-'a'] = 0;
			}
		}
		
		
		return;
		
	}
}
