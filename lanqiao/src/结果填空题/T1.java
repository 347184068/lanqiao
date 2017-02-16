package 结果填空题;

/**
 * 1. 空瓶换汽水 浪费可耻，节约光荣。饮料店节日搞活动：不用付费，用3个某饮料的空瓶就可以换一瓶该饮料。
 * 刚好小明前两天买了2瓶该饮料喝完了，瓶子还在。他耍了个小聪明，向老板借了一个空瓶，凑成3个，换了一瓶该饮料，喝完还瓶！！ 
 * 饮料店老板一统计，已经售出该饮料且未还瓶的有12345瓶，那么如果这些饮料的买主都如小明一样聪明，老板最多还需要送出多少瓶饮料呢？ 
 * 显然答案是个正整数。
 * 
 * @author Lenovo
 *
 */
public class T1 {
	public static void main(String[] args) {
		int total = 0;
		int count = 12345;
		while(count>=3){
			total+=count/3;
			count/=3;
			if(count<3) break;
			count+=count%3;
		}
		System.out.println(total);
	}
}
