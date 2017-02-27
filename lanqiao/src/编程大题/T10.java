package 编程大题;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 考虑方程式：a^3 + b^3 = c^3 + d^3 其中：“^”表示乘方。
 * a、b、c、d是互不相同的小于30的正整数。 
 * 这个方程有很多解。
 * 比如： a = 1，b=12，c=9，d=10 就是一个解。
 * 因为：1的立方加12的立方等于1729，而9的立方加10的立方也等于1729。 
 * 当然，a=12，b=1，c=9，d=10 显然也是解。 如果不计abcd交换次序的情况，这算同一个解。 
 * 你的任务是：找到所有小于30的不同的正整数解。把a b c d按从小到大排列，用逗号分隔，每个解占用1行。
 * 比如，刚才的解输出为： 1,9,10,12
 * 
 * 不同解间的顺序可以不考虑。
 * 
 * @author Lenovo
 *
 */
public class T10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		for(int a = 1 ; a < 30;a++){
			for(int b = 1 ; b < 30;b++){
				for(int c = 1 ; c < 30;c++){
					for(int d = 1 ; d < 30;d++){
						if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d){
							if(Math.pow(a, 3)+Math.pow(b, 3)==Math.pow(c, 3)+Math.pow(d, 3)){
								arr[0] = a;
								arr[1] = b;
								arr[2] = c;
								arr[3] = d;
								Arrays.sort(arr);
								System.out.println(Arrays.toString(arr));
							}
						}
					}
				}
			}
		}
	}

}
