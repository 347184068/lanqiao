package 结果填空题;

/**
 * 20. 填写算式
 * 
 * 看这个算式： 
 * ☆☆☆ + ☆☆☆ = ☆☆☆ 如果每个五角星代表 1 ~ 9 的不同的数字。 
 * 这个算式有多少种可能的正确填写方法？
 *  173 + 286 = 459 
 *  295 + 173 = 468 
 *  173 + 295 = 468 
 *  183 + 492 = 675 
 *  以上都是正确的填写法！
 *  注意： 111 + 222 = 333 是错误的填写法！ 
 *  因为每个数字必须是不同的！ 
 *  也就是说：1~9中的所有数字，每个必须出现且仅出现一次！ 
 *  注意： 不包括数字“0”！ 
 *  注意： 满足加法交换率的式子算两种不同的答案。 所以答案肯定是个偶数！
 * 
 * @author Lenovo
 *
 */
public class T20 {
	static int a[] = new int[10];
	static int book[] = new int[10];
	static int count= 0;
	public static void main(String[] args) {
		dfs(1);
		System.out.println(count);
	}
	
	public static void dfs(int step){
		if(step==10){
			if((a[1]*100+a[2]*10+a[3])+(a[4]*100+a[5]*10+a[6])==(a[7]*100+a[8]*10+a[9])){
				count++;
			}
			return;
		}
		for(int i =1 ; i <= 9 ; i++){
			if(book[i]==0){
				book[i] = 1;
				a[step] = i;
				dfs(step+1);
				book[i] = 0;
			}
		}
		return;
	
	}
}
