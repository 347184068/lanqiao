package 结果填空题;

/**
 * 8. 海盗比酒量
 * 
 * 有一群海盗（不多于20人），在船上比拼酒量。
 * 过程如下：打开一瓶酒，所有在场的人平分喝下，有几个人倒下了。再打开一瓶酒平分，又有倒下的，再次重复...... 直到开了第4瓶酒，
 * 坐着的已经所剩无几，海盗船长也在其中。当第4瓶酒平分喝下后，大家都倒下了。
 * 
 * 等船长醒来，发现海盗船搁浅了。
 * 他在航海日志中写到：“......昨天，我正好喝了一瓶.......奉劝大家，开船不喝酒，喝酒别开船......”
 * 
 * 请你根据这些信息，推断开始有多少人，每一轮喝下来还剩多少人没倒下。
 *  如果有多个可能的答案，请列出所有答案，每个答案占一行。 格式是：人数,人数,... 
 *  例如,有一种可能是：20,5,4,2,0 多个答案排列顺序不重要。
 * 
 * 
 * @author Lenovo
 *
 */
public class T8 {
	public static void main(String[] args) {
		for(int i = 1 ; i<= 20 ;i++){
			for(int j = 1 ; j<= 20 ;j++){
				for(int k = 1 ; k<= 20 ;k++){
					for(int z = 1 ; z<= 20 ;z++){
						if(j*k*z+k*i*z+i*j*z+i*j*k==i*j*z*k&&i>j&&j>k&&k>z){
							System.out.println(i+","+j+","+k+","+z);
						}
					}
				}
			}
		}
	}
}
