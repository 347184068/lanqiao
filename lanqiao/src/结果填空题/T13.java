package 结果填空题;

/**
 * 13. 排座位 要安排：
 * 3个A国人，3个B国人，3个C国人坐成一排。
 * 要求不能使连续的3个人是同一个国籍。 
 * 求所有不同方案的总数？
 * 
 * @author Lenovo
 *
 */
public class T13 {
	static int count = 0;
	static int arr[] = new int[10];
	static int country[] = new int[10];
	static int ischeck[] = new int[10];
	public static void main(String[] args) {
		country[1] = 1;
		country[2] = 1;
		country[3] = 1;
		country[4] = 2;
		country[5] = 2;
		country[6] = 2;
		country[7] = 3;
		country[8] = 3;
		country[9] = 3;
		dfs(1);
		System.out.println(count);
	}
	
	static void dfs(int step){
		if(step==10){
			boolean isTrue = true;
			for(int i = 1 ; i+2 <= 9 ;i++){
				if(arr[i]==arr[i+1]&&arr[i]==arr[i+2]&&arr[i+1]==arr[i+2]){
					isTrue = false;
					break;
				}
			}
			if(isTrue){
				count++;
			}
			return;
		}
		
		for(int i = 1 ; i <=9 ;i++){
			if(ischeck[i]==0){
				ischeck[i] = 1;
				arr[step] = country[i];
				dfs(step+1);
				ischeck[i] = 0;
			}
			
		}
		return;
	}
}
