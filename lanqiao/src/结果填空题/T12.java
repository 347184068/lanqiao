package 结果填空题;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

/**
 * 12. 巧排扑克牌 
 * 小明刚上小学，学会了第一个扑克牌“魔术”，到处给人表演。魔术的内容是这样的： 
 * 他手里握着一叠扑克牌：A，2，....J，Q，K 一共13张。他先自己精心设计它们的顺序，然后正面朝下拿着，开始表演。 
 * 只见他先从最下面拿一张放到最上面，再从最下面拿一张翻开放桌子上，是A；
 * 然后再从最下面拿一张放到最上面，再从最下面拿一张翻开放桌子上，是2；......
 * 如此循环直到手中只有一张牌，翻开放桌子上，刚好是K。 
 * 这时，桌上牌的顺序是：A,2,3,4,5,6,7,8,9,10,J,Q,K 
 * 请你计算一下，小明最开始的时候手里牌的顺序是怎样的。 
 * 把结果写出来，逗号分割，小明“魔术”开始时，最下面的那张牌输出为第一个数据。 
 * 考场不提供扑克牌，你只能用计算机模拟了，撕碎草稿纸模拟扑克属于作弊行为！另外，你有没有把录像倒着放过？很有趣的！回去试试！
 * 逆：拿一张放到最下面，当前最上面那一张放到最下面
 * @author Lenovo
 *
 */
public class T12 {
	//将放在桌子上的牌放在牌堆最下面，将牌堆的最上面一张放在最下面
	//[10, 6, 13, 5, 9, 4, 11, 3, 8, 2, 12, 1, 7]
	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<Integer>();
		for(int i=13 ; i>=1 ;i--){
			d.add(i);
			d.add(d.pollFirst());
		}
		System.out.println(Arrays.toString(d.toArray()));
	}
}
