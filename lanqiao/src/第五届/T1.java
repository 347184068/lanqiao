package 第五届;

/**
 * 
 * 类描述： 标题：年龄巧合
 * 
 * 小明和他的表弟一起去看电影，有人问他们的年龄。小明说：今年是我们的幸运年啊。我出生年份的四位数字加起来刚好是我的年龄。表弟的也是如此。
 * 已知今年是2014年，并且，小明说的年龄指的是周岁。
 * 
 * 请推断并填写出小明的出生年份。
 * 
 * 这是一个4位整数，请通过浏览器提交答案，不要填写任何多余的内容（比如，他表弟的出生年份，或是他们的年龄等等）
 * 
 * @author: XuYunXuan
 * @date： 日期：2017年5月21日 时间：下午5:35:03
 *
 */
public class T1 {
	public static void main(String[] args) {
		for(int i = 1000 ; i < 2014 ;i++){
			int res = sum(i);
			if(res==2014-i){
				System.out.println(i);
			}
		}
	}

	private static int sum(int i) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(i!=0){
			sum+=i%10;
			i/=10;
		}
		return sum;
	}
}
