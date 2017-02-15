package 第六届;

/**
 * 标题：五星填数

	如【T2.png】的五星图案节点填上数字：1~12，除去7和11。
	要求每条直线上数字和相等。
	
	如图就是恰当的填法。
	
	请你利用计算机搜索所有可能的填法有多少种。
	注意：旋转或镜像后相同的算同一种填法。
	12
	
	请提交表示方案数目的整数，不要填写任何其它内容。
 * @author Lenovo
 *
 */
public class T2 {
	static int count=0;
	static int arr[] = {1,2,3,4,5,6,8,9,10,12};
	static boolean book[] = new boolean[10]; 
	static int a[] = new int[10]; 
	public static void main(String[] args) {
		dfs(0);
		System.out.println(count);
	}
	
	public static void dfs(int step){
		if(step==10) {
			int s1 = a[0]+a[1]+a[2]+a[3];
			int s2 = a[8]+a[1]+a[7]+a[6];
			int s3 = a[8]+a[2]+a[4]+a[9];
			int s4 = a[0]+a[7]+a[5]+a[9];
			int s5 = a[3]+a[4]+a[5]+a[6];
			if(s1==s2&&s2==s3&&s3==s4&&s4==s5){
				count++;
			}
			return;
		}
		
		for(int i =  0; i < arr.length ;i++){
			if(!book[i]){
				book[i] = true;
				a[step] = arr[i];
				dfs(step+1);
				book[i] = false;
			}
		}
	}
}
