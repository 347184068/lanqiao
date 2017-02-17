package 结果填空题;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 14. 黄金队列
 * 
 * 黄金分割数0.618与美学有重要的关系。舞台上报幕员所站的位置大约就是舞台宽度的0.618处，
 * 墙上的画像一般也挂在房间高度的0.618处， 甚至股票的波动据说也能找到0.618的影子.... 
 * 黄金分割数是个无理数，也就是无法表示为两个整数的比值。 0.618只是它的近似值，其真值可以通过对5开方减去1再除以2来获得， 
 * 我们取它的一个较精确的近似值：0.618034 有趣的是，一些简单的数列中也会包含这个无理数， 
 * 这很令数学家震惊！ 1 3 4 7 11 18 29 47 .... 称为“鲁卡斯队列”。 
 * 它后面的每一个项都是前边两项的和。 如果观察前后两项的比值，即：1/3,3/4,4/7,7/11,11/18 ... 会
 * 发现它越来越接近于黄金分割数！ 你的任务就是计算出从哪一项开始，这个比值四舍五入后已经达到了与0.618034一致的精度。 请 写出该比值。格式是：分子/分母。比如：29/47
 * 
 * @author Lenovo
 *
 */
public class T14 {
	public static void main(String[] args) {
		BigDecimal arr[] = new BigDecimal[100000];
		arr[0] = BigDecimal.valueOf(1);
		arr[1] = BigDecimal.valueOf(3);
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1].add(arr[i - 2]);
		}
		for (int i = 1; i + 1 < arr.length; i++) {
			if(arr[i].divide(arr[i + 1],6,RoundingMode.HALF_UP).equals(BigDecimal.valueOf(0.618034))){
				System.out.println(arr[i]+","+arr[i+1]);
				break;
			}
		}
	}
}
