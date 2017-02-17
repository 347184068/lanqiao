package 结果填空题;

import java.math.BigInteger;

/**
 * 17. 棋盘上的麦子
 * 
 * 你一定听说过这个故事。国王对发明国际象棋的大臣很佩服，
 * 问他要什么报酬，大臣说：请在第1个棋盘格放1粒麦子，在第2个棋盘格放2粒麦子，在第3个棋盘格放4粒麦子，在第4个棋盘格放8粒麦子，
 * ......后一格的数字是前一格的两倍，直到放完所有棋盘格（国际象棋共有64格）。
 *  国王以为他只是想要一袋麦子而已，哈哈大笑。 
 *  当时的条件下无法准确计算，但估算结果令人吃惊：即使全世界都铺满麦子也不够用！ 
 *  请你借助计算机准确地计算，到底需要多少粒麦子。
 * 
 * @author Lenovo
 *
 */
public class T17 {
	public static void main(String[] args) {
		System.out.println(BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE));
	}
}
