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
	
	public static void main(String[] args) {
		long sum = 0;
		String s = "bckfqlajhemgiodnp";
		for(int i = 0 ; i < s.length() ;i++){
			int count = 0;
			for(int j = i+1 ; j < s.length() ;j++){
				if(s.charAt(j)<s.charAt(i)){
					count++;
				}
			}
			sum+=count*fact(s.length()-1-i);
		}
		System.out.println(sum);
	}

	private static long fact(int n) {
		// TODO Auto-generated method stub
		long res = 1;
		for(int i =2 ; i <=n ;i++){
			res*=i;
		}
		return res;
	}
	
}
