package 第四届;

/**
 * 
 * 类描述：
 *
 * 标题：猜灯谜
 * 
 * A 村的元宵节灯会上有一迷题：
 * 
 * 请猜谜 * 请猜谜 = 请边赏灯边猜
 * 
 * 小明想，一定是每个汉字代表一个数字，不同的汉字代表不同的数字。
 * 
 * 请你用计算机按小明的思路算一下，然后提交“请猜谜”三个字所代表的整数即可。
 * 
 * 请严格按照格式，通过浏览器提交答案。 注意：只提交一个3位的整数，不要写其它附加内容，比如：说明性的文字。
 *
 * @author: XuYunXuan
 * @date： 日期：2017年5月20日 时间：上午9:04:47
 *
 */
public class T1 {
	public static void main(String[] args) {
		for(int a1 = 1 ; a1<=9 ;a1++){
			for(int a2 = 0 ; a2<=9 ;a2++){
				for(int a3 = 0 ; a3<=9 ;a3++){
					for(int a4 = 0 ; a4<=9 ;a4++){
						for(int a5 = 0 ; a5<=9 ;a5++){
							for(int a6 = 0 ; a6<=9 ;a6++){
								int a = a1*100+a2*10+a3;
								int right = a1*100000+a4*10000+a5*1000+a6*100+a4*10+a2;
								if(a*a==right){
									System.out.println(a);
								}
							}
						}
					}
				}
			}
		}
	}
}
